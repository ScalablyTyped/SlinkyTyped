package typingsSlinky.iabVpaid.iab.vpaid

import typingsSlinky.iabVpaid.iabVpaidStrings.AdDurationChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdExpandedChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdImpression
import typingsSlinky.iabVpaid.iabVpaidStrings.AdLinearChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdLoaded
import typingsSlinky.iabVpaid.iabVpaidStrings.AdPaused
import typingsSlinky.iabVpaid.iabVpaidStrings.AdPlaying
import typingsSlinky.iabVpaid.iabVpaidStrings.AdRemainingTimeChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdSizeChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdSkippableStateChange
import typingsSlinky.iabVpaid.iabVpaidStrings.AdSkipped
import typingsSlinky.iabVpaid.iabVpaidStrings.AdStarted
import typingsSlinky.iabVpaid.iabVpaidStrings.AdStopped
import typingsSlinky.iabVpaid.iabVpaidStrings.AdUserAcceptInvitation
import typingsSlinky.iabVpaid.iabVpaidStrings.AdUserClose
import typingsSlinky.iabVpaid.iabVpaidStrings.AdUserMinimize
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVideoComplete
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVideoFirstQuartile
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVideoMidpoint
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVideoStart
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVideoThirdQuartile
import typingsSlinky.iabVpaid.iabVpaidStrings.AdVolumeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vpaid API reference: https://www.iab.com/wp-content/uploads/2015/06/VPAID_2_0_Final_04-10-2012.pdf
  */
@js.native
trait VpaidCreative extends js.Object {
  
  /**
    * When the ad unit is in an expanded state, the video player may call `collapseAd()` to prompt
    * the ad unit to retract any extended ad space. The ad unit responds by setting the `adExpanded`
    * property to `false` and dispatching the `AdExpandedChange` event, to confirm that the `collapseAd()`
    * call caused a change in behavior or appearance of the ad.
    *
    * The video player can verify that the ad unit is in an expanded state by checking the value
    * of the `adExpanded` property at any time. The ad unit responds by restoring ad dimensions to
    * its smallest width and height settings and setting its `adExpanded` property to `false`.
    *
    * The expectation is that the smallest UI size should have the least visible impact on the user,
    * for best user-experience. Therefore, if the ad unit has multiple collapsed states, such as a
    * minimized “pill” and a larger click to video banner state (see `expandAd()` for more details),
    * then the `collapseAd()` call should result in the minimized “pill” state. Ad designers should
    * condider implementing both collapsed states in all of their video ads for best user-experience.
    * However, only one collapsed state is required
    */
  def collapseAd(): Unit = js.native
  
  /**
    * The video player calls `expandAd()` when the timing is appropriate for an expandable ad unit
    * to play at additional interactive ad space, such as an expanding panel. The video player may
    * use this call when it provides an “Expand” button that calls `expandAd()` when clicked.
    * The ad unit responds by setting the `adExpanded` property to `true` and dispatching the
    * `AdExpandedChange` event, to confirm that the `expandAd()` call caused a change in behavior or
    * appearance of the ad.
    */
  def expandAd(): Unit = js.native
  
