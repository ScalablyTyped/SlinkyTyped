package typingsSlinky.cytoscape

import typingsSlinky.cytoscape.mod.SingularElementReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEle[T] extends js.Object {
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue = js.native
  /**
    * The minimum value found.
    */
  var value: T = js.native
}

object AnonEle {
  @scala.inline
  def apply[T](ele: SingularElementReturnValue, value: T): AnonEle[T] = {
    val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEle[T]]
  }
  @scala.inline
  implicit class AnonEleOps[Self[t] <: AnonEle[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEle(value: SingularElementReturnValue): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ele")(value.asInstanceOf[js.Any])
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

