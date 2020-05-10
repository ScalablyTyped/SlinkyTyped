package typingsSlinky.openapiFramework.typesMod

import typingsSlinky.openapiTypes.mod.OpenAPIV2.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkConstructorArgs extends OpenAPIFrameworkArgs {
  var featureType: String = js.native
  var name: String = js.native
}

object OpenAPIFrameworkConstructorArgs {
  @scala.inline
  def apply(
    apiDoc: Document | typingsSlinky.openapiTypes.mod.OpenAPIV3.Document | String,
    featureType: String,
    name: String
  ): OpenAPIFrameworkConstructorArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkConstructorArgs]
  }
  @scala.inline
  implicit class OpenAPIFrameworkConstructorArgsOps[Self <: OpenAPIFrameworkConstructorArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

