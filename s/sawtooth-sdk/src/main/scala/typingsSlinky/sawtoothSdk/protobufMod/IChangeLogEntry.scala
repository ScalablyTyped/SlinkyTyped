package typingsSlinky.sawtoothSdk.protobufMod

import typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry.ISuccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangeLogEntry extends js.Object {
  /** ChangeLogEntry additions */
  var additions: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
  /** ChangeLogEntry parent */
  var parent: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
  /** ChangeLogEntry successors */
  var successors: js.UndefOr[js.Array[ISuccessor] | Null] = js.native
}

object IChangeLogEntry {
  @scala.inline
  def apply(): IChangeLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChangeLogEntry]
  }
  @scala.inline
  implicit class IChangeLogEntryOps[Self <: IChangeLogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditions(value: js.Array[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additions")(null)
        ret
    }
    @scala.inline
    def withParent(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withSuccessors(value: js.Array[ISuccessor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successors")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successors")(null)
        ret
    }
  }
  
}

