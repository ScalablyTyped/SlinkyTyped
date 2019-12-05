package typingsSlinky.braftDashEditor

import slinky.core.TagMod
import typingsSlinky.braftDashEditor.braftDashEditorMod.BuiltInControlType
import typingsSlinky.braftDashEditor.braftDashEditorMod.ControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends ControlType {
  var key: BuiltInControlType
  var text: js.UndefOr[String | TagMod[Any]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: BuiltInControlType, text: String | TagMod[Any] = null, title: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

