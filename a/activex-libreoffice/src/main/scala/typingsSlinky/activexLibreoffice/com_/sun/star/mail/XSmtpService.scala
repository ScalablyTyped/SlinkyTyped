package typingsSlinky.activexLibreoffice.com_.sun.star.mail

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XCurrentContext
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a SMTP service abstraction.
  * @see com.sun.star.mail.XMailService
  * @see com.sun.star.mail.XMailMessage
  * @since OOo 2.0
  */
@js.native
trait XSmtpService extends XMailService {
  
  /**
    * Send a mail message to its recipients.
    * @param xMailMessage [in] the mail message to be sent.
    * @see com.sun.star.mail.XMailMessage
    * @see com.sun.star.io.NotConnectedException
    * @see com.sun.star.mail.SendMailMessageFailedException
    * @see com.sun.star.mail.MailException
    * @see com.sun.star.datatransfer.UnsupportedFlavorException
    * @throws com::sun::star::io::NotConnectedException if no user is currently connected to the mail server.
    * @throws com::sun::star::mail::SendMailMessageFailedException if the message could not be sent because of invalid recipient addresses. The e-mail addresse
    * @throws com::sun::star::mail::MailException is thrown on other errors that may happen during sending. A possible reason may be for instance that a file a
    * @throws com::sun::star::datatransfer::UnsupportedFlavorException is thrown when the body of the mail message is provided in an unsupported mime content t
    */
  def sendMailMessage(xMailMessage: XMailMessage): Unit = js.native
}
object XSmtpService {
  
  @scala.inline
  def apply(
    CurrentConnectionContext: XCurrentContext,
    SupportedConnectionTypes: SafeArray[String],
    acquire: () => Unit,
    addConnectionListener: XConnectionListener => Unit,
    connect: (XCurrentContext, XAuthenticator) => Unit,
    disconnect: () => Unit,
    getCurrentConnectionContext: () => XCurrentContext,
    getSupportedConnectionTypes: () => SafeArray[String],
    isConnected: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeConnectionListener: XConnectionListener => Unit,
    sendMailMessage: XMailMessage => Unit
  ): XSmtpService = {
    val __obj = js.Dynamic.literal(CurrentConnectionContext = CurrentConnectionContext.asInstanceOf[js.Any], SupportedConnectionTypes = SupportedConnectionTypes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addConnectionListener = js.Any.fromFunction1(addConnectionListener), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction0(disconnect), getCurrentConnectionContext = js.Any.fromFunction0(getCurrentConnectionContext), getSupportedConnectionTypes = js.Any.fromFunction0(getSupportedConnectionTypes), isConnected = js.Any.fromFunction0(isConnected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConnectionListener = js.Any.fromFunction1(removeConnectionListener), sendMailMessage = js.Any.fromFunction1(sendMailMessage))
    __obj.asInstanceOf[XSmtpService]
  }
  
  @scala.inline
  implicit class XSmtpServiceOps[Self <: XSmtpService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSendMailMessage(value: XMailMessage => Unit): Self = this.set("sendMailMessage", js.Any.fromFunction1(value))
  }
}
