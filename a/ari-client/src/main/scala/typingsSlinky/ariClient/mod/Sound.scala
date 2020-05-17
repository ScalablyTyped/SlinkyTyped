package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.anon.FormatLang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sound extends Resource {
  var formats: FormatLangPair | js.Array[FormatLangPair] = js.native
  /* Properties */
  var id: String = js.native
  var text: js.UndefOr[String] = js.native
  def get(): js.Promise[Sound] = js.native
  def get(callback: js.Function2[/* err */ js.Error, /* sound */ this.type, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[Sound]] = js.native
  def list(callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[this.type], Unit]): Unit = js.native
  def list(params: FormatLang): js.Promise[js.Array[Sound]] = js.native
  /* Methods */
  def list(
    params: FormatLang,
    callback: js.Function2[/* err */ js.Error, /* sounds */ js.Array[this.type], Unit]
  ): Unit = js.native
}

