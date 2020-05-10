package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionMenuOptions extends js.Object {
  var multiOpen: js.UndefOr[Boolean] = js.native
  var slideSpeed: js.UndefOr[Double] = js.native
}

object IAccordionMenuOptions {
  @scala.inline
  def apply(): IAccordionMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionMenuOptions]
  }
  @scala.inline
  implicit class IAccordionMenuOptionsOps[Self <: IAccordionMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(js.undefined)
        ret
    }
  }
  
}

