package typingsSlinky.paypalRestSdk.anon

import typingsSlinky.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brandname extends js.Object {
  var brand_name: js.UndefOr[String] = js.native
  var display_phone: js.UndefOr[Phone] = js.native
  var email: js.UndefOr[String] = js.native
}

object Brandname {
  @scala.inline
  def apply(): Brandname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brandname]
  }
  @scala.inline
  implicit class BrandnameOps[Self <: Brandname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_phone(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_phone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_phone")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
  }
  
}

