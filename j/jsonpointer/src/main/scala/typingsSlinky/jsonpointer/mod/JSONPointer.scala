package typingsSlinky.jsonpointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPointer extends js.Object {
  /**
    * Looks up a JSON pointer in an object
    */
  def get(`object`: js.Object): js.Any = js.native
  /**
    * Set a value for a JSON pointer on object
    */
  def set(`object`: js.Object, value: js.Any): Unit = js.native
}

object JSONPointer {
  @scala.inline
  def apply(get: js.Object => js.Any, set: (js.Object, js.Any) => Unit): JSONPointer = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[JSONPointer]
  }
  @scala.inline
  implicit class JSONPointerOps[Self <: JSONPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (js.Object, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

