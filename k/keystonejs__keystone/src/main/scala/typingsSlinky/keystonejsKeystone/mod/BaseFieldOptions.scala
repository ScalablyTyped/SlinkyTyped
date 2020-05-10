package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFieldOptions
  extends AllFieldsOptions[js.Any] {
  var access: js.UndefOr[Access] = js.native
  var defaultValue: js.UndefOr[Boolean | DefaultValueFunction] = js.native
  var hooks: js.UndefOr[Hooks] = js.native
  var isRequired: js.UndefOr[Boolean] = js.native
  var isUnique: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var schemaDoc: js.UndefOr[String] = js.native
  var `type`: FieldType = js.native
}

object BaseFieldOptions {
  @scala.inline
  def apply(`type`: FieldType): BaseFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldOptions]
  }
  @scala.inline
  implicit class BaseFieldOptionsOps[Self <: BaseFieldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAccess(value: Access): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueFunction0(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultValue(value: Boolean | DefaultValueFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks(value: Hooks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnique")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaDoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaDoc")(js.undefined)
        ret
    }
  }
  
}

