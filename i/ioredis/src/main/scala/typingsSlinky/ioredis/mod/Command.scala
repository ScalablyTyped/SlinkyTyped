package typingsSlinky.ioredis.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  var args: js.Array[ValueType] = js.native
  var isCustomCommand: Boolean = js.native
  def getKeys(): js.Array[String | Buffer] = js.native
  def getSlot(): Double | Null = js.native
}

object Command {
  @scala.inline
  def apply(
    args: js.Array[ValueType],
    getKeys: () => js.Array[String | Buffer],
    getSlot: () => Double | Null,
    isCustomCommand: Boolean
  ): Command = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], getKeys = js.Any.fromFunction0(getKeys), getSlot = js.Any.fromFunction0(getSlot), isCustomCommand = isCustomCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[ValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKeys(value: () => js.Array[String | Buffer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSlot(value: () => Double | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCustomCommand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomCommand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

