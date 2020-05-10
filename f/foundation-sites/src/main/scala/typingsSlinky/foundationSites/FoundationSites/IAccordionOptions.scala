package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionOptions extends js.Object {
  var allowAllClosed: js.UndefOr[Boolean] = js.native
  var multiExpand: js.UndefOr[Boolean] = js.native
  var slideSpeed: js.UndefOr[Double] = js.native
}

object IAccordionOptions {
  @scala.inline
  def apply(): IAccordionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionOptions]
  }
  @scala.inline
  implicit class IAccordionOptionsOps[Self <: IAccordionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAllClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAllClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAllClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAllClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiExpand")(js.undefined)
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

