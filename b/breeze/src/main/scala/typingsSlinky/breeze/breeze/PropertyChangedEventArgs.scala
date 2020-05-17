package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChangedEventArgs extends js.Object {
  var entity: Entity = js.native
  var newValue: js.Any = js.native
  var oldValue: js.Any = js.native
  var parent: js.Any = js.native
  var property: IProperty = js.native
  var propertyName: String = js.native
}

object PropertyChangedEventArgs {
  @scala.inline
  def apply(
    entity: Entity,
    newValue: js.Any,
    oldValue: js.Any,
    parent: js.Any,
    property: IProperty,
    propertyName: String
  ): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
  @scala.inline
  implicit class PropertyChangedEventArgsOps[Self <: PropertyChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: IProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

