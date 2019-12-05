package typingsSlinky.deezerDashSdk.DeezerSdk

import typingsSlinky.deezerDashSdk.Anon_Index
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.current_track
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.mute_changed
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.player_buffering
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.player_loaded
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.player_paused
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.player_play
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.player_position
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.repeat_changed
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.shuffle_changed
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.track_end
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.tracklist_changed
import typingsSlinky.deezerDashSdk.deezerDashSdkStrings.volume_changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def subscribe_currenttrack(event: current_track, callback: js.Function1[/* currentTrackInfo */ Anon_Index, Unit]): Unit = js.native
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

