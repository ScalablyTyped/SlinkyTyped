package typingsSlinky.jqueryAjaxfile

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClear extends js.Object {
  def clear(node: Element): Boolean = js.native
  def get(node: Element, key: String): js.Any = js.native
  def getAll(node: Element, createIfNotFound: Boolean): js.Any = js.native
  def set(node: Element, key: String, value: js.Any): Unit = js.native
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Element => Boolean,
    get: (Element, String) => js.Any,
    getAll: (Element, Boolean) => js.Any,
    set: (Element, String, js.Any) => Unit
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction2(get), getAll = js.Any.fromFunction2(getAll), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[AnonClear]
  }
  @scala.inline
  implicit class AnonClearOps[Self <: AnonClear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: (Element, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAll(value: (Element, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (Element, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

