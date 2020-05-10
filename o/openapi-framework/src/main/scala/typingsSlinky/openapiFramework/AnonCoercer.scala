package typingsSlinky.openapiFramework

import typingsSlinky.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typingsSlinky.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typingsSlinky.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typingsSlinky.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typingsSlinky.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoercer extends js.Object {
  var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.native
  var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.native
  var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.native
  var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.native
  var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.native
}

object AnonCoercer {
  @scala.inline
  def apply(): AnonCoercer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCoercer]
  }
  @scala.inline
  implicit class AnonCoercerOps[Self <: AnonCoercer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoercer(value: IOpenAPIRequestCoercer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSetter(value: IOpenAPIDefaultSetter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSetter")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestValidator(value: IOpenAPIRequestValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseValidator(value: IOpenAPIResponseValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValidator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityHandler(value: IOpenAPISecurityHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandler")(js.undefined)
        ret
    }
  }
  
}

