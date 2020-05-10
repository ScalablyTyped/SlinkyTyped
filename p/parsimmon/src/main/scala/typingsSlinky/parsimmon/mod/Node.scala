package typingsSlinky.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node[Name /* <: String */, T] extends Mark[T] {
  var name: Name = js.native
}

object Node {
  @scala.inline
  def apply[Name, T](end: Index_, name: Name, start: Index_, value: T): Node[Name, T] = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[Name, T]]
  }
  @scala.inline
  implicit class NodeOps[Self[name, t] <: Node[name, t], Name, T] (val x: Self[Name, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Name, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Name, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Name, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Name, T]) with Other]
    @scala.inline
    def withName(value: Name): Self[Name, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

