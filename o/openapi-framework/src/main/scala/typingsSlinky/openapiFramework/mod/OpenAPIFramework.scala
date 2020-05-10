package typingsSlinky.openapiFramework.mod

import typingsSlinky.openapiFramework.typesMod.IOpenAPIFramework
import typingsSlinky.openapiFramework.typesMod.OpenAPIFrameworkConstructorArgs
import typingsSlinky.openapiFramework.typesMod.OpenAPIFrameworkVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFramework extends IOpenAPIFramework {
  val apiDoc: js.Any = js.native
  var args: OpenAPIFrameworkConstructorArgs = js.native
  val basePaths: js.Array[typingsSlinky.openapiFramework.basePathMod.default] = js.native
  var customFormats: js.Any = js.native
  var dependencies: js.Any = js.native
  var enableObjectCoercion: js.Any = js.native
  var errorTransformer: js.Any = js.native
  var externalSchemas: js.Any = js.native
  var logger: js.Any = js.native
  var operations: js.Any = js.native
  var originalApiDoc: js.Any = js.native
  var pathSecurity: js.Any = js.native
  var paths: js.Any = js.native
  var pathsIgnore: js.Any = js.native
  var routesGlob: js.Any = js.native
  var routesIndexFileRegExp: js.Any = js.native
  var securityHandlers: js.Any = js.native
  var validateApiDoc: js.Any = js.native
  var validator: js.Any = js.native
  def initialize(visitor: OpenAPIFrameworkVisitor): Unit = js.native
}

object OpenAPIFramework {
  @scala.inline
  def apply(
    apiDoc: js.Any,
    args: OpenAPIFrameworkConstructorArgs,
    basePaths: js.Array[typingsSlinky.openapiFramework.basePathMod.default],
    customFormats: js.Any,
    dependencies: js.Any,
    enableObjectCoercion: js.Any,
    errorTransformer: js.Any,
    externalSchemas: js.Any,
    featureType: String,
    initialize: OpenAPIFrameworkVisitor => Unit,
    logger: js.Any,
    loggingPrefix: String,
    name: String,
    operations: js.Any,
    originalApiDoc: js.Any,
    pathSecurity: js.Any,
    paths: js.Any,
    pathsIgnore: js.Any,
    routesGlob: js.Any,
    routesIndexFileRegExp: js.Any,
    securityHandlers: js.Any,
    validateApiDoc: js.Any,
    validator: js.Any
  ): OpenAPIFramework = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], customFormats = customFormats.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], enableObjectCoercion = enableObjectCoercion.asInstanceOf[js.Any], errorTransformer = errorTransformer.asInstanceOf[js.Any], externalSchemas = externalSchemas.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], initialize = js.Any.fromFunction1(initialize), logger = logger.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], originalApiDoc = originalApiDoc.asInstanceOf[js.Any], pathSecurity = pathSecurity.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], pathsIgnore = pathsIgnore.asInstanceOf[js.Any], routesGlob = routesGlob.asInstanceOf[js.Any], routesIndexFileRegExp = routesIndexFileRegExp.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any], validateApiDoc = validateApiDoc.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFramework]
  }
  @scala.inline
  implicit class OpenAPIFrameworkOps[Self <: OpenAPIFramework] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: OpenAPIFrameworkConstructorArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePaths(value: js.Array[typingsSlinky.openapiFramework.basePathMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFormats(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependencies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableObjectCoercion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableObjectCoercion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorTransformer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalSchemas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialize(value: OpenAPIFrameworkVisitor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogger(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalApiDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalApiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathSecurity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathsIgnore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathsIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutesGlob(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesGlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutesIndexFileRegExp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesIndexFileRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityHandlers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateApiDoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateApiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidator(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

