package typingsSlinky.keystonejsKeystone.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'> */
@js.native
trait PickResolveInputHooksOptiContext extends js.Object {
  
  var context: js.Any = js.native
  
  var existingItem: js.Any = js.native
  
  var list: QueryMany = js.native
  
  var originalInput: js.Any = js.native
  
  var updatedItem: js.Any = js.native
}
object PickResolveInputHooksOptiContext {
  
  @scala.inline
  def apply(context: js.Any, existingItem: js.Any, list: QueryMany, originalInput: js.Any, updatedItem: js.Any): PickResolveInputHooksOptiContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickResolveInputHooksOptiContext]
  }
  
  @scala.inline
  implicit class PickResolveInputHooksOptiContextOps[Self <: PickResolveInputHooksOptiContext] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingItem(value: js.Any): Self = this.set("existingItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: QueryMany): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalInput(value: js.Any): Self = this.set("originalInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedItem(value: js.Any): Self = this.set("updatedItem", value.asInstanceOf[js.Any])
  }
}
