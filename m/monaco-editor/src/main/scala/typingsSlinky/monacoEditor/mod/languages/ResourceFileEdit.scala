package typingsSlinky.monacoEditor.mod.languages

import typingsSlinky.monacoEditor.anon.IgnoreIfExists
import typingsSlinky.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceFileEdit extends js.Object {
  var newUri: Uri
  var oldUri: Uri
  var options: IgnoreIfExists
}

object ResourceFileEdit {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri, options: IgnoreIfExists): ResourceFileEdit = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFileEdit]
  }
}

