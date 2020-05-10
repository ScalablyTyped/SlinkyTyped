package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookApplication extends Entity {
  var calculationMode: js.UndefOr[String] = js.native
}

object WorkbookApplication {
  @scala.inline
  def apply(): WorkbookApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookApplication]
  }
  @scala.inline
  implicit class WorkbookApplicationOps[Self <: WorkbookApplication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculationMode")(js.undefined)
        ret
    }
  }
  
}

