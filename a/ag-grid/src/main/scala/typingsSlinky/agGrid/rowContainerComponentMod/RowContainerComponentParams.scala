package typingsSlinky.agGrid.rowContainerComponentMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowContainerComponentParams extends js.Object {
  var eContainer: HTMLElement = js.native
  var eViewport: js.UndefOr[HTMLElement] = js.native
  var hideWhenNoChildren: js.UndefOr[Boolean] = js.native
}

object RowContainerComponentParams {
  @scala.inline
  def apply(eContainer: HTMLElement): RowContainerComponentParams = {
    val __obj = js.Dynamic.literal(eContainer = eContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContainerComponentParams]
  }
  @scala.inline
  implicit class RowContainerComponentParamsOps[Self <: RowContainerComponentParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEViewport(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eViewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eViewport")(js.undefined)
        ret
    }
    @scala.inline
    def withHideWhenNoChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenNoChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWhenNoChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenNoChildren")(js.undefined)
        ret
    }
  }
  
}

