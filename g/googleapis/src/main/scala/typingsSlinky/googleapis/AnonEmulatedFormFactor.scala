package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmulatedFormFactor extends js.Object {
  var emulatedFormFactor: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var onlyCategories: js.UndefOr[js.Any] = js.native
}

object AnonEmulatedFormFactor {
  @scala.inline
  def apply(): AnonEmulatedFormFactor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEmulatedFormFactor]
  }
  @scala.inline
  implicit class AnonEmulatedFormFactorOps[Self <: AnonEmulatedFormFactor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmulatedFormFactor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatedFormFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmulatedFormFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emulatedFormFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyCategories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyCategories")(js.undefined)
        ret
    }
  }
  
}