  /**
    * The `adCompanions` property is new to VPAID 2.0.
    *
    * Companion banners are ads that display outside the video player area to reinforce the messaging
    * provided in the video ad unit. In some cases, a VPAID ad unit may request ads from other ad
    * servers after `initAd()` has been called, and makes a decision about which ad it will display,
    * which may or may not include ad companions. For example, a client-side yield management SDK
    * may wrap itself in a VPAID ad when a native SDK integration might be cumbersome. In this scenario,
    * the ad server that served the initial VAST response may not know which ad will be displayed,
    * and therefore the VAST response itself does not include ad companions.
    *
    * VPAID 2.0 enables an ad server to serve a VAST response which has no companions, but which does
    * have a VPAID ad unit that pulls in ad companions dynamically based on the ad-serving situation.
    * The video player can then check the VPAID ad unit for ad companions when the VAST response has none.
    *
    * The video player is not required to poll this property, and because ad companion information
    * from the VAST response takes precedence over VPAID ad companions, the video player should only
    * access this property when the VAST response is absent of any ad companions.
    *
    * The value of this property is a String that provides ad companion details in VAST 3.0 format
    * for the `<CompanionAds>` element, and should contain all the media files and details for displaying
    * the ad companions (i.e. the format should be of an InLine response and not in Wrapper format).
    * Also, the value should only include details within the `<CompanionAds>` element and not an entire
    * VAST response. If any XML elements are included outside of the `<CompanionAds>` element, they
    * must be ignored, including any `<Impression>` elements that might have been included. However,
    * VAST companion ad `<TrackingEvents>` elements for `<Tracking event=”creativeView”>` must be respected.
    *
    * If the video player calls for `adCompanions()`, it must wait until after receiving the VPAID
    * `AdLoaded` event, and any companions provided must not display until after the VPAID `AdImpression`
    * event is received. Delaying companion display until after the `AdImpression` event prevents display
    * of any companion banners in the case where the video ad fails to regis ter an impression.
    *
    * If this property is used but no `Companions` are available the property should return an empty string “”.
    *
    * Example of a basic `<CompanionAds>` element from VAST as it may be passed in the VPAID
    * adCompanions property:
    * ```
    * <CompanionAds>
    *     <Companion>
    *         <StaticResource type=”image/jpg”>
    *             <![CDATA[http://AdServer.com/120x60companion.jpg]>
    *         </StaticResource>
    *         <TrackingEvents>
    *             <Tracking event=creativeView>
    *                 <![CDATA[http://AdServer.com/creativeview.jpg]>
    *             </Tracking>
    *         </TrackingEvents>
    *     </Companion>
    * </CompanionAds>
    * ```
    */
  def getAdCompanions(): String = js.native
  
  /**
    * The `adDuration` property is new to VPAID 2.0.
    *
    * An ad unit may provide the `adDuration` property to indicate the total duration of the ad,
    * relative to the current state of the ad unit. When user interaction changes the total duration
    * of the ad, the ad unit should update this property and send the `adDurationChange` event.
    * The initial value for `adDuration` is the expected duration before any user interaction.
    *
    * The video player may check the `adDuration` property at any time, but should always check it
    * when receiving an `adDurationChange` event.
    *
    * If duration is not implemented, the ad unit returns a -1 value. If the duration is unknown,
    * the ad unit returns a -2. Unknown duration is typical when the user has engaged the ad.
    */
  def getAdDuration(): Double = js.native
  
  /**
    * The `adExpanded` Boolean value indicates whether the ad unit is in a state where additional
    * portions it occupies more UI area than its smallest area. If the ad unit has multiple collapsed
    * states, all collapsed states show `adExpanded` being `false`. There can only be one expanded state
    * for the creative, which for a non-linear ad is usually the largest possible size for the ad unit
    * and may include a linear mode of operation (though setting `adExpanded` to `true` does NOT imply
    * that the ad unit is in linear mode).
    *
    * Specifically, a non-linear ad can support one or more collapsed sizes that allow users to view
    * video content reasonably unimpeded. One example of a larger collapsed state is where a nonlinear
    * overaly typically displays across the lower fifth of the video display area. A secondary,
    * smaller collapsed state, often called a "pill" state, might display as a small overlay button
    * with a visible call-to-action.
    *
    * The video player can check the `adExpanded` property at any time. Use the `AdExpandedChange` event
    * to indicate that the expanded state has changed. If ad is statically sized `adExpanded` is set
    * to `false`.
    *
    * @returns If the ad is in expanded mode
    */
  def getAdExpanded(): Boolean = js.native
  
