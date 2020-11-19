package typingsSlinky.imap.mod

import typingsSlinky.imap.imapStrings.attributes
import typingsSlinky.imap.imapStrings.body
import typingsSlinky.imap.imapStrings.end
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImapMessage extends EventEmitter {
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_attributes(event: attributes, listener: js.Function1[/* attrs */ ImapMessageAttributes, Unit]): this.type = js.native
  @JSName("on")
  def on_body(
    event: body,
    listener: js.Function2[/* stream */ ReadableStream, /* info */ ImapMessageBodyInfo, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
}
