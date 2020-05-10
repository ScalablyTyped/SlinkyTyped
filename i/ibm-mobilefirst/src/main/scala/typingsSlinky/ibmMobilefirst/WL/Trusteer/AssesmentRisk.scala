package typingsSlinky.ibmMobilefirst.WL.Trusteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssesmentRisk extends js.Object {
  var additionalData: String = js.native
  var lastCalculated: Double = js.native
  var name: String = js.native
  var value: Double = js.native
}

object AssesmentRisk {
  @scala.inline
  def apply(additionalData: String, lastCalculated: Double, name: String, value: Double): AssesmentRisk = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], lastCalculated = lastCalculated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssesmentRisk]
  }
  @scala.inline
  implicit class AssesmentRiskOps[Self <: AssesmentRisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastCalculated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCalculated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

