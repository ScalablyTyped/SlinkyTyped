package typingsSlinky.angularBootstrapCalendar

import typingsSlinky.angularBootstrapCalendar.mod.bootstrap.calendar.IFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAngular extends js.Object {
  var angular: IFormats = js.native
  var moment: IFormats = js.native
}

object AnonAngular {
  @scala.inline
  def apply(angular: IFormats, moment: IFormats): AnonAngular = {
    val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngular]
  }
  @scala.inline
  implicit class AnonAngularOps[Self <: AnonAngular] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngular(value: IFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoment(value: IFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

