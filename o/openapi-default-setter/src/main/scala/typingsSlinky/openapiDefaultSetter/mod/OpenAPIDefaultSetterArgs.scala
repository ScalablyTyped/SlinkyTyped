package typingsSlinky.openapiDefaultSetter.mod

import typingsSlinky.openapiTypes.mod.OpenAPIV2.ParameterObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIDefaultSetterArgs extends js.Object {
  var loggingKey: js.UndefOr[String] = js.native
  var parameters: js.Array[ParameterObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject] = js.native
}

object OpenAPIDefaultSetterArgs {
  @scala.inline
  def apply(parameters: js.Array[ParameterObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject]): OpenAPIDefaultSetterArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIDefaultSetterArgs]
  }
  @scala.inline
  implicit class OpenAPIDefaultSetterArgsOps[Self <: OpenAPIDefaultSetterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Array[ParameterObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.ParameterObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
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

