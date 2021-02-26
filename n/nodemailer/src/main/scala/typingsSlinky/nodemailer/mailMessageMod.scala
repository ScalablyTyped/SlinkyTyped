package typingsSlinky.nodemailer

import typingsSlinky.nodemailer.mailerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailMessageMod {
  
  @JSImport("nodemailer/lib/mailer/mail-message", JSImport.Namespace)
  @js.native
  class ^ protected () extends MailMessage {
    def this(mailer: typingsSlinky.nodemailer.mailerMod.^, data: Options) = this()
  }
  
  @js.native
  trait MailMessage extends StObject {
    
    var data: Options = js.native
    
    var mailer: typingsSlinky.nodemailer.mailerMod.^ = js.native
    
    var message: typingsSlinky.nodemailer.mimeNodeMod.^ = js.native
    
    def normalize(
      callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Options], Unit]
    ): Unit = js.native
    
    def resolveAll(
      callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* data */ js.UndefOr[Options], Unit]
    ): Unit = js.native
    
    def resolveContent(
      data: js.Array[_],
      key: String,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[js.Any], _]
    ): js.Promise[_] = js.native
    def resolveContent(
      data: js.Array[_],
      key: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[js.Any], _]
    ): js.Promise[_] = js.native
    def resolveContent(
      data: js.Object,
      key: String,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[js.Any], _]
    ): js.Promise[_] = js.native
    def resolveContent(
      data: js.Object,
      key: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ js.UndefOr[js.Any], _]
    ): js.Promise[_] = js.native
    
    def setListHeaders(): Unit = js.native
    
    def setMailerHeader(): Unit = js.native
    
    def setPriorityHeaders(): Unit = js.native
  }
}
