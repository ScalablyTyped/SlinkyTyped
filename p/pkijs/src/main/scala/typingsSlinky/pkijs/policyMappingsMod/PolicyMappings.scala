package typingsSlinky.pkijs.policyMappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyMappings extends js.Object {
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  var mappings: js.Array[typingsSlinky.pkijs.policyMappingMod.default] = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object PolicyMappings {
  
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    mappings: js.Array[typingsSlinky.pkijs.policyMappingMod.default],
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PolicyMappings = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mappings = mappings.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PolicyMappings]
  }
  
  @scala.inline
  implicit class PolicyMappingsOps[Self <: PolicyMappings] (val x: Self) extends AnyVal {
    
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMappingsVarargs(value: typingsSlinky.pkijs.policyMappingMod.default*): Self = this.set("mappings", js.Array(value :_*))
    
    @scala.inline
    def setMappings(value: js.Array[typingsSlinky.pkijs.policyMappingMod.default]): Self = this.set("mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
