package typingsSlinky.nodemailer.anon

import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.sesTransportMod.SentMessageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  var mail: ^ = js.native
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: js.Error, info: SentMessageInfo): Unit = js.native
}

