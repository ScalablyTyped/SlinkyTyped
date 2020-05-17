package typingsSlinky.intercomWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Createdat extends js.Object {
  var created_at: js.UndefOr[Double] = js.native
  var id: String | Double = js.native
  var industry: js.UndefOr[String] = js.native
  var monthly_spend: js.UndefOr[Double] = js.native
  var name: String = js.native
  var plan: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var user_count: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
}

object Createdat {
  @scala.inline
  def apply(id: String | Double, name: String): Createdat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
  @scala.inline
  implicit class CreatedatOps[Self <: Createdat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
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
    def withPlan(value: String): Self = {
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

