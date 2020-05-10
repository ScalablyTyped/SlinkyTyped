package typingsSlinky.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container[T] extends js.Object {
  var id: String = js.native
  def getStyles(): String = js.native
}

object Container {
  @scala.inline
  def apply[T](getStyles: () => String, id: String): Container[T] = {
    val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container[T]]
  }
  @scala.inline
  implicit class ContainerOps[Self[t] <: Container[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetStyles(value: () => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

