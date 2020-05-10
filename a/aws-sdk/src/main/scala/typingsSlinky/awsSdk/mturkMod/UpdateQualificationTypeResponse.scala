package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQualificationTypeResponse extends js.Object {
  /**
    *  Contains a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typingsSlinky.awsSdk.mturkMod.QualificationType] = js.native
}

object UpdateQualificationTypeResponse {
  @scala.inline
  def apply(): UpdateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQualificationTypeResponse]
  }
  @scala.inline
  implicit class UpdateQualificationTypeResponseOps[Self <: UpdateQualificationTypeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQualificationType(value: QualificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationType")(js.undefined)
        ret
    }
  }
  
}

