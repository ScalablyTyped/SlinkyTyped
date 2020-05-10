package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileRemoveResult[TEntry] extends js.Object {
  var fileRemoved: TEntry = js.native
  var success: Boolean = js.native
}

object IFileRemoveResult {
  @scala.inline
  def apply[TEntry](fileRemoved: TEntry, success: Boolean): IFileRemoveResult[TEntry] = {
    val __obj = js.Dynamic.literal(fileRemoved = fileRemoved.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRemoveResult[TEntry]]
  }
  @scala.inline
  implicit class IFileRemoveResultOps[Self[tentry] <: IFileRemoveResult[tentry], TEntry] (val x: Self[TEntry]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntry] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntry]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntry] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntry] with Other]
    @scala.inline
    def withFileRemoved(value: TEntry): Self[TEntry] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self[TEntry] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

