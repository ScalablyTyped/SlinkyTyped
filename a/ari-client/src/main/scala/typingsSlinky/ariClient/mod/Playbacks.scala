package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.Operation
import typingsSlinky.ariClient.anon.PlaybackIdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playbacks extends js.Object {
  
  /**
    * Control a playback.
    *
    * @param params.playbackId - Playbacks id.
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: Operation): js.Promise[Unit] = js.native
  /**
    * Control a playback.
    *
    * @param params.playbackId - Playbacks id.
    * @param params.operation - Operation to perform on the playback.
    */
  def control(params: Operation, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Get a playbacks details.
    *
    * @param params.playbackId - Playbacks id.
    */
  def get(params: PlaybackIdString): js.Promise[Playback] = js.native
  /**
    * Get a playbacks details.
    *
    * @param params.playbackId - Playbacks id.
    */
  def get(
    params: PlaybackIdString,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  
  /**
    * Stop a playback.
    *
    * @param params.playbackId - Playbacks id.
    */
  def stop(params: PlaybackIdString): js.Promise[Unit] = js.native
  /**
    * Stop a playback.
    *
    * @param params.playbackId - Playbacks id.
    */
  def stop(params: PlaybackIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
