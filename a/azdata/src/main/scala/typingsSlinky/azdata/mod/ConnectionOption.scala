package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOption extends js.Object {
  var categoryValues: js.Array[CategoryValue] = js.native
  var defaultValue: String = js.native
  var description: String = js.native
  var displayName: String = js.native
  var groupName: String = js.native
  var isIdentity: Boolean = js.native
  var isRequired: Boolean = js.native
  var name: String = js.native
  var specialValueType: ConnectionOptionSpecialType = js.native
  var valueType: ServiceOptionType = js.native
}

object ConnectionOption {
  @scala.inline
  def apply(
    categoryValues: js.Array[CategoryValue],
    defaultValue: String,
    description: String,
    displayName: String,
    groupName: String,
    isIdentity: Boolean,
    isRequired: Boolean,
    name: String,
    specialValueType: ConnectionOptionSpecialType,
    valueType: ServiceOptionType
  ): ConnectionOption = {
    val __obj = js.Dynamic.literal(categoryValues = categoryValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], specialValueType = specialValueType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOption]
  }
  @scala.inline
  implicit class ConnectionOptionOps[Self <: ConnectionOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategoryValues(value: js.Array[CategoryValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIdentity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialValueType(value: ConnectionOptionSpecialType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: ServiceOptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

