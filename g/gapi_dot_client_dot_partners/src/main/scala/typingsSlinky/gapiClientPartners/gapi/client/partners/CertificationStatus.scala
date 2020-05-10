package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificationStatus extends js.Object {
  /** List of certification exam statuses. */
  var examStatuses: js.UndefOr[js.Array[CertificationExamStatus]] = js.native
  /** Whether certification is passing. */
  var isCertified: js.UndefOr[Boolean] = js.native
  /** The type of the certification. */
  var `type`: js.UndefOr[String] = js.native
  /** Number of people who are certified, */
  var userCount: js.UndefOr[Double] = js.native
}

object CertificationStatus {
  @scala.inline
  def apply(): CertificationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationStatus]
  }
  @scala.inline
  implicit class CertificationStatusOps[Self <: CertificationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamStatuses(value: js.Array[CertificationExamStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCertified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCertified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCertified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCertified")(js.undefined)
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
    @scala.inline
    def withUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCount")(js.undefined)
        ret
    }
  }
  
}

