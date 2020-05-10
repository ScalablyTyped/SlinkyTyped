package typingsSlinky.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelOptions extends js.Object {
  var allowInvalid: js.UndefOr[Boolean] = js.native
  var debounce: js.UndefOr[Double] = js.native
  var getterSetter: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var updateOn: js.UndefOr[String] = js.native
}

object IModelOptions {
  @scala.inline
  def apply(): IModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModelOptions]
  }
  @scala.inline
  implicit class IModelOptionsOps[Self <: IModelOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterSetter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterSetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetterSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getterSetter")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOn")(js.undefined)
        ret
    }
  }
  
}

