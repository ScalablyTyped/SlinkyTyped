package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonFormatLang
import typingsSlinky.ariClient.AnonSoundId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sounds extends js.Object {
  def get(params: AnonSoundId): js.Promise[Sound] = js.native
  def get(params: AnonSoundId, callback: js.Function2[/* err */ js.Error, /* sound */ Sound, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Sound]] = js.native
  def list(callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[Sound], Unit]): Unit = js.native
  def list(params: AnonFormatLang): js.Promise[js.Array[Sound]] = js.native
  /* Methods */
  def list(
    params: AnonFormatLang,
    callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[Sound], Unit]
  ): Unit = js.native
}

