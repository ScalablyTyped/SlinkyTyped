package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLensList extends js.Object {
  var lenses: js.Array[CodeLens] = js.native
  def dispose(): Unit = js.native
}

object CodeLensList {
  @scala.inline
  def apply(dispose: () => Unit, lenses: js.Array[CodeLens]): CodeLensList = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), lenses = lenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLensList]
  }
  @scala.inline
  implicit class CodeLensListOps[Self <: CodeLensList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLenses(value: js.Array[CodeLens]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenses")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

