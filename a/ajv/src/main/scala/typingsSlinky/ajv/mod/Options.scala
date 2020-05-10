package typingsSlinky.ajv.mod

import typingsSlinky.ajv.ajvBooleans.`false`
import typingsSlinky.ajv.ajvBooleans.`true`
import typingsSlinky.ajv.ajvStrings.$id
import typingsSlinky.ajv.ajvStrings.all
import typingsSlinky.ajv.ajvStrings.array
import typingsSlinky.ajv.ajvStrings.auto
import typingsSlinky.ajv.ajvStrings.empty
import typingsSlinky.ajv.ajvStrings.fail
import typingsSlinky.ajv.ajvStrings.failing
import typingsSlinky.ajv.ajvStrings.id
import typingsSlinky.ajv.ajvStrings.ignore
import typingsSlinky.ajv.ajvStrings.log
import typingsSlinky.ajv.ajvStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  var addUsedSchema: js.UndefOr[Boolean] = js.native
  var allErrors: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean | String] = js.native
  var cache: js.UndefOr[js.Object] = js.native
  var coerceTypes: js.UndefOr[Boolean | array] = js.native
  var errorDataPath: js.UndefOr[String] = js.native
  var extendRefs: js.UndefOr[`true` | ignore | fail] = js.native
  var format: js.UndefOr[`false` | String] = js.native
  var formats: js.UndefOr[js.Object] = js.native
  var inlineRefs: js.UndefOr[Boolean | Double] = js.native
  var jsonPointers: js.UndefOr[Boolean] = js.native
  var keywords: js.UndefOr[js.Object] = js.native
  var loadSchema: js.UndefOr[
    js.Function2[
      /* uri */ String, 
      /* cb */ js.UndefOr[js.Function2[/* err */ js.Error, /* schema */ js.Object, Unit]], 
      js.Thenable[js.Object | Boolean]
    ]
  ] = js.native
  var logger: js.UndefOr[CustomLogger | `false`] = js.native
  var loopRequired: js.UndefOr[Double] = js.native
  var messages: js.UndefOr[Boolean] = js.native
  var meta: js.UndefOr[Boolean | js.Object] = js.native
  var missingRefs: js.UndefOr[`true` | ignore | fail] = js.native
  var multipleOfPrecision: js.UndefOr[Boolean | Double] = js.native
  var nullable: js.UndefOr[Boolean] = js.native
  var ownProperties: js.UndefOr[Boolean] = js.native
  var passContext: js.UndefOr[Boolean] = js.native
  var processCode: js.UndefOr[js.Function1[/* code */ String, String]] = js.native
  var removeAdditional: js.UndefOr[Boolean | all | failing] = js.native
  var schemaId: js.UndefOr[$id | id | auto] = js.native
  var schemas: js.UndefOr[js.Array[js.Object] | js.Object] = js.native
  var serialize: js.UndefOr[(js.Function1[/* schema */ js.Object | Boolean, _]) | `false`] = js.native
  var sourceCode: js.UndefOr[Boolean] = js.native
  var strictDefaults: js.UndefOr[Boolean | log] = js.native
  var strictKeywords: js.UndefOr[Boolean | log] = js.native
  var transpile: js.UndefOr[String | (js.Function1[/* code */ String, String])] = js.native
  var unicode: js.UndefOr[Boolean] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
  var unknownFormats: js.UndefOr[`true` | js.Array[String] | ignore] = js.native
  var useDefaults: js.UndefOr[Boolean | empty | shared] = js.native
  var validateSchema: js.UndefOr[Boolean | log] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withAddUsedSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUsedSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddUsedSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUsedSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withAllErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean | String): Self = {
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
    def withCache(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerceTypes(value: Boolean | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDataPath")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendRefs(value: `true` | ignore | fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineRefs(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonPointers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadSchema(
      value: (/* uri */ String, /* cb */ js.UndefOr[js.Function2[/* err */ js.Error, /* schema */ js.Object, Unit]]) => js.Thenable[js.Object | Boolean]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSchema")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoadSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: CustomLogger | `false`): Self = {
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
    def withLoopRequired(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingRefs(value: `true` | ignore | fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleOfPrecision(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOfPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleOfPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleOfPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPassContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passContext")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessCode(value: /* code */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProcessCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAdditional(value: Boolean | all | failing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAdditional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveAdditional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAdditional")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaId(value: $id | id | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaId")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Array[js.Object] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeFunction1(value: /* schema */ js.Object | Boolean => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerialize(value: (js.Function1[/* schema */ js.Object | Boolean, _]) | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictDefaults(value: Boolean | log): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictKeywords(value: Boolean | log): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictKeywords")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspileFunction1(value: /* code */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranspile(value: String | (js.Function1[/* code */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpile")(js.undefined)
        ret
    }
    @scala.inline
    def withUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicode")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueItems")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownFormats(value: `true` | js.Array[String] | ignore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefaults(value: Boolean | empty | shared): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateSchema(value: Boolean | log): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

