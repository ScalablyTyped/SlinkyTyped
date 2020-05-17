package typingsSlinky.openapiFramework.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.openapiSecurityHandler.mod.SecurityHandlers
import typingsSlinky.openapiTypes.mod.OpenAPIV2.Document
import typingsSlinky.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIFrameworkArgs extends js.Object {
  var apiDoc: Document | typingsSlinky.openapiTypes.mod.OpenAPIV3.Document | String = js.native
  var customFormats: js.UndefOr[StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]] = js.native
  var dependencies: js.UndefOr[StringDictionary[js.Any]] = js.native
  var enableObjectCoercion: js.UndefOr[Boolean] = js.native
  var errorTransformer: js.UndefOr[OpenAPIErrorTransformer] = js.native
  var externalSchemas: js.UndefOr[typingsSlinky.openapiFramework.anon.String] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var operations: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, _]]] = js.native
  var pathSecurity: js.UndefOr[js.Array[PathSecurityTuple]] = js.native
  var paths: js.UndefOr[String | js.Array[OpenAPIFrameworkPathObject]] = js.native
  var pathsIgnore: js.UndefOr[js.RegExp] = js.native
  var routesGlob: js.UndefOr[String] = js.native
  var routesIndexFileRegExp: js.UndefOr[js.RegExp] = js.native
  var securityHandlers: js.UndefOr[SecurityHandlers] = js.native
  var validateApiDoc: js.UndefOr[Boolean] = js.native
}

object OpenAPIFrameworkArgs {
  @scala.inline
  def apply(apiDoc: Document | typingsSlinky.openapiTypes.mod.OpenAPIV3.Document | String): OpenAPIFrameworkArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkArgs]
  }
  @scala.inline
  implicit class OpenAPIFrameworkArgsOps[Self <: OpenAPIFrameworkArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiDoc(value: Document | typingsSlinky.openapiTypes.mod.OpenAPIV3.Document | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFormats(value: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
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
    def withErrorTransformer(value: (/* has0 */ js.Object, /* has1 */ js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorTransformer")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalSchemas(value: typingsSlinky.openapiFramework.anon.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSchemas")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withOperations(value: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSecurity(value: js.Array[PathSecurityTuple]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSecurity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSecurity")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: String | js.Array[OpenAPIFrameworkPathObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPathsIgnore(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathsIgnore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathsIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathsIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutesGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesGlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutesGlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesGlob")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutesIndexFileRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesIndexFileRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutesIndexFileRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routesIndexFileRegExp")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityHandlers(value: SecurityHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateApiDoc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateApiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateApiDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateApiDoc")(js.undefined)
        ret
    }
  }
  
}

