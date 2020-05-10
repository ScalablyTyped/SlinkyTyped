package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportRequest extends js.Object {
  /**
    * The content-type of the export, for example application/json. Currently application/json and application/yaml are supported for exportType ofoas30 and swagger. This should be specified in the Accept header for direct API requests.
    */
  var accepts: js.UndefOr[String] = js.native
  /**
    * [Required] The type of export. Acceptable values are 'oas30' for OpenAPI 3.0.x and 'swagger' for Swagger/OpenAPI 2.0.
    */
  var exportType: String = js.native
  /**
    * A key-value map of query string parameters that specify properties of the export, depending on the requested exportType. For exportType oas30 and swagger, any combination of the following parameters are supported: extensions='integrations' or extensions='apigateway' will export the API with x-amazon-apigateway-integration extensions. extensions='authorizers' will export the API with x-amazon-apigateway-authorizer extensions. postman will export the API with Postman extensions, allowing for import to the Postman tool
    */
  var parameters: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The name of the Stage that will be exported.
    */
  var stageName: String = js.native
}

object GetExportRequest {
  @scala.inline
  def apply(exportType: String, restApiId: String, stageName: String): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportRequest]
  }
  @scala.inline
  implicit class GetExportRequestOps[Self <: GetExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccepts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

