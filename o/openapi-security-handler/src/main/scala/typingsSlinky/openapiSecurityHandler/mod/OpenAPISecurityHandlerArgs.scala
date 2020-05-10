package typingsSlinky.openapiSecurityHandler.mod

import typingsSlinky.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typingsSlinky.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPISecurityHandlerArgs extends js.Object {
  var loggingKey: String = js.native
  var operationSecurity: js.Array[
    SecurityRequirementObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
  ] = js.native
  var securityDefinitions: SecurityDefinitionsObject = js.native
  var securityHandlers: SecurityHandlers = js.native
}

object OpenAPISecurityHandlerArgs {
  @scala.inline
  def apply(
    loggingKey: String,
    operationSecurity: js.Array[
      SecurityRequirementObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
    ],
    securityDefinitions: SecurityDefinitionsObject,
    securityHandlers: SecurityHandlers
  ): OpenAPISecurityHandlerArgs = {
    val __obj = js.Dynamic.literal(loggingKey = loggingKey.asInstanceOf[js.Any], operationSecurity = operationSecurity.asInstanceOf[js.Any], securityDefinitions = securityDefinitions.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
  }
  @scala.inline
  implicit class OpenAPISecurityHandlerArgsOps[Self <: OpenAPISecurityHandlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationSecurity(
      value: js.Array[
          SecurityRequirementObject | typingsSlinky.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityDefinitions(value: SecurityDefinitionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityHandlers(value: SecurityHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandlers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

