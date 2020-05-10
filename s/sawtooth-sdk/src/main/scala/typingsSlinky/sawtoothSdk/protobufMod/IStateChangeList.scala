package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateChangeList extends js.Object {
  /** StateChangeList stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.native
}

object IStateChangeList {
  @scala.inline
  def apply(): IStateChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStateChangeList]
  }
  @scala.inline
  implicit class IStateChangeListOps[Self <: IStateChangeList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateChanges(value: js.Array[IStateChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateChanges")(null)
        ret
    }
  }
  
}

