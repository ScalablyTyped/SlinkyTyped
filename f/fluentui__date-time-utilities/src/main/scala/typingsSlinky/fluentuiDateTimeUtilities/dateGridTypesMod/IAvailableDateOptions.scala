package typingsSlinky.fluentuiDateTimeUtilities.dateGridTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAvailableDateOptions extends IRestrictedDatesOptions {
  /** Direction of search (`1` - search in future / `-1` search in past) */
  var direction: Double = js.native
  /** Date from which we start the search */
  var initialDate: js.Date = js.native
  /** Ideal available date */
  var targetDate: js.Date = js.native
}

object IAvailableDateOptions {
  @scala.inline
  def apply(direction: Double, initialDate: js.Date, targetDate: js.Date): IAvailableDateOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], initialDate = initialDate.asInstanceOf[js.Any], targetDate = targetDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAvailableDateOptions]
  }
  @scala.inline
  implicit class IAvailableDateOptionsOps[Self <: IAvailableDateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialDate(value: js.Date): Self = this.set("initialDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDate(value: js.Date): Self = this.set("targetDate", value.asInstanceOf[js.Any])
  }
  
}

