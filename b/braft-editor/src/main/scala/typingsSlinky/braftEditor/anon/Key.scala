package typingsSlinky.braftEditor.anon

import slinky.core.TagMod
import typingsSlinky.braftEditor.mod.BuiltInControlType
import typingsSlinky.braftEditor.mod.ControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends ControlType {
  var key: BuiltInControlType
  var text: js.UndefOr[String | TagMod[Any]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: BuiltInControlType, text: String | TagMod[Any] = null, title: String = null): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

