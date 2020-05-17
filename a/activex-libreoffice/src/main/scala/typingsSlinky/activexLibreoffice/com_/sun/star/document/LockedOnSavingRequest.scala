package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to query user decision regarding locked document on saving.
  * @since OOo 3.1
  */
@js.native
trait LockedOnSavingRequest extends Exception {
  /** The URL of the locked document. */
  var DocumentURL: String = js.native
  /** The user information of the locked document. */
  var UserInfo: String = js.native
}

object LockedOnSavingRequest {
  @scala.inline
  def apply(Context: XInterface, DocumentURL: String, Message: String, UserInfo: String): LockedOnSavingRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UserInfo = UserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockedOnSavingRequest]
  }
  @scala.inline
  implicit class LockedOnSavingRequestOps[Self <: LockedOnSavingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

