package typingsSlinky.mitsobox

import typingsSlinky.mitsobox.mitsoboxStrings.ABORT
import typingsSlinky.mitsobox.mitsoboxStrings.CANCEL
import typingsSlinky.mitsobox.mitsoboxStrings.IGNORE
import typingsSlinky.mitsobox.mitsoboxStrings.OK
import typingsSlinky.mitsobox.mitsoboxStrings.RETRY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mitsobox", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def abortRetryIgnore(title: String, message: String): js.Promise[ABORT | RETRY | IGNORE] = js.native
  def ok(title: String, message: String): js.Promise[Unit] = js.native
  def okCancel(title: String, message: String): js.Promise[OK | CANCEL] = js.native
}

