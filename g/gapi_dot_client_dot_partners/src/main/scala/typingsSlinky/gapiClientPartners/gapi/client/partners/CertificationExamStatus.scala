package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificationExamStatus extends js.Object {
  /** The number of people who have passed the certification exam. */
  var numberUsersPass: js.UndefOr[Double] = js.native
  /** The type of certification exam. */
  var `type`: js.UndefOr[String] = js.native
}

object CertificationExamStatus {
  @scala.inline
  def apply(): CertificationExamStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationExamStatus]
  }
  @scala.inline
  implicit class CertificationExamStatusOps[Self <: CertificationExamStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberUsersPass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberUsersPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberUsersPass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberUsersPass")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

