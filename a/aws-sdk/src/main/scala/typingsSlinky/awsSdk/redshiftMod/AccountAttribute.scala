package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAttribute extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[String] = js.native
  
  /**
    * A list of attribute values.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}
object AccountAttribute {
  
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  
  @scala.inline
  implicit class AccountAttributeOps[Self <: AccountAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeValuesVarargs(value: AttributeValueTarget*): Self = this.set("AttributeValues", js.Array(value :_*))
    
    @scala.inline
    def setAttributeValues(value: AttributeValueList): Self = this.set("AttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValues: Self = this.set("AttributeValues", js.undefined)
  }
}
