package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionList extends IDisposable {
  val actions: js.Array[CodeAction] = js.native
}

object CodeActionList {
  @scala.inline
  def apply(actions: js.Array[CodeAction], dispose: () => Unit): CodeActionList = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[CodeActionList]
  }
  @scala.inline
  implicit class CodeActionListOps[Self <: CodeActionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[CodeAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

