package typingsSlinky.nodemailer

import typingsSlinky.nodemailer.mailerMod.^
import typingsSlinky.nodemailer.sesTransportMod.SentMessageInfo
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  var mail: ^ = js.native
  def callback(err: Null, info: SentMessageInfo): Unit = js.native
  def callback(err: Error, info: SentMessageInfo): Unit = js.native
}

