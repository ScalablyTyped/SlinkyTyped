package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptQualificationRequestRequest extends js.Object {
  /**
    *  The value of the Qualification. You can omit this value if you are using the presence or absence of the Qualification as the basis for a HIT requirement. 
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Qualification request, as returned by the GetQualificationRequests operation.
    */
  var QualificationRequestId: String = js.native
}

object AcceptQualificationRequestRequest {
  @scala.inline
  def apply(QualificationRequestId: String): AcceptQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptQualificationRequestRequest]
  }
  @scala.inline
  implicit class AcceptQualificationRequestRequestOps[Self <: AcceptQualificationRequestRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQualificationRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegerValue(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(js.undefined)
        ret
    }
  }
  
}

