package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonOperation
import typingsSlinky.ariClient.AnonPlaybackIdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playbacks extends js.Object {
  def control(params: AnonOperation): js.Promise[Unit] = js.native
  def control(params: AnonOperation, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(params: AnonPlaybackIdString): js.Promise[Playback] = js.native
  /* Methods */
  def get(
    params: AnonPlaybackIdString,
    callback: js.Function2[/* err */ js.Error, /* playback */ Playback, Unit]
  ): Unit = js.native
  def stop(params: AnonPlaybackIdString): js.Promise[Unit] = js.native
  def stop(params: AnonPlaybackIdString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

