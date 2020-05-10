package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.editor.IMarkerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeActionContext extends js.Object {
  /**
    * An array of diagnostics.
    */
  val markers: js.Array[IMarkerData] = js.native
  /**
    * Requested kind of actions to return.
    */
  val only: js.UndefOr[String] = js.native
}

object CodeActionContext {
  @scala.inline
  def apply(markers: js.Array[IMarkerData]): CodeActionContext = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  @scala.inline
  implicit class CodeActionContextOps[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkers(value: js.Array[IMarkerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

