package typingsSlinky.marko.attributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  var allowExpressions: Boolean = js.native
  var autocomplete: Boolean = js.native
  var defaultValue: String = js.native
  var deprecated: js.Any = js.native
  var dynamicAttribute: Boolean = js.native
  var enum: js.Any = js.native
  var filePath: String = js.native
  var html: Boolean = js.native
  var ignore: Boolean = js.native
  var key: String = js.native
  var name: js.UndefOr[String] = js.native
  var pattern: js.UndefOr[js.Any] = js.native
  var preserveName: js.UndefOr[String] = js.native
  var ref: js.UndefOr[String] = js.native
  var removeDashes: Boolean = js.native
  var required: Boolean = js.native
  var setContextFlag: String = js.native
  var setFlag: String | Null = js.native
  var targetProperty: String | Null = js.native
  var `type`: String | Null = js.native
}

object Attribute {
  @scala.inline
  def apply(
    allowExpressions: Boolean,
    autocomplete: Boolean,
    defaultValue: String,
    deprecated: js.Any,
    dynamicAttribute: Boolean,
    enum: js.Any,
    filePath: String,
    html: Boolean,
    ignore: Boolean,
    key: String,
    removeDashes: Boolean,
    required: Boolean,
    setContextFlag: String
  ): Attribute = {
    val __obj = js.Dynamic.literal(allowExpressions = allowExpressions.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], dynamicAttribute = dynamicAttribute.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], removeDashes = removeDashes.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], setContextFlag = setContextFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  @scala.inline
  implicit class AttributeOps[Self <: Attribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExpressions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocomplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecated(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamicAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnum(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveDashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeDashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetContextFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContextFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveName")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFlagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFlag")(null)
        ret
    }
    @scala.inline
    def withTargetProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPropertyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProperty")(null)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

