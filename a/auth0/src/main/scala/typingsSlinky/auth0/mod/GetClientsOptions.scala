package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClientsOptions extends js.Object {
  var app_type: js.UndefOr[js.Array[ClientAppType]] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  var include_fields: js.UndefOr[Boolean] = js.native
  var include_totals: js.UndefOr[Boolean] = js.native
  var is_first_party: js.UndefOr[Boolean] = js.native
  var is_global: js.UndefOr[Boolean] = js.native
  var page: js.UndefOr[Double] = js.native
  var per_page: js.UndefOr[Double] = js.native
}

object GetClientsOptions {
  @scala.inline
  def apply(): GetClientsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClientsOptions]
  }
  @scala.inline
  implicit class GetClientsOptionsOps[Self <: GetClientsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_type(value: js.Array[ClientAppType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_fields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_fields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_fields")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude_totals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_totals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude_totals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_totals")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_first_party(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_party")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_first_party: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_first_party")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_global(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_global: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_global")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPer_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(js.undefined)
        ret
    }
  }
  
}

