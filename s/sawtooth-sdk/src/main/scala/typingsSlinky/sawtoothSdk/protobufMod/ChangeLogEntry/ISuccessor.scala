package typingsSlinky.sawtoothSdk.protobufMod.ChangeLogEntry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Successor. */
@js.native
trait ISuccessor extends js.Object {
  /** Successor deletions */
  var deletions: js.UndefOr[js.Array[js.typedarray.Uint8Array] | Null] = js.native
  /** Successor successor */
  var successor: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}

object ISuccessor {
  @scala.inline
  def apply(): ISuccessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuccessor]
  }
  @scala.inline
  implicit class ISuccessorOps[Self <: ISuccessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletions(value: js.Array[js.typedarray.Uint8Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletions")(null)
        ret
    }
    @scala.inline
    def withSuccessor(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successor")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successor")(null)
        ret
    }
  }
  
}

