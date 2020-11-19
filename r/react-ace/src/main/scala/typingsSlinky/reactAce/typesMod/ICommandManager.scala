package typingsSlinky.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommandManager extends js.Object {
  
  def addCommand(command: js.Any): Unit = js.native
  
  def addCommands(commands: js.Array[_]): Unit = js.native
  
  var bindKey: js.UndefOr[js.Function2[/* bindKey */ js.Any, /* command */ js.Any, Unit]] = js.native
  
  var byName: js.Any = js.native
  
  var commands: js.Any = js.native
  
  def exec(name: String, editor: js.Any, args: js.Any): Unit = js.native
  
  var platform: String = js.native
}
object ICommandManager {
  
  @scala.inline
  def apply(
    addCommand: js.Any => Unit,
    addCommands: js.Array[_] => Unit,
    byName: js.Any,
    commands: js.Any,
    exec: (String, js.Any, js.Any) => Unit,
    platform: String
  ): ICommandManager = {
    val __obj = js.Dynamic.literal(addCommand = js.Any.fromFunction1(addCommand), addCommands = js.Any.fromFunction1(addCommands), byName = byName.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], exec = js.Any.fromFunction3(exec), platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandManager]
  }
  
  @scala.inline
  implicit class ICommandManagerOps[Self <: ICommandManager] (val x: Self) extends AnyVal {
    
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
    def setAddCommand(value: js.Any => Unit): Self = this.set("addCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddCommands(value: js.Array[_] => Unit): Self = this.set("addCommands", js.Any.fromFunction1(value))
    
    @scala.inline
    def setByName(value: js.Any): Self = this.set("byName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: js.Any): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExec(value: (String, js.Any, js.Any) => Unit): Self = this.set("exec", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindKey(value: (/* bindKey */ js.Any, /* command */ js.Any) => Unit): Self = this.set("bindKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBindKey: Self = this.set("bindKey", js.undefined)
  }
}
