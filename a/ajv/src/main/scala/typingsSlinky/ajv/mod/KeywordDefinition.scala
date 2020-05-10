package typingsSlinky.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordDefinition extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.native
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  var errors: js.UndefOr[Boolean | String] = js.native
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.native
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.native
  var metaSchema: js.UndefOr[js.Object] = js.native
  var modifying: js.UndefOr[Boolean] = js.native
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.native
  var statements: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var valid: js.UndefOr[Boolean] = js.native
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.native
}

object KeywordDefinition {
  @scala.inline
  def apply(): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordDefinition]
  }
  @scala.inline
  implicit class KeywordDefinitionOps[Self <: KeywordDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$data(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$data")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withCompile(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCompile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.undefined)
        ret
    }
    @scala.inline
    def withDependencies(value: js.Array[String]): Self = {
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
    def withErrors(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(
      value: (/* it */ CompilationContext, /* keyword */ String, /* schema */ js.Any, /* parentSchema */ js.Object) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withMacro(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macro")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMacro: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macro")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaSchema(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withModifying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifying")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: SchemaValidateFunction | ValidateFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

