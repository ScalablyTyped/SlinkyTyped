package typingsSlinky.deezerSdk.DeezerSdk

import typingsSlinky.deezerSdk.anon.Index
import typingsSlinky.deezerSdk.deezerSdkStrings.current_track
import typingsSlinky.deezerSdk.deezerSdkStrings.mute_changed
import typingsSlinky.deezerSdk.deezerSdkStrings.player_buffering
import typingsSlinky.deezerSdk.deezerSdkStrings.player_loaded
import typingsSlinky.deezerSdk.deezerSdkStrings.player_paused
import typingsSlinky.deezerSdk.deezerSdkStrings.player_play
import typingsSlinky.deezerSdk.deezerSdkStrings.player_position
import typingsSlinky.deezerSdk.deezerSdkStrings.repeat_changed
import typingsSlinky.deezerSdk.deezerSdkStrings.shuffle_changed
import typingsSlinky.deezerSdk.deezerSdkStrings.track_end
import typingsSlinky.deezerSdk.deezerSdkStrings.tracklist_changed
import typingsSlinky.deezerSdk.deezerSdkStrings.volume_changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Player Events
/**
  * Allows you to listen to all player-related events.
  *
  * See:\
  * {@link https://developers.deezer.com/sdk/javascript/events | List of events}\
  * {@link https://developers.deezer.com/sdk/javascript/events-subscribe | Subscribe to an event}
  */
@js.native
trait Event extends js.Object {
  
  @JSName("subscribe")
  def subscribe_currenttrack(event: current_track, callback: js.Function1[/* currentTrackInfo */ Index, Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_mutechanged(event: mute_changed, callback: js.Function1[/* mute */ Boolean, Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_playerbuffering(event: player_buffering, callback: js.Function1[/* loadedPercentInt */ Double, Unit]): Unit = js.native
  /**
    * See: {@link https://developers.deezer.com/sdk/javascript/events | List of events}
    */
  @JSName("subscribe")
  def subscribe_playerloaded(event: player_loaded, callback: js.Function0[Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_playerpaused(event: player_paused, callback: js.Function0[Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_playerplay(event: player_play, callback: js.Function0[Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_playerposition(
    event: player_position,
    callback: js.Function1[/* positionSecondsFloat_durationSecondsInt */ js.Tuple2[Double, Double], Unit]
  ): Unit = js.native
  @JSName("subscribe")
  def subscribe_repeatchanged(event: repeat_changed, callback: js.Function1[/* repeatMode */ RepeatMode, Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_shufflechanged(event: shuffle_changed, callback: js.Function1[/* shuffle */ Boolean, Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_trackend(event: track_end, callback: js.Function1[/* trackPosition */ Double, Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_tracklistchanged(event: tracklist_changed, callback: js.Function0[Unit]): Unit = js.native
  @JSName("subscribe")
  def subscribe_volumechanged(event: volume_changed, callback: js.Function1[/* volumePercentInt */ Double, Unit]): Unit = js.native
}
