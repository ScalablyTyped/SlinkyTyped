package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesConcurrentModificationExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcurrentModificationExceptionDetails extends js.Object {
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.native
}

object ConcurrentModificationExceptionDetails {
  @scala.inline
  def apply(): ConcurrentModificationExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrentModificationExceptionDetails]
  }
  @scala.inline
  implicit class ConcurrentModificationExceptionDetailsOps[Self <: ConcurrentModificationExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

