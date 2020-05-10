package typingsSlinky.mockingoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var __mocks: js.Any = js.native
  /**
    * Resets all mocks.
    */
  def resetAll(): Unit = js.native
  /**
    * Returns an object of mocks for all models. Only serializable if all mock results are primitives, not functions.
    */
  def toJSON(): js.Any = js.native
}

object Target {
  @scala.inline
  def apply(__mocks: js.Any, resetAll: () => Unit, toJSON: () => js.Any): Target = {
    val __obj = js.Dynamic.literal(__mocks = __mocks.asInstanceOf[js.Any], resetAll = js.Any.fromFunction0(resetAll), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__mocks(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

