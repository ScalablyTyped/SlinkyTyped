package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.Operation
import typingsSlinky.ariClient.anon.PlaybackIdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playbacks extends js.Object {
  def control(params: Operation): js.Promise[Unit] = js.native
  def control(params: Operation, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: PlaybackIdString): js.Promise[Playback] = js.native
  /* Methods */
  def get(
    params: PlaybackIdString,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def stop(params: PlaybackIdString): js.Promise[Unit] = js.native
  def stop(params: PlaybackIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