  /**
    * The `adHeight` property is new to VPAID 2.0.
    *
    * The `adHeight` property provides the ad’s height in pixels and is updated along with the `adWidth`
    * property anytime the `AdSizeChange` event is sent to the video player, usually after the video
    * player calls `resizeAd()`. The ad unit may change its size to width and height values equal to
    * or less than the values provided by the video player in the Width and Height parameters of
    * the `resizeAd()` method. If the ViewMode parameter in the `resizeAd()` call is set to “fullscreen”
    * then the ad unit can ignore the Width and Height values of the video player and resize to
    * any dimension. The video player may use `adWidth` and `adHeight` values to verify that the ad is
    * appropriately sized.
    *
    * **Note:** `adHeight` values may be different than `resizeAd()` values. The value for the `adHeight` property
    * may be different from the height value that the video player supplies when it calls `resizeAd()`.
    * The `resizeAd()` method provides the video player’s maximum allowed value for height, but the
    * `adHeight` property provides the ad’s actual height, which must be equal to or less than the video
    * player’s supplied height.
    *
    * @returns The actual height of the ad
    */
  def getAdHeight(): Double = js.native
  
  /**
    * The `adIcons` property is new to VPAID 2.0.
    *
    * Several initiatives in the advertising industry involve using an icon that overlays on top
    * of an ad creative to provide some extended functionality such as to communicate with consumers
    * or otherwise fulfill requirements of a specific initiative. Often this icon and its functionality
    * may be provided by a vendor, and is not necessarily served by the ad server or included in
    * the creative itself.
    *
    * One example of icon use is for compliance to certain Digital Advertising Alliance (DAA)
    * self-regulatory principles for Online Behavioral A dvertising (OBA). If you would like more
    * information about the OBA Self Regulation program, please visit http://www.aboutads.info.
    *
    * The video player can use the `adIcons` property to avoid displaying duplicate icons over any
    * icons that might be provided in the ad unit. Until the industry provides more guidance on
    * how to pass metadata using common ad-serving protocols, this property is limited to a Boolean
    * response. The default value is `False`. If one or more ad icons are present within the ad,
    * the value returned is `True`. When set to `True`, the video player should not display any ad
    * icons of its own.
    */
  def getAdIcons(): Boolean = js.native
  
  /**
    * The `adLinear` Boolean indicates whether the ad unit is in a linear (`true`) or non-linear (`false`)
    * mode of operation. The `adLinear` property should only be accessed after the ad unit has dispatched
    * the AdLoaded event or after an `AdLinearChange` event.
    *
    * The `adLinear` property affects the state of video content. When set to `true`, the video player
    * pauses video content. If set to `true` initially and the ad unit is designated as a pre-roll
    * (defined externally), the video player may choose to delay loading video content until ad
    * playback is nearly complete.
    *
    * @returns The ad linearity: `true` for linear and `false` for non-linear
    */
  def getAdLinear(): Boolean = js.native
  
  /**
    * The video player may use the `adRemainingTime` property to update player UI during ad playback,
    * such as displaying a playback counter or other ad duration indicator. The `adRemainingTime`
    * property is provided in seconds and is relative to the total duration value provided in the
    * `adDuration` property.
    *
    * The video player may check the `adRemainingTime` property at any time, but should always check
    * it when receiving an AdRemainingTimeChange (in VPAID 1.0) or `adDurationChange` event
    * (in VPAID 2.0). The ad unit should update this property to be current within one second of
    * actual remain time and can be updated once per second during normal playback or up to four
    * times per second (to maintain optimum performance) so that the video player can keep its UI
    * in synch with actual time remaining.
    *
    * If the property is not implemented, the ad unit returns a value of -1. A value of -2 is
    * returned when time remaining is unknown. Unknown remaining time usually indicates that a
    * user is actively engaged with the ad.
    *
    * @returns The remaining time in seconds
    */
  def getAdRemainingTime(): Double = js.native
  
