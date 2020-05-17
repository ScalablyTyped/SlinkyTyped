package typingsSlinky.intercomClient.companyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.intercomClient.anon.Name
import typingsSlinky.intercomClient.intercomClientStrings.company
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  val app_id: js.UndefOr[String] = js.native
  var company_id: js.UndefOr[String] = js.native
  val created_at: Double = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  val id: String = js.native
  var industry: js.UndefOr[String] = js.native
  var monthly_spend: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var plan: js.UndefOr[String | Name] = js.native
  var remote_created_at: js.UndefOr[Double] = js.native
  var session_count: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  val `type`: company = js.native
  val updated_at: Double = js.native
  var user_count: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
}

object Company {
  @scala.inline
  def apply(created_at: Double, id: String, `type`: company, updated_at: Double): Company = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: company): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom_attributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndustry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industry")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthly_spend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthly_spend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthly_spend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthly_spend")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPlan(value: String | Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
        ret
    }
    @scala.inline
    def withRemote_created_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemote_created_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote_created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_count")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_count")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

