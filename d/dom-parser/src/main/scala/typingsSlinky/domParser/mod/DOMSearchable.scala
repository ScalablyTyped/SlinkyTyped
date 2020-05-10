package typingsSlinky.domParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMSearchable extends js.Object {
  def getElementById(id: String): Node | Null = js.native
  def getElementsByClassName(className: String): js.Array[Node] | Null = js.native
  def getElementsByName(name: String): js.Array[Node] | Null = js.native
  def getElementsByTagName(tagName: String): js.Array[Node] | Null = js.native
}

object DOMSearchable {
  @scala.inline
  def apply(
    getElementById: String => Node | Null,
    getElementsByClassName: String => js.Array[Node] | Null,
    getElementsByName: String => js.Array[Node] | Null,
    getElementsByTagName: String => js.Array[Node] | Null
  ): DOMSearchable = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByName = js.Any.fromFunction1(getElementsByName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName))
    __obj.asInstanceOf[DOMSearchable]
  }
  @scala.inline
  implicit class DOMSearchableOps[Self <: DOMSearchable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetElementById(value: String => Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByClassName(value: String => js.Array[Node] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByName(value: String => js.Array[Node] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: String => js.Array[Node] | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

