package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.ACTIVE
import typingsSlinky.rockset.rocksetStrings.BASIC
import typingsSlinky.rockset.rocksetStrings.DELETED
import typingsSlinky.rockset.rocksetStrings.ENTERPRISE
import typingsSlinky.rockset.rocksetStrings.FREE
import typingsSlinky.rockset.rocksetStrings.PRO
import typingsSlinky.rockset.rocksetStrings.TRIAL
import typingsSlinky.rockset.rocksetStrings.TRIAL_EXPIRED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  // name of the company
  var company_name: js.UndefOr[String] = js.native
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.native
  // name of the organization
  var display_name: js.UndefOr[String] = js.native
  // unique identifier for the organization
  var id: js.UndefOr[String] = js.native
  // number of QCUs
  var qcu: js.UndefOr[Double] = js.native
  // org state
  var state: js.UndefOr[ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED] = js.native
  // pricing tier
  var tier: js.UndefOr[FREE | BASIC | PRO | ENTERPRISE] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withQcu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qcu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQcu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qcu")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: FREE | BASIC | PRO | ENTERPRISE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
  }
  
}

