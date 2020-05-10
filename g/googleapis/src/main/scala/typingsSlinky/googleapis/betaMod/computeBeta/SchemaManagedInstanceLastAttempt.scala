package typingsSlinky.googleapis.betaMod.computeBeta

import typingsSlinky.googleapis.AnonErrorsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedInstanceLastAttempt extends js.Object {
  /**
    * [Output Only] Encountered errors during the last attempt to create or
    * delete the instance.
    */
  var errors: js.UndefOr[AnonErrorsArray] = js.native
}

object SchemaManagedInstanceLastAttempt {
  @scala.inline
  def apply(): SchemaManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedInstanceLastAttempt]
  }
  @scala.inline
  implicit class SchemaManagedInstanceLastAttemptOps[Self <: SchemaManagedInstanceLastAttempt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: AnonErrorsArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

