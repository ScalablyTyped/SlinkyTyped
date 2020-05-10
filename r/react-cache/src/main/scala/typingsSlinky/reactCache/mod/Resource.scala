package typingsSlinky.reactCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): Unit = js.native
  def read(key: Input): Value = js.native
}

object Resource {
  @scala.inline
  def apply[Input, Value](preload: Input => Unit, read: Input => Value): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Resource[Input, Value]]
  }
  @scala.inline
  implicit class ResourceOps[Self[input, value] <: Resource[input, value], Input, Value] (val x: Self[Input, Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Input, Value] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Input, Value]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Input, Value]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Input, Value]) with Other]
    @scala.inline
    def withPreload(value: Input => Unit): Self[Input, Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: Input => Value): Self[Input, Value] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

