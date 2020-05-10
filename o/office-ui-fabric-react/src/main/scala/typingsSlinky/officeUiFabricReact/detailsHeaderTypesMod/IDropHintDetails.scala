package typingsSlinky.officeUiFabricReact.detailsHeaderTypesMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropHintDetails extends js.Object {
  var dropHintElementRef: HTMLElement = js.native
  var endX: Double = js.native
  var originX: Double = js.native
  var startX: Double = js.native
}

object IDropHintDetails {
  @scala.inline
  def apply(dropHintElementRef: HTMLElement, endX: Double, originX: Double, startX: Double): IDropHintDetails = {
    val __obj = js.Dynamic.literal(dropHintElementRef = dropHintElementRef.asInstanceOf[js.Any], endX = endX.asInstanceOf[js.Any], originX = originX.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropHintDetails]
  }
  @scala.inline
  implicit class IDropHintDetailsOps[Self <: IDropHintDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropHintElementRef(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHintElementRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

