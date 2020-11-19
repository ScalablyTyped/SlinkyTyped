package typingsSlinky.nodemailer.anon

import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.sesTransportMod.SentMessageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: js.Error, info: SentMessageInfo): Unit = js.native
  
  var mail: ^ = js.native
}
