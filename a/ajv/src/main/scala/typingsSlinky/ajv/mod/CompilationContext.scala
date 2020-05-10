package typingsSlinky.ajv.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ajv.AnonCopy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationContext extends js.Object {
  var async: Boolean = js.native
  var baseId: String = js.native
  var compositeRule: Boolean = js.native
  var dataLevel: Double = js.native
  var dataPathArr: js.Array[String] = js.native
  var formats: StringDictionary[js.UndefOr[FormatDefinition]] = js.native
  var keywords: StringDictionary[js.UndefOr[KeywordDefinition]] = js.native
  var level: Double = js.native
  var opts: Options = js.native
  var schema: js.Any = js.native
  var schemaPath: String = js.native
  var self: Ajv = js.native
  var util: AnonCopy = js.native
  def validate(schema: js.Object): Boolean = js.native
}

object CompilationContext {
  @scala.inline
  def apply(
    async: Boolean,
    baseId: String,
    compositeRule: Boolean,
    dataLevel: Double,
    dataPathArr: js.Array[String],
    formats: StringDictionary[js.UndefOr[FormatDefinition]],
    keywords: StringDictionary[js.UndefOr[KeywordDefinition]],
    level: Double,
    opts: Options,
    schema: js.Any,
    schemaPath: String,
    self: Ajv,
    util: AnonCopy,
    validate: js.Object => Boolean
  ): CompilationContext = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], baseId = baseId.asInstanceOf[js.Any], compositeRule = compositeRule.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], dataPathArr = dataPathArr.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[CompilationContext]
  }
  @scala.inline
  implicit class CompilationContextOps[Self <: CompilationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompositeRule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compositeRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPathArr(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPathArr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormats(value: StringDictionary[js.UndefOr[FormatDefinition]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: StringDictionary[js.UndefOr[KeywordDefinition]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchemaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: Ajv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtil(value: AnonCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("util")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