  /**
    * The `adSkippableState` property is new to VPAID 2.0.
    *
    * Common to skippable ads is a timeframe for when they’re allowed to be skipped. For example,
    * some ads may only be skipped a few seconds after the ad has started or may not allow the ad
    * to be skipped as it nears the end of playback.
    *
    * The `adSkippableState` enables advertisers and publishers to align their metrics based on what
    * can and cannot be skipped.
    *
    * The default value for this property is `false`. When the ad reaches a point where it can be
    * skipped, the ad unit updates this property to `true` and sends the `AdSkippableStateChange` event.
    * The video player can check this property at any time, but should always check it when the
    * `AdSkippableStateChange` event is received
    *
    * @returns If the ad is skippable
    */
  def getAdSkippableState(): Boolean = js.native
  
  /**
    * The video player uses the `adVolume` property to request the current value for ad volume (get).
    * The `adVolume` value is between 0 and 1 and is linear, where 0 is mute and 1 is maximum volume.
    * If volume is not implemented as part of the ad unit, -1 is returned.
    *
    * @returns The ad volume between 0 and 1
    */
  def getAdVolume(): Double = js.native
  
  /**
    * The `adWidth` property is new to VPAID 2.0.
    *
    * The `adWidth` property provides the ad’s width in pixels and is updated along with the `adHeight`
    * property anytime the `AdSizeChange` event is sent to the video player, usually after the video
    * player calls `resizeAd()`. The ad unit may change its size to width and height values e qual to
    * or less than the values provided by the video player in the Width and Height parameters of
    * the `resizeAd()` method. If the ViewMode parameter in the `resizeAd()` call is set to “fullscreen”
    * then the ad unit can ignore the Width and Height values of th e video player and resize to
    * any dimension. The video player may use `adWidth` and `adHeight` values to verify that the ad is
    * appropriately sized.
    *
    * **Note:** `adWidth` value may be different than `resizeAd()` values. The value for the `adWidth` property
    * may be different from the width value that the video player supplies when it calls `resizeAd()`.
    * The `resizeAd()` method provides the video player’s maximum allowed value for width, but the
    * `adWidth` property provides the ad’s actual width, which must be equal to or less than the video
    * player’s supplied width.
    *
    * @returns The actual width of the ad
    */
  def getAdWidth(): Double = js.native
  
  /**
    * The video player calls `handshakeVersion` immediately after loading the ad unit to indicate to
    * the ad unit that VPAID will be used. The video player passes in its latest VPAID version string.
    * The ad unit returns a version string minimally set to “1.0”, and of the form “major.minor.patch”
    * (i.e. “2.1.05”). The video player must verify that it supports the particular version of
    * VPAID or cancel the ad.
    *
    * @param playerVPAIDVersion The player latest VPAID version
    * @returns The proposed VPAID version
    */
  def handshakeVersion(playerVPAIDVersion: String): String = js.native
  
  def initAd(
    width: Double,
    height: Double,
    viewMode: ViewMode,
    desiredBitrate: Double,
    creativeData: js.UndefOr[scala.Nothing],
    environmentVars: EnvironmentVars
  ): Unit = js.native
  def initAd(
    width: Double,
    height: Double,
    viewMode: ViewMode,
    desiredBitrate: Double,
    creativeData: Null,
    environmentVars: EnvironmentVars
  ): Unit = js.native
  /**
    * After the ad unit is loaded and the video player calls `handshakeVersion`, the video player
    * calls `initAd()` to initialize the ad experience. The video player may preload the ad unit and
    * delay calling `initAd()` until nearing the ad playback time; however, the ad unit does not load
    * its assets until `initAd()` is called. Once the ad unit’s assets are loaded, the ad unit sends
    * the `AdLoaded` event to notify the video player that it is ready for display. Receiving the
    * `AdLoaded` response indicates that the ad unit has verified that all files are ready to execute.
    *
    * @param width indicates the available ad display area width in pixels
    * @param height indicates the available ad display area height in pixels
    * @param viewMode indicates either “normal”, “thumbnail”, or “fullscreen” as the view mode
    *                 for the video player as defined by the publisher. Default is “normal”
    * @param desiredBitrate indicates the desired bitrate as number for kilobits per second (kbps).
    *                       The ad unit may use this information to select appropriate bitrate for
    *                       any streaming content
    * @param creativeData (optional) used for additional initialization data. In a VAST context,
    *                     the ad unit should pass the value for either the Linear or Nonlinear
    *                     AdParameter element specified in the VAST document.
    * @param environmentVars used for passing implementation-specific runtime variables.
    *                        Refer to the language specific API description for more details
    */
  def initAd(
    width: Double,
    height: Double,
    viewMode: ViewMode,
    desiredBitrate: Double,
    creativeData: CreativeData,
    environmentVars: EnvironmentVars
  ): Unit = js.native
  
