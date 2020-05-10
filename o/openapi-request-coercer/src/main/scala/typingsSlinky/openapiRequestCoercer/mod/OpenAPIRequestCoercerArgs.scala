package typingsSlinky.openapiRequestCoercer.mod

import typingsSlinky.openapiTypes.mod.OpenAPI.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIRequestCoercerArgs extends js.Object {
  var enableObjectCoercion: js.UndefOr[Boolean] = js.native
  var extensionBase: js.UndefOr[String] = js.native
  var loggingKey: js.UndefOr[String] = js.native
  var parameters: Parameters = js.native
}

object OpenAPIRequestCoercerArgs {
  @scala.inline
  def apply(parameters: Parameters): OpenAPIRequestCoercerArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
  }
  @scala.inline
  implicit class OpenAPIRequestCoercerArgsOps[Self <: OpenAPIRequestCoercerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableObjectCoercion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableObjectCoercion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableObjectCoercion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableObjectCoercion")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensionBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensionBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionBase")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(js.undefined)
        ret
    }
  }
  
}

