package typingsSlinky.meteor.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.meteor.MailComposerOptions
import typingsSlinky.meteor.MailComposerStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MailComposer")
@js.native
class MailComposer protected ()
  extends typingsSlinky.meteor.MailComposer {
  def this(options: MailComposerOptions) = this()
  /* CompleteClass */
  override def addHeader(name: String, value: String): Unit = js.native
  /* CompleteClass */
  override def pipe(stream: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  /* CompleteClass */
  override def streamMessage(): Unit = js.native
}

@JSGlobal("MailComposer")
@js.native
object MailComposer extends TopLevel[MailComposerStatic]

