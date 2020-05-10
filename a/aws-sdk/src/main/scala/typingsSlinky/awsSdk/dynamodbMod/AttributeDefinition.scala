package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDefinition extends js.Object {
  /**
    * A name for the attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  /**
    * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
    */
  var AttributeType: ScalarAttributeType = js.native
}

object AttributeDefinition {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDefinition]
  }
  @scala.inline
  implicit class AttributeDefinitionOps[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: KeySchemaAttributeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeType(value: ScalarAttributeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

