package typingsSlinky.knockout.anon

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clear extends js.Object {
  def clear(node: Node): Boolean = js.native
  def get(node: Node, key: String): js.Any = js.native
  def getAll(node: Node, createIfNotFound: Boolean): js.Any = js.native
  def set(node: Node, key: String, value: js.Any): Unit = js.native
}

object Clear {
  @scala.inline
  def apply(
    clear: Node => Boolean,
    get: (Node, String) => js.Any,
    getAll: (Node, Boolean) => js.Any,
    set: (Node, String, js.Any) => Unit
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
    def withClear(value: Node => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: (Node, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetAll(value: (Node, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (Node, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

