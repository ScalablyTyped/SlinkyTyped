package typingsSlinky.knockout.mod.utils

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.knockout.mod.MaybeSubscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.postJson")
@js.native
object postJson extends js.Object {
  def apply(urlOrForm: String, data: MaybeSubscribable[js.Object]): Unit = js.native
  def apply(urlOrForm: String, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
  def apply(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object]): Unit = js.native
  def apply(urlOrForm: HTMLFormElement, data: MaybeSubscribable[js.Object], options: PostJsonOptions): Unit = js.native
}

