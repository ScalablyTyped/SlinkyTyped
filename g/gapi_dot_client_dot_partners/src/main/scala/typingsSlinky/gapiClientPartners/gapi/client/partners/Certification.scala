package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certification extends js.Object {
  /** Whether this certification has been achieved. */
  var achieved: js.UndefOr[Boolean] = js.native
  /** The type of certification, the area of expertise. */
  var certificationType: js.UndefOr[String] = js.native
  /** Date this certification is due to expire. */
  var expiration: js.UndefOr[String] = js.native
  /** The date the user last achieved certification. */
  var lastAchieved: js.UndefOr[String] = js.native
  /** Whether this certification is in the state of warning. */
  var warning: js.UndefOr[Boolean] = js.native
}

object Certification {
  @scala.inline
  def apply(): Certification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certification]
  }
  @scala.inline
  implicit class CertificationOps[Self <: Certification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAchieved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achieved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAchieved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("achieved")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificationType")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAchieved(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAchieved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAchieved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAchieved")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

