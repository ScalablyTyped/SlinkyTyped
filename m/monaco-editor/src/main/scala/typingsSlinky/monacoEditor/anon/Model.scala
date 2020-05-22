package typingsSlinky.monacoEditor.anon

import typingsSlinky.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  val model: ITextModel
  val oldLanguage: String
}

object Model {
  @scala.inline
  def apply(model: ITextModel, oldLanguage: String): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

