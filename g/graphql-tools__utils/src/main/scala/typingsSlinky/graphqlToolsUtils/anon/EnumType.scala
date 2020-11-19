package typingsSlinky.graphqlToolsUtils.anon

import typingsSlinky.graphql.mod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumType extends js.Object {
  
  var enumType: GraphQLEnumType = js.native
}
object EnumType {
  
  @scala.inline
  def apply(enumType: GraphQLEnumType): EnumType = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
  
  @scala.inline
  implicit class EnumTypeOps[Self <: EnumType] (val x: Self) extends AnyVal {
    
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
    def setEnumType(value: GraphQLEnumType): Self = this.set("enumType", value.asInstanceOf[js.Any])
  }
}