  /**
    * The video player calls `pauseAd()` to prompt the ad unit to pause ad display. The ad unit
    * responds by suspending any audio, animation or video and then sending the AdPaused event.
    * Instead of simply stopping animation and perhaps dimming display brightness, the ad unit may
    * choose to remove UI elements. Once `AdPaused` is sent, the video player may hide the ad by
    * adjusting the visibility setting for the display container. If the video player does not
    * receive the `AdPaused` event after a `pauseAd()` call, then either the ad unit cannot be paused
    * or it failed to send the AdPaused event. In either case, the video player should treat the
    * lack of response as a failed attempt to pause the ad.
    */
  def pauseAd(): Unit = js.native
  
  /**
    * The `resizeAd()` method is only called when the video player changes the width and height of
    * the video content container, which prompts the ad unit to scale or reposition. The ad unit
    * then resizes itself to a width and height that is equal to or less than the width and height
    * supplied by the video player. Once resized, the ad unit writes updated dimensions to the
    * `adWidth` and `adHeight` properties and sends the `AdSizeChange` event to confirm that it has
    * resized itself.
    *
    * Calling `resizeAd()` is solely for prompting the ad to scale or reposition. Use `expandAd()` to
    * prompt the ad unit to extend additional creative space.
    *
    * In fullscreen mode, the ad unit can ignore width/height parameters and resize to any dimension.
    *
    * @param Width The maximum width allotted for the ad
    * @param Height The maximum height allotted for the ad
    * @param ViewMode Can be one of “normal” “thumbnail” or “fullscreen” to indicate the mode to
    *                 which the video player is resizing. Width and height are not required when
    *                 viewmode is fullscreen.
    */
  def resizeAd(width: Double, height: Double, viewMode: ViewMode): Unit = js.native
  
  /**
    * Following a call to `pauseAd()`, the video player calls `resumeAd()` to continue ad playback.
    * The ad unit responds by resuming playback and sending the `AdPlaying` event to confirm.
    * If the video player does not receive the `AdPlaying` event after a `resumeAd()` call, then either
    * the ad unit cannot resume play or it failed to send the `AdPlaying` event. In either case,
    * the video player should treat the lack of response as a failed attempt to initiate resumed
    * playback of the ad.
    */
  def resumeAd(): Unit = js.native
  
  /**
    * The video player uses the `adVolume` property to change the value of the ad unit’s volume (set).
    * The `adVolume` value is between 0 and 1 and is linear, where 0 is mute and 1 is maximum volume.
    * The video player is responsible for maintaining mute state and setting the ad volume accordingly.
    * If set is not implemented, the video player does nothing.
    *
    * @param volume The volume to set between 0 and 1
    */
  def setAdVolume(volume: Double): Unit = js.native
  
