package typingsSlinky.netconf.anon

import typingsSlinky.netconf.netconfStrings.`override`
import typingsSlinky.netconf.netconfStrings.merge
import typingsSlinky.netconf.netconfStrings.replace
import typingsSlinky.netconf.netconfStrings.set
import typingsSlinky.netconf.netconfStrings.text
import typingsSlinky.netconf.netconfStrings.update
import typingsSlinky.netconf.netconfStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  var action: js.UndefOr[merge | replace | `override` | update | set] = js.native
  
  var config: js.Any = js.native
  
  var format: js.UndefOr[text | xml] = js.native
}
object Action {
  
  @scala.inline
  def apply(config: js.Any): Action = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: merge | replace | `override` | update | set): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setFormat(value: text | xml): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
