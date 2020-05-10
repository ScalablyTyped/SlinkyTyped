package typingsSlinky.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockWorkingCopyResponse extends js.Object {
  var merge: ILockData = js.native
  var previousMerge: ILockData | Null = js.native
}

object ILockWorkingCopyResponse {
  @scala.inline
  def apply(merge: ILockData): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
  @scala.inline
  implicit class ILockWorkingCopyResponseOps[Self <: ILockWorkingCopyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerge(value: ILockData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousMerge(value: ILockData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousMergeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMerge")(null)
        ret
    }
  }
  
}