  /**
    * The `skipAd()` method is new in VPAID 2.0.
    *
    * This method supports skip controls that the video player may implement. The video player calls
    * `skipAd()` when a user activates a skip control implemented by the video player. When called,
    * the ad unit responds by closing the ad, cleaning up its resources and sending the `AdSkipped` event.
    *
    * The player should check the ad property `adSkippableState` before calling `skipAd()`.
    * `skipAd()` will only work if this property is set to `true`. If player calls `skipAd()` when the
    * `adSkippableState` property is set to `false`, the ad can ignore the skip request.
    *
    * The process for stopping an ad may take time. Please see section 3.4 "Error Handling and Timeouts"
    * for more information on error reporting and timeouts.
    *
    * An `AdSkipped` event can also be sent as a result of a skip control in the ad unit and the video
    * player should handle it the same way it handles an `AdStopped` event. If a skip control in the
    * ad unit triggers the `AdSkipped` event, the video player may also send an `AdStopped` event to
    * support video players using an earlier version of VPAID. The `AdStopped` event sent right after
    * an `AdSkipped` event can be ignored in video players using VPAID 2.0 or later.
    *
    * Also, if the VPAID version for the ad unit precedes version 2.0, the ad unit will not
    * acknowledge a `skipAd()` method call. Skip controls in the video player should use the `stopAd()`
    * method to close skipped ads that use earlier versions of VPAID.
    */
  def skipAd(): Unit = js.native
  
  /**
    * `startAd()` is called by the video player when the video player is ready for the ad to display.
    * The ad unit responds by sending an `AdStarted` event that notifies the video player when the ad
    * unit has started playing. Once started, the video player cannot restart the ad unit by calling
    * `startAd()` and `stopAd()` multiple times.
    */
  def startAd(): Unit = js.native
  
  /**
    * The video player calls `stopAd()` when it will no longer display the ad or needs to cancel the
    * ad unit. The ad unit responds by closing the ad, cleaning up its resources and then sending
    * the `AdStopped` event. The process for stopping an ad may take time. Please see section 3.4
    * "Error Handling and Timeouts" for more information on error reporting and timeouts.
    */
  def stopAd(): Unit = js.native
  
