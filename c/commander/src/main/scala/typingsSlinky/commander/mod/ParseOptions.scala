package typingsSlinky.commander.mod

import typingsSlinky.commander.commanderStrings.electron
import typingsSlinky.commander.commanderStrings.node
import typingsSlinky.commander.commanderStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var from: node | electron | user = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(from: node | electron | user): ParseOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: node | electron | user): Self = this.set("from", value.asInstanceOf[js.Any])
  }
}
