package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTextEdit extends js.Object {
  var edits: js.Array[TextEdit] = js.native
  var modelVersionId: js.UndefOr[Double] = js.native
  var resource: Uri = js.native
}

object ResourceTextEdit {
  @scala.inline
  def apply(edits: js.Array[TextEdit], resource: Uri): ResourceTextEdit = {
    val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTextEdit]
  }
  @scala.inline
  implicit class ResourceTextEditOps[Self <: ResourceTextEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdits(value: js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelVersionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionId")(js.undefined)
        ret
    }
  }
  
}

