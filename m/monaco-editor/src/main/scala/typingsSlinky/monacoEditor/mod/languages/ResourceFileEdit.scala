package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.IgnoreIfExists
import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceFileEdit extends js.Object {
  var newUri: Uri = js.native
  var oldUri: Uri = js.native
  var options: IgnoreIfExists = js.native
}

object ResourceFileEdit {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri, options: IgnoreIfExists): ResourceFileEdit = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFileEdit]
  }
  @scala.inline
  implicit class ResourceFileEditOps[Self <: ResourceFileEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: IgnoreIfExists): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

