package typingsSlinky.ionicCliFramework.outputMod

import typingsSlinky.ionicCliFramework.tasksMod.TaskChain
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputStrategy extends js.Object {
  val stream: WritableStream = js.native
  def createTaskChain(): TaskChain = js.native
}

object OutputStrategy {
  @scala.inline
  def apply(createTaskChain: () => TaskChain, stream: WritableStream): OutputStrategy = {
    val __obj = js.Dynamic.literal(createTaskChain = js.Any.fromFunction0(createTaskChain), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputStrategy]
  }
  @scala.inline
  implicit class OutputStrategyOps[Self <: OutputStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTaskChain(value: () => TaskChain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTaskChain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStream(value: WritableStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

