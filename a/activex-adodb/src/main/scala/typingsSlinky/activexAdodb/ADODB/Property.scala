package typingsSlinky.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  @JSName("ADODB.Property_typekey")
  var ADODBDotProperty_typekey: Property = js.native
  /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
  var Attributes: PropertyAttributesEnum = js.native
  val Name: String = js.native
  val Type: DataTypeEnum = js.native
  var Value: js.Any = js.native
}

object Property {
  @scala.inline
  def apply(
    ADODBDotProperty_typekey: Property,
    Attributes: PropertyAttributesEnum,
    Name: String,
    Type: DataTypeEnum,
    Value: js.Any
  ): Property = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Property_typekey")(ADODBDotProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADODBDotProperty_typekey(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADODB.Property_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: PropertyAttributesEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DataTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

