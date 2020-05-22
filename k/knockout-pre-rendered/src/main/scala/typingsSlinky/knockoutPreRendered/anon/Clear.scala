package typingsSlinky.knockoutPreRendered.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clear extends js.Object {
  def clear(node: org.scalajs.dom.raw.Element): Boolean
  def get(node: org.scalajs.dom.raw.Element, key: String): js.Any
  def getAll(node: org.scalajs.dom.raw.Element, createIfNotFound: Boolean): js.Any
  def set(node: org.scalajs.dom.raw.Element, key: String, value: js.Any): Unit
}

object Clear {
  @scala.inline
  def apply(
    clear: org.scalajs.dom.raw.Element => Boolean,
    get: (org.scalajs.dom.raw.Element, String) => js.Any,
    getAll: (org.scalajs.dom.raw.Element, Boolean) => js.Any,
    set: (org.scalajs.dom.raw.Element, String, js.Any) => Unit
  ): Clear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[Clear]
  }
}

