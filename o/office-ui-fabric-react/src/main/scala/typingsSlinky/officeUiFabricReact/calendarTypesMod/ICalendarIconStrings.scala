package typingsSlinky.officeUiFabricReact.calendarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarIconStrings extends js.Object {
  /**
    * Close icon
    * @defaultvalue 'CalculatorMultiply'
    */
  var closeIcon: js.UndefOr[String] = js.native
  /**
    * FabricMDL2Icons name for the left navigation icon.  Previous default: ChevronLeft.
    * @defaultvalue 'Up'
    */
  var leftNavigation: js.UndefOr[String] = js.native
  /**
    * FabricMDL2Icons name for the right navigation icon.  Previous default: ChevronRight.
    * @defaultvalue 'Down'
    */
  var rightNavigation: js.UndefOr[String] = js.native
}

object ICalendarIconStrings {
  @scala.inline
  def apply(): ICalendarIconStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarIconStrings]
  }
  @scala.inline
  implicit class ICalendarIconStringsOps[Self <: ICalendarIconStrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftNavigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withRightNavigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightNavigation")(js.undefined)
        ret
    }
  }
  
}

