package typingsSlinky.firebaseDatabase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path[T] extends js.Object {
  var path: typingsSlinky.firebaseDatabase.pathMod.Path = js.native
  var value: T = js.native
}

object Path {
  @scala.inline
  def apply[T](path: typingsSlinky.firebaseDatabase.pathMod.Path, value: T): Path[T] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path[T]]
  }
  @scala.inline
  implicit class PathOps[Self[t] <: Path[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPath(value: typingsSlinky.firebaseDatabase.pathMod.Path): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

