package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableVersionResponse extends js.Object {
  /**
    * A list of errors encountered while trying to delete the specified table versions.
    */
  var Errors: js.UndefOr[TableVersionErrors] = js.native
}

object BatchDeleteTableVersionResponse {
  @scala.inline
  def apply(): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
  @scala.inline
  implicit class BatchDeleteTableVersionResponseOps[Self <: BatchDeleteTableVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: TableVersionErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
  }
  
}

