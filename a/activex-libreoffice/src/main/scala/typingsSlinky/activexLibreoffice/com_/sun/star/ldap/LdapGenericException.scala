package typingsSlinky.activexLibreoffice.com_.sun.star.ldap

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic exception occurring during access to an LDAP server. The actual LDAP error code is provided for more refined error management.
  * @since OOo 1.1.2
  */
@js.native
trait LdapGenericException extends Exception {
  /** LDAP error code, see LDAP SDK documentation for complete list of possible values and their meaning. */
  var ErrorCode: Double = js.native
}

object LdapGenericException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String): LdapGenericException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[LdapGenericException]
  }
  @scala.inline
  implicit class LdapGenericExceptionOps[Self <: LdapGenericException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

