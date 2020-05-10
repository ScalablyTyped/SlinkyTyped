package typingsSlinky.openapiFramework.typesMod

import typingsSlinky.openapiFramework.AnonCoercer
import typingsSlinky.openapiFramework.basePathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkOperationContext extends js.Object {
  var additionalFeatures: js.Array[_] = js.native
  var allowsFeatures: Boolean = js.native
  var apiDoc: js.Any = js.native
  var basePaths: js.Array[default] = js.native
  var consumes: js.Array[String] = js.native
  var features: AnonCoercer = js.native
  var methodName: String = js.native
  var methodParameters: js.Array[_] = js.native
  var operationDoc: js.Any = js.native
  var operationHandler: js.Any = js.native
  var path: String = js.native
}

object OpenAPIFrameworkOperationContext {
  @scala.inline
  def apply(
    additionalFeatures: js.Array[_],
    allowsFeatures: Boolean,
    apiDoc: js.Any,
    basePaths: js.Array[default],
    consumes: js.Array[String],
    features: AnonCoercer,
    methodName: String,
    methodParameters: js.Array[_],
    operationDoc: js.Any,
    operationHandler: js.Any,
    path: String
  ): OpenAPIFrameworkOperationContext = {
    val __obj = js.Dynamic.literal(additionalFeatures = additionalFeatures.asInstanceOf[js.Any], allowsFeatures = allowsFeatures.asInstanceOf[js.Any], apiDoc = apiDoc.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], consumes = consumes.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], methodParameters = methodParameters.asInstanceOf[js.Any], operationDoc = operationDoc.asInstanceOf[js.Any], operationHandler = operationHandler.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkOperationContext]
  }
  @scala.inline
  implicit class OpenAPIFrameworkOperationContextOps[Self <: OpenAPIFrameworkOperationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalFeatures(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowsFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowsFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePaths(value: js.Array[default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: AnonCoercer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodParameters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperationHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

