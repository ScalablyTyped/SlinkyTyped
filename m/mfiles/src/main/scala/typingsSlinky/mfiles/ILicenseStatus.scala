package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILicenseStatus extends js.Object {
  val EvaluationDaysLeft: Double = js.native
  val EvaluationMode: Boolean = js.native
  val Expired: Boolean = js.native
  val LicenseCode: String = js.native
  val NumOfConcurrentUserLicenses: Double = js.native
  val NumOfNamedUserLicenses: Double = js.native
  val NumOfReadonlyLicenses: Double = js.native
  val SerialNumber: String = js.native
  def ClearLicenseCode(): Unit = js.native
}

object ILicenseStatus {
  @scala.inline
  def apply(
    ClearLicenseCode: () => Unit,
    EvaluationDaysLeft: Double,
    EvaluationMode: Boolean,
    Expired: Boolean,
    LicenseCode: String,
    NumOfConcurrentUserLicenses: Double,
    NumOfNamedUserLicenses: Double,
    NumOfReadonlyLicenses: Double,
    SerialNumber: String
  ): ILicenseStatus = {
    val __obj = js.Dynamic.literal(ClearLicenseCode = js.Any.fromFunction0(ClearLicenseCode), EvaluationDaysLeft = EvaluationDaysLeft.asInstanceOf[js.Any], EvaluationMode = EvaluationMode.asInstanceOf[js.Any], Expired = Expired.asInstanceOf[js.Any], LicenseCode = LicenseCode.asInstanceOf[js.Any], NumOfConcurrentUserLicenses = NumOfConcurrentUserLicenses.asInstanceOf[js.Any], NumOfNamedUserLicenses = NumOfNamedUserLicenses.asInstanceOf[js.Any], NumOfReadonlyLicenses = NumOfReadonlyLicenses.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILicenseStatus]
  }
  @scala.inline
  implicit class ILicenseStatusOps[Self <: ILicenseStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearLicenseCode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearLicenseCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEvaluationDaysLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationDaysLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumOfConcurrentUserLicenses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumOfConcurrentUserLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumOfNamedUserLicenses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumOfNamedUserLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumOfReadonlyLicenses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumOfReadonlyLicenses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerialNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

