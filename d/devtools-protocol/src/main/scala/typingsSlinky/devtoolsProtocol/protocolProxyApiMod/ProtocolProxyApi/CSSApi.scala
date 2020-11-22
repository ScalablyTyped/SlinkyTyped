package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.fontsUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.mediaQueryResultChanged
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.styleSheetAdded
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.styleSheetChanged
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.styleSheetRemoved
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.AddRuleRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.AddRuleResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.FontsUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.ForcePseudoStateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetMatchedStylesForNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetMediaQueriesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetEffectivePropertyValueForNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetLocalFontsEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetMediaTextResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.StopRuleUsageTrackingResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.StyleSheetAddedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.StyleSheetChangedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.StyleSheetRemovedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.TakeComputedStyleUpdatesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.TakeCoverageDeltaResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.TrackComputedStyleUpdatesRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSApi extends js.Object {
  
  /**
    * Inserts a new rule with the given `ruleText` in a stylesheet with given `styleSheetId`, at the
    * position specified by `location`.
    */
  def addRule(params: AddRuleRequest): js.Promise[AddRuleResponse] = js.native
  
  /**
    * Returns all class names from specified stylesheet.
    */
  def collectClassNames(params: CollectClassNamesRequest): js.Promise[CollectClassNamesResponse] = js.native
  
  /**
    * Creates a new special "via-inspector" stylesheet in the frame with given `frameId`.
    */
  def createStyleSheet(params: CreateStyleSheetRequest): js.Promise[CreateStyleSheetResponse] = js.native
  
  /**
    * Disables the CSS agent for the given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables the CSS agent for the given page. Clients should not assume that the CSS agent has been
    * enabled until the result of this command is received.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Ensures that the given node will have specified pseudo-classes whenever its style is computed by
    * the browser.
    */
  def forcePseudoState(params: ForcePseudoStateRequest): js.Promise[Unit] = js.native
  
  def getBackgroundColors(params: GetBackgroundColorsRequest): js.Promise[GetBackgroundColorsResponse] = js.native
  
  /**
    * Returns the computed style for a DOM node identified by `nodeId`.
    */
  def getComputedStyleForNode(params: GetComputedStyleForNodeRequest): js.Promise[GetComputedStyleForNodeResponse] = js.native
  
  /**
    * Returns the styles defined inline (explicitly in the "style" attribute and implicitly, using DOM
    * attributes) for a DOM node identified by `nodeId`.
    */
  def getInlineStylesForNode(params: GetInlineStylesForNodeRequest): js.Promise[GetInlineStylesForNodeResponse] = js.native
  
  /**
    * Returns requested styles for a DOM node identified by `nodeId`.
    */
  def getMatchedStylesForNode(params: GetMatchedStylesForNodeRequest): js.Promise[GetMatchedStylesForNodeResponse] = js.native
  
  /**
    * Returns all media queries parsed by the rendering engine.
    */
  def getMediaQueries(): js.Promise[GetMediaQueriesResponse] = js.native
  
  /**
    * Requests information about platform fonts which we used to render child TextNodes in the given
    * node.
    */
  def getPlatformFontsForNode(params: GetPlatformFontsForNodeRequest): js.Promise[GetPlatformFontsForNodeResponse] = js.native
  
  /**
    * Returns the current textual content for a stylesheet.
    */
  def getStyleSheetText(params: GetStyleSheetTextRequest): js.Promise[GetStyleSheetTextResponse] = js.native
  
  /**
    * Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded
    * web font
    */
  @JSName("on")
  def on_fontsUpdated(event: fontsUpdated, listener: js.Function1[/* params */ FontsUpdatedEvent, Unit]): Unit = js.native
  /**
    * Fires whenever a MediaQuery result changes (for example, after a browser window has been
    * resized.) The current implementation considers only viewport-dependent media features.
    */
  @JSName("on")
  def on_mediaQueryResultChanged(event: mediaQueryResultChanged, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired whenever an active document stylesheet is added.
    */
  @JSName("on")
  def on_styleSheetAdded(event: styleSheetAdded, listener: js.Function1[/* params */ StyleSheetAddedEvent, Unit]): Unit = js.native
  /**
    * Fired whenever a stylesheet is changed as a result of the client operation.
    */
  @JSName("on")
  def on_styleSheetChanged(event: styleSheetChanged, listener: js.Function1[/* params */ StyleSheetChangedEvent, Unit]): Unit = js.native
  /**
    * Fired whenever an active document stylesheet is removed.
    */
  @JSName("on")
  def on_styleSheetRemoved(event: styleSheetRemoved, listener: js.Function1[/* params */ StyleSheetRemovedEvent, Unit]): Unit = js.native
  
  /**
    * Find a rule with the given active property for the given node and set the new value for this
    * property
    */
  def setEffectivePropertyValueForNode(params: SetEffectivePropertyValueForNodeRequest): js.Promise[Unit] = js.native
  
  /**
    * Modifies the keyframe rule key text.
    */
  def setKeyframeKey(params: SetKeyframeKeyRequest): js.Promise[SetKeyframeKeyResponse] = js.native
  
  /**
    * Enables/disables rendering of local CSS fonts (enabled by default).
    */
  def setLocalFontsEnabled(params: SetLocalFontsEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Modifies the rule selector.
    */
  def setMediaText(params: SetMediaTextRequest): js.Promise[SetMediaTextResponse] = js.native
  
  /**
    * Modifies the rule selector.
    */
  def setRuleSelector(params: SetRuleSelectorRequest): js.Promise[SetRuleSelectorResponse] = js.native
  
  /**
    * Sets the new stylesheet text.
    */
  def setStyleSheetText(params: SetStyleSheetTextRequest): js.Promise[SetStyleSheetTextResponse] = js.native
  
  /**
    * Applies specified style edits one after another in the given order.
    */
  def setStyleTexts(params: SetStyleTextsRequest): js.Promise[SetStyleTextsResponse] = js.native
  
  /**
    * Enables the selector recording.
    */
  def startRuleUsageTracking(): js.Promise[Unit] = js.native
  
  /**
    * Stop tracking rule usage and return the list of rules that were used since last call to
    * `takeCoverageDelta` (or since start of coverage instrumentation)
    */
  def stopRuleUsageTracking(): js.Promise[StopRuleUsageTrackingResponse] = js.native
  
  /**
    * Polls the next batch of computed style updates.
    */
  def takeComputedStyleUpdates(): js.Promise[TakeComputedStyleUpdatesResponse] = js.native
  
  /**
    * Obtain list of rules that became used since last call to this method (or since start of coverage
    * instrumentation)
    */
  def takeCoverageDelta(): js.Promise[TakeCoverageDeltaResponse] = js.native
  
  /**
    * Starts tracking the given computed styles for updates. The specified array of properties
    * replaces the one previously specified. Pass empty array to disable tracking.
    * Use takeComputedStyleUpdates to retrieve the list of nodes that had properties modified.
    * The changes to computed style properties are only tracked for nodes pushed to the front-end
    * by the DOM agent. If no changes to the tracked properties occur after the node has been pushed
    * to the front-end, no updates will be issued for the node.
    */
  def trackComputedStyleUpdates(params: TrackComputedStyleUpdatesRequest): js.Promise[Unit] = js.native
}
