package typingsSlinky.ioredis.mod

import typingsSlinky.ioredis.anon.Lua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commander extends js.Object {
  def createBuiltinCommand(commandName: String): js.Object = js.native
  def defineCommand(name: String, definition: Lua): Unit = js.native
  def getBuiltinCommands(): js.Array[String] = js.native
  def sendCommand(): Unit = js.native
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: String => js.Object,
    defineCommand: (String, Lua) => Unit,
    getBuiltinCommands: () => js.Array[String],
    sendCommand: () => Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
    __obj.asInstanceOf[Commander]
  }
  @scala.inline
  implicit class CommanderOps[Self <: Commander] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateBuiltinCommand(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createBuiltinCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefineCommand(value: (String, Lua) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBuiltinCommands(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBuiltinCommands")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSendCommand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendCommand")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

