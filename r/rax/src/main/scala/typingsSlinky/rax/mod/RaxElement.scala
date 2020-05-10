package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaxElement[P, T /* <: String | JSXElementConstructor[_] */] extends js.Object {
  var key: Key | Null = js.native
  var props: P = js.native
  var `type`: T = js.native
}

object RaxElement {
  @scala.inline
  def apply[P, T](props: P, `type`: T): RaxElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaxElement[P, T]]
  }
  @scala.inline
  implicit class RaxElementOps[Self[p, t] <: RaxElement[p, t], P, T] (val x: Self[P, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, T]) with Other]
    @scala.inline
    def withProps(value: P): Self[P, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[P, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self[P, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyNull: Self[P, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(null)
        ret
    }
  }
  
}

