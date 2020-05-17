package typingsSlinky.knockoutPaging.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clear extends js.Object {
  def clear(node: org.scalajs.dom.raw.Element): Boolean = js.native
  def get(node: org.scalajs.dom.raw.Element, key: String): js.Any = js.native
  def getAll(node: org.scalajs.dom.raw.Element, createIfNotFound: Boolean): js.Any = js.native
  def set(node: org.scalajs.dom.raw.Element, key: String, value: js.Any): Unit = js.native
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
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: org.scalajs.dom.raw.Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: (org.scalajs.dom.raw.Element, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAll(value: (org.scalajs.dom.raw.Element, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (org.scalajs.dom.raw.Element, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

