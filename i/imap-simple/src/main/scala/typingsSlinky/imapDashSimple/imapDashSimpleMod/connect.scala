package typingsSlinky.imapDashSimple.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imap-simple", "connect")
@js.native
object connect extends js.Object {
  def apply(options: ImapSimpleOptions): js.Promise[ImapSimple] = js.native
  def apply(
    options: ImapSimpleOptions,
    callback: js.Function2[/* err */ js.Error, /* connection */ ImapSimple, Unit]
  ): Unit = js.native
}