  @JSName("subscribe")
  def subscribe_AdDurationChange(fn: js.Function0[Unit], event: AdDurationChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdDurationChange(fn: js.Function0[Unit], event: AdDurationChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdExpandedChange(fn: js.Function0[Unit], event: AdExpandedChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdExpandedChange(fn: js.Function0[Unit], event: AdExpandedChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdImpression(fn: js.Function0[Unit], event: AdImpression): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdImpression(fn: js.Function0[Unit], event: AdImpression, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdLinearChange(fn: js.Function0[Unit], event: AdLinearChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdLinearChange(fn: js.Function0[Unit], event: AdLinearChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdLoaded(fn: js.Function0[Unit], event: AdLoaded): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdLoaded(fn: js.Function0[Unit], event: AdLoaded, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdPaused(fn: js.Function0[Unit], event: AdPaused): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdPaused(fn: js.Function0[Unit], event: AdPaused, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdPlaying(fn: js.Function0[Unit], event: AdPlaying): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdPlaying(fn: js.Function0[Unit], event: AdPlaying, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdRemainingTimeChange(fn: js.Function0[Unit], event: AdRemainingTimeChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdRemainingTimeChange(fn: js.Function0[Unit], event: AdRemainingTimeChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSizeChange(fn: js.Function0[Unit], event: AdSizeChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSizeChange(fn: js.Function0[Unit], event: AdSizeChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSkippableStateChange(fn: js.Function0[Unit], event: AdSkippableStateChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSkippableStateChange(fn: js.Function0[Unit], event: AdSkippableStateChange, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSkipped(fn: js.Function0[Unit], event: AdSkipped): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdSkipped(fn: js.Function0[Unit], event: AdSkipped, listenerScope: js.Object): Unit = js.native
  /**
    * The video player calls this method to register a listener to a particular event
    *
    * @param fn is a reference to the function that needs to be called when the specified event occurs
    * @param event is the name of the event that the video player is subscribing to
    * @param listenerScope [optional] is a reference to the object in which the function is defined
    */
  @JSName("subscribe")
  def subscribe_AdStarted(fn: js.Function0[Unit], event: AdStarted): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdStarted(fn: js.Function0[Unit], event: AdStarted, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdStopped(fn: js.Function0[Unit], event: AdStopped): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdStopped(fn: js.Function0[Unit], event: AdStopped, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserAcceptInvitation(fn: js.Function0[Unit], event: AdUserAcceptInvitation): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserAcceptInvitation(fn: js.Function0[Unit], event: AdUserAcceptInvitation, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserClose(fn: js.Function0[Unit], event: AdUserClose): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserClose(fn: js.Function0[Unit], event: AdUserClose, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserMinimize(fn: js.Function0[Unit], event: AdUserMinimize): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdUserMinimize(fn: js.Function0[Unit], event: AdUserMinimize, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoComplete(fn: js.Function0[Unit], event: AdVideoComplete): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoComplete(fn: js.Function0[Unit], event: AdVideoComplete, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoFirstQuartile(fn: js.Function0[Unit], event: AdVideoFirstQuartile): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoFirstQuartile(fn: js.Function0[Unit], event: AdVideoFirstQuartile, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoMidpoint(fn: js.Function0[Unit], event: AdVideoMidpoint): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoMidpoint(fn: js.Function0[Unit], event: AdVideoMidpoint, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoStart(fn: js.Function0[Unit], event: AdVideoStart): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoStart(fn: js.Function0[Unit], event: AdVideoStart, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoThirdQuartile(fn: js.Function0[Unit], event: AdVideoThirdQuartile): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVideoThirdQuartile(fn: js.Function0[Unit], event: AdVideoThirdQuartile, listenerScope: js.Object): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVolumeChange(fn: js.Function0[Unit], event: AdVolumeChange): Unit = js.native
  @JSName("subscribe")
  def subscribe_AdVolumeChange(fn: js.Function0[Unit], event: AdVolumeChange, listenerScope: js.Object): Unit = js.native
  
  @JSName("unsubscribe")
  def unsubscribe_AdDurationChange(fn: js.Function0[Unit], event: AdDurationChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdExpandedChange(fn: js.Function0[Unit], event: AdExpandedChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdImpression(fn: js.Function0[Unit], event: AdImpression): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdLinearChange(fn: js.Function0[Unit], event: AdLinearChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdLoaded(fn: js.Function0[Unit], event: AdLoaded): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdPaused(fn: js.Function0[Unit], event: AdPaused): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdPlaying(fn: js.Function0[Unit], event: AdPlaying): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdRemainingTimeChange(fn: js.Function0[Unit], event: AdRemainingTimeChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdSizeChange(fn: js.Function0[Unit], event: AdSizeChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdSkippableStateChange(fn: js.Function0[Unit], event: AdSkippableStateChange): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdSkipped(fn: js.Function0[Unit], event: AdSkipped): Unit = js.native
  /**
    * The video player calls this method to remove a listener for a particular event
    *
    * @param event is the name of the event that the video player is unsubscribing from
    * @param fn is the event listener that is being removed
    */
  @JSName("unsubscribe")
  def unsubscribe_AdStarted(fn: js.Function0[Unit], event: AdStarted): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdStopped(fn: js.Function0[Unit], event: AdStopped): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdUserAcceptInvitation(fn: js.Function0[Unit], event: AdUserAcceptInvitation): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdUserClose(fn: js.Function0[Unit], event: AdUserClose): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdUserMinimize(fn: js.Function0[Unit], event: AdUserMinimize): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVideoComplete(fn: js.Function0[Unit], event: AdVideoComplete): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVideoFirstQuartile(fn: js.Function0[Unit], event: AdVideoFirstQuartile): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVideoMidpoint(fn: js.Function0[Unit], event: AdVideoMidpoint): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVideoStart(fn: js.Function0[Unit], event: AdVideoStart): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVideoThirdQuartile(fn: js.Function0[Unit], event: AdVideoThirdQuartile): Unit = js.native
  @JSName("unsubscribe")
  def unsubscribe_AdVolumeChange(fn: js.Function0[Unit], event: AdVolumeChange): Unit = js.native
}
