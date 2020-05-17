package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailComposer extends js.Object {
  def addHeader(name: String, value: String): Unit = js.native
  def pipe(stream: js.Any): Unit = js.native
  def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
  def streamMessage(): Unit = js.native
}

object MailComposer {
  @scala.inline
  def apply(
    addHeader: (String, String) => Unit,
    pipe: js.Any => Unit,
    setMessageOption: (String, String, String, String) => Unit,
    streamMessage: () => Unit
  ): MailComposer = {
    val __obj = js.Dynamic.literal(addHeader = js.Any.fromFunction2(addHeader), pipe = js.Any.fromFunction1(pipe), setMessageOption = js.Any.fromFunction4(setMessageOption), streamMessage = js.Any.fromFunction0(streamMessage))
    __obj.asInstanceOf[MailComposer]
  }
  @scala.inline
  implicit class MailComposerOps[Self <: MailComposer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPipe(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMessageOption(value: (String, String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMessageOption")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withStreamMessage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamMessage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

