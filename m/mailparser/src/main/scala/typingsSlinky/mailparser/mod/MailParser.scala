package typingsSlinky.mailparser.mod

import typingsSlinky.mailparser.mailparserStrings.data
import typingsSlinky.mailparser.mailparserStrings.headers
import typingsSlinky.mailparser.mailparserStrings.readable
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mailparser", "MailParser")
@js.native
class MailParser () extends Transform {
  def this(options: TransformOptions) = this()
  @JSName("on")
  def on_data(event: data, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
  @JSName("on")
  def on_headers(event: headers, callback: js.Function1[/* headers */ Headers, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, callback: js.Function1[/* data */ AttachmentStream | MessageText, Unit]): this.type = js.native
}

