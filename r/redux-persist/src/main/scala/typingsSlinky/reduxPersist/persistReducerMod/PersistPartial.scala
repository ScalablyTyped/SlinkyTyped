package typingsSlinky.reduxPersist.persistReducerMod

import typingsSlinky.reduxPersist.typesMod.PersistState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistPartial extends js.Object {
  var _persist: PersistState = js.native
}

object PersistPartial {
  @scala.inline
  def apply(_persist: PersistState): PersistPartial = {
    val __obj = js.Dynamic.literal(_persist = _persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistPartial]
  }
  @scala.inline
  implicit class PersistPartialOps[Self <: PersistPartial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_persist(value: PersistState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_persist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

