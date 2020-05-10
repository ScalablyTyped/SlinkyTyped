package typingsSlinky.lestate.mod

import typingsSlinky.lestate.AnonForce
import typingsSlinky.lestate.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeState extends js.Object {
  def createListener(options: AnonForce): Unit = js.native
  def get(): js.Any = js.native
  def getDescription(): js.Object = js.native
  def insert(newValue: js.Object): Unit = js.native
  def set(newValue: js.Object): js.Array[AnonId] = js.native
}

object LeState {
  @scala.inline
  def apply(
    createListener: AnonForce => Unit,
    get: () => js.Any,
    getDescription: () => js.Object,
    insert: js.Object => Unit,
    set: js.Object => js.Array[AnonId]
  ): LeState = {
    val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1(createListener), get = js.Any.fromFunction0(get), getDescription = js.Any.fromFunction0(getDescription), insert = js.Any.fromFunction1(insert), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[LeState]
  }
  @scala.inline
  implicit class LeStateOps[Self <: LeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateListener(value: AnonForce => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDescription(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDescription")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Object => js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

