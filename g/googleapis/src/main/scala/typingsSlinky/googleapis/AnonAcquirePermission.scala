package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcquirePermission extends js.Object {
  var acquirePermission: js.UndefOr[String] = js.native
  var ageGroup: js.UndefOr[String] = js.native
  var allowedMaturityRating: js.UndefOr[String] = js.native
  var isInFamily: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
}

object AnonAcquirePermission {
  @scala.inline
  def apply(): AnonAcquirePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAcquirePermission]
  }
  @scala.inline
  implicit class AnonAcquirePermissionOps[Self <: AnonAcquirePermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcquirePermission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquirePermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcquirePermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquirePermission")(js.undefined)
        ret
    }
    @scala.inline
    def withAgeGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgeGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ageGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedMaturityRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMaturityRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedMaturityRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedMaturityRating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInFamily(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

