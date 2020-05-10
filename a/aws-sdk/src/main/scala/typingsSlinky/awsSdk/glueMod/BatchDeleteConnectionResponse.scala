package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteConnectionResponse extends js.Object {
  /**
    * A map of the names of connections that were not successfully deleted to error details.
    */
  var Errors: js.UndefOr[ErrorByName] = js.native
  /**
    * A list of names of the connection definitions that were successfully deleted.
    */
  var Succeeded: js.UndefOr[NameStringList] = js.native
}

object BatchDeleteConnectionResponse {
  @scala.inline
  def apply(): BatchDeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteConnectionResponse]
  }
  @scala.inline
  implicit class BatchDeleteConnectionResponseOps[Self <: BatchDeleteConnectionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: ErrorByName): Self = {
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
    @scala.inline
    def withSucceeded(value: NameStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSucceeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Succeeded")(js.undefined)
        ret
    }
  }
  
}

