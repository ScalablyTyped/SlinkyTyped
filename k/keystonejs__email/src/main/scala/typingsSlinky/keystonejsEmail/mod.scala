package typingsSlinky.keystonejsEmail

import typingsSlinky.keystonejsEmail.anon.Root
import typingsSlinky.keystonejsEmail.anon.Send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keystonejs/email", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val emailSender: MailSenderBuilder = js.native
  
  @js.native
  trait MailSenderBuilder extends js.Object {
    
    def jsx(): Sender = js.native
    def jsx(opts: Root): Sender = js.native
    
    def mjml(): Sender = js.native
    def mjml(opts: Root): Sender = js.native
    
    def pug(): Sender = js.native
    def pug(opts: Root): Sender = js.native
  }
  
  type Sender = js.Function1[/* fileName */ String, Send]
}
