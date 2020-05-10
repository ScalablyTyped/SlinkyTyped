package typingsSlinky.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// $CommandQueue from `command_queue.coffee` - a lot to type. Might be more useful if it was written in TS
@js.native
trait CommandQueue extends ObjectLike {
  def add(obj: js.Any): js.Any = js.native
  def create(): CommandQueue = js.native
  def get(): js.Any = js.native
  def logs(filters: js.Any): js.Any = js.native
  def toJSON(): js.Array[String] = js.native
}

object CommandQueue {
  @scala.inline
  def apply(
    add: js.Any => js.Any,
    create: () => CommandQueue,
    get: () => js.Any,
    logs: js.Any => js.Any,
    toJSON: () => js.Array[String]
  ): CommandQueue = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), create = js.Any.fromFunction0(create), get = js.Any.fromFunction0(get), logs = js.Any.fromFunction1(logs), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[CommandQueue]
  }
  @scala.inline
  implicit class CommandQueueOps[Self <: CommandQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: () => CommandQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogs(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

