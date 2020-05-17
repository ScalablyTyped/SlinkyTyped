package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProperty extends IProperty {
  var associationName: String = js.native
  var entityType: EntityType = js.native
  var foreignKeyNames: js.Array[String] = js.native
  var inverse: NavigationProperty = js.native
  var isScalar: Boolean = js.native
  var relatedDataProperties: js.Array[DataProperty] = js.native
}

object NavigationProperty {
  @scala.inline
  def apply(
    associationName: String,
    displayName: String,
    entityType: EntityType,
    foreignKeyNames: js.Array[String],
    inverse: NavigationProperty,
    isDataProperty: Boolean,
    isNavigationProperty: Boolean,
    isScalar: Boolean,
    name: String,
    nameOnServer: String,
    parentType: IStructuralType,
    relatedDataProperties: js.Array[DataProperty],
    validators: js.Array[Validator]
  ): NavigationProperty = {
    val __obj = js.Dynamic.literal(associationName = associationName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], foreignKeyNames = foreignKeyNames.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], isDataProperty = isDataProperty.asInstanceOf[js.Any], isNavigationProperty = isNavigationProperty.asInstanceOf[js.Any], isScalar = isScalar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameOnServer = nameOnServer.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], relatedDataProperties = relatedDataProperties.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProperty]
  }
  @scala.inline
  implicit class NavigationPropertyOps[Self <: NavigationProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityType(value: EntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForeignKeyNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foreignKeyNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverse(value: NavigationProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScalar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedDataProperties(value: js.Array[DataProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedDataProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

