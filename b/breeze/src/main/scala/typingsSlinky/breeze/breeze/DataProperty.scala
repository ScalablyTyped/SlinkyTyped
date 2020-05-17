package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProperty extends IProperty {
  var complexTypeName: String = js.native
  var concurrencyMode: String = js.native
  var dataType: DataTypeSymbol = js.native
  var defaultValue: js.Any = js.native
  var isComplexProperty: Boolean = js.native
  var isInherited: Boolean = js.native
  var isNullable: Boolean = js.native
  var isPartOfKey: Boolean = js.native
  var isUnmapped: Boolean = js.native
  var maxLength: Double = js.native
  var relatedNavigationProperty: NavigationProperty = js.native
}

object DataProperty {
  @scala.inline
  def apply(
    complexTypeName: String,
    concurrencyMode: String,
    dataType: DataTypeSymbol,
    defaultValue: js.Any,
    displayName: String,
    isComplexProperty: Boolean,
    isDataProperty: Boolean,
    isInherited: Boolean,
    isNavigationProperty: Boolean,
    isNullable: Boolean,
    isPartOfKey: Boolean,
    isUnmapped: Boolean,
    maxLength: Double,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    relatedNavigationProperty: NavigationProperty,
    validators: js.Array[Validator]
  ): DataProperty = {
    val __obj = js.Dynamic.literal(complexTypeName = complexTypeName.asInstanceOf[js.Any], concurrencyMode = concurrencyMode.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], isComplexProperty = isComplexProperty.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isInherited = isInherited.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isNullable = isNullable.asInstanceOf[js.Any], isPartOfKey = isPartOfKey.asInstanceOf[js.Any], isUnmapped = isUnmapped.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedNavigationProperty = relatedNavigationProperty.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProperty]
  }
  @scala.inline
  implicit class DataPropertyOps[Self <: DataProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConcurrencyMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: DataTypeSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComplexProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComplexProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInherited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPartOfKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartOfKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUnmapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnmapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedNavigationProperty(value: NavigationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedNavigationProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

