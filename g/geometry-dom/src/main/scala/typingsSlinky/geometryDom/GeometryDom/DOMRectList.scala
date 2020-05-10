package typingsSlinky.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRectList extends js.Object {
  /**
    * total number of DOMRect objects associated with the object.
    * readonly unsigned long length
    */
  var length: Double = js.native
  /**
    * the DOMRect object at index must be returned.
    * @param index
    */
  def item(index: Double): DOMRect = js.native
}

object DOMRectList {
  @scala.inline
  def apply(item: Double => DOMRect, length: Double): DOMRectList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMRectList]
  }
  @scala.inline
  implicit class DOMRectListOps[Self <: DOMRectList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Double => DOMRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

