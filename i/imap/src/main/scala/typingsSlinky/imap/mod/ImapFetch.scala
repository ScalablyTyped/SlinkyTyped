package typingsSlinky.imap.mod

import typingsSlinky.imap.imapStrings.error
import typingsSlinky.imap.imapStrings.message
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImapFetch extends EventEmitter {
  
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ ImapMessage, /* seqno */ Double, Unit]): this.type = js.native
  
  def once(event: String, listener: js.Function): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
}
