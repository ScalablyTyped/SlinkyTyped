package typingsSlinky.graphql.getIntrospectionQueryMod

import typingsSlinky.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionEnumValue extends js.Object {
  
  val deprecationReason: js.UndefOr[Maybe[String]] = js.native
  
  val description: js.UndefOr[Maybe[String]] = js.native
  
  val isDeprecated: Boolean = js.native
  
  val name: String = js.native
}
object IntrospectionEnumValue {
  
  @scala.inline
  def apply(isDeprecated: Boolean, name: String): IntrospectionEnumValue = {
    val __obj = js.Dynamic.literal(isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumValue]
  }
  
  @scala.inline
  implicit class IntrospectionEnumValueOps[Self <: IntrospectionEnumValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsDeprecated(value: Boolean): Self = this.set("isDeprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecationReason(value: Maybe[String]): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    
    @scala.inline
    def setDeprecationReasonNull: Self = this.set("deprecationReason", null)
    
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
  }
}
