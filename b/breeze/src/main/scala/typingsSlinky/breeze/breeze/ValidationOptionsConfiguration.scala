package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptionsConfiguration extends js.Object {
  var validateOnAttach: js.UndefOr[Boolean] = js.native
  var validateOnPropertyChange: js.UndefOr[Boolean] = js.native
  var validateOnQuery: js.UndefOr[Boolean] = js.native
  var validateOnSave: js.UndefOr[Boolean] = js.native
}

object ValidationOptionsConfiguration {
  @scala.inline
  def apply(): ValidationOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptionsConfiguration]
  }
  @scala.inline
  implicit class ValidationOptionsConfigurationOps[Self <: ValidationOptionsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidateOnAttach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnAttach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnAttach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnAttach")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnPropertyChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnPropertyChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnPropertyChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnPropertyChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnSave")(js.undefined)
        ret
    }
  }
  
}

