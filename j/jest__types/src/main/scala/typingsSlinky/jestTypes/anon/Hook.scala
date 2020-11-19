package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.jestTypesStrings.hook_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook extends Event {
  
  var hook: typingsSlinky.jestTypes.circusMod.Hook = js.native
  
  var name: hook_start = js.native
}
object Hook {
  
  @scala.inline
  def apply(hook: typingsSlinky.jestTypes.circusMod.Hook, name: hook_start): Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit class HookOps[Self <: Hook] (val x: Self) extends AnyVal {
    
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
    def setHook(value: typingsSlinky.jestTypes.circusMod.Hook): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: hook_start): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
