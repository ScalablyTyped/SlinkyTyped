package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.OperationString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Playback extends Resource {
  /* Properties */
  var id: String = js.native
  var language: String = js.native
  var media_uri: String = js.native
  var next_media_uri: js.UndefOr[String] = js.native
  var state: String = js.native
  var target_uri: String = js.native
  def control(params: OperationString): js.Promise[Unit] = js.native
  def control(params: OperationString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def get(): js.Promise[Playback] = js.native
  /* Methods */
  def get(callback: js.Function2[/* err */ js.Error, /* playback */ this.type, Unit]): Unit = js.native
  def stop(): js.Promise[Unit] = js.native
  def stop(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

