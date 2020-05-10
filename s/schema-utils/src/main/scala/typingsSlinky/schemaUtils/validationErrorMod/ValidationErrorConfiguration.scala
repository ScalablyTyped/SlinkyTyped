package typingsSlinky.schemaUtils.validationErrorMod

import typingsSlinky.schemaUtils.ErrorObjectchildrenArrayE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorConfiguration extends js.Object {
  var baseDataPath: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var postFormatter: js.UndefOr[typingsSlinky.schemaUtils.validateMod.PostFormatter] = js.native
}

object ValidationErrorConfiguration {
  @scala.inline
  def apply(): ValidationErrorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationErrorConfiguration]
  }
  @scala.inline
  implicit class ValidationErrorConfigurationOps[Self <: ValidationErrorConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDataPath")(js.undefined)
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
    def withPostFormatter(value: (/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPostFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormatter")(js.undefined)
        ret
    }
  }
  
}

