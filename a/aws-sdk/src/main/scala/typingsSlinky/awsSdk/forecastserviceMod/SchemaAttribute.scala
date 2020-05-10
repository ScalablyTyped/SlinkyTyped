package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAttribute extends js.Object {
  /**
    * The name of the dataset field.
    */
  var AttributeName: js.UndefOr[Name] = js.native
  /**
    * The data type of the field.
    */
  var AttributeType: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.AttributeType] = js.native
}

object SchemaAttribute {
  @scala.inline
  def apply(): SchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttribute]
  }
  @scala.inline
  implicit class SchemaAttributeOps[Self <: SchemaAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeType(value: AttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(js.undefined)
        ret
    }
  }
  
}

