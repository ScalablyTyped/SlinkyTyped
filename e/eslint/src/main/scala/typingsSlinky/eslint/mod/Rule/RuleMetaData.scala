package typingsSlinky.eslint.mod.Rule

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eslint.anon.Category
import typingsSlinky.eslint.eslintStrings.code
import typingsSlinky.eslint.eslintStrings.layout
import typingsSlinky.eslint.eslintStrings.problem
import typingsSlinky.eslint.eslintStrings.suggestion
import typingsSlinky.eslint.eslintStrings.whitespace
import typingsSlinky.jsonSchema.mod.JSONSchema4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleMetaData extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var docs: js.UndefOr[Category] = js.native
  var fixable: js.UndefOr[code | whitespace] = js.native
  var messages: js.UndefOr[StringDictionary[String]] = js.native
  var schema: js.UndefOr[JSONSchema4 | js.Array[JSONSchema4]] = js.native
  var `type`: js.UndefOr[problem | suggestion | layout] = js.native
}

object RuleMetaData {
  @scala.inline
  def apply(): RuleMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleMetaData]
  }
  @scala.inline
  implicit class RuleMetaDataOps[Self <: RuleMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(js.undefined)
        ret
    }
    @scala.inline
    def withDocs(value: Category): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(js.undefined)
        ret
    }
    @scala.inline
    def withFixable(value: code | whitespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixable")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: StringDictionary[String]): Self = {
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
    def withSchema(value: JSONSchema4 | js.Array[JSONSchema4]): Self = {
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
    def withType(value: problem | suggestion | layout): Self = {
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
  }
  
}

