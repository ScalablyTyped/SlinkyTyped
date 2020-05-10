package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpResult extends IDisposable {
  var value: SignatureHelp = js.native
}

object SignatureHelpResult {
  @scala.inline
  def apply(dispose: () => Unit, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
  @scala.inline
  implicit class SignatureHelpResultOps[Self <: SignatureHelpResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: SignatureHelp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

