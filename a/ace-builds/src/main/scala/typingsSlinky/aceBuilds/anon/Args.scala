package typingsSlinky.aceBuilds.anon

import typingsSlinky.aceBuilds.mod.Ace.Command
import typingsSlinky.aceBuilds.mod.Ace.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends js.Object {
  
  var args: js.Array[_] = js.native
  
  var command: Command = js.native
  
  var editor: Editor = js.native
}
object Args {
  
  @scala.inline
  def apply(args: js.Array[_], command: Command, editor: Editor): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: Command): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: Editor): Self = this.set("editor", value.asInstanceOf[js.Any])
  }
}
