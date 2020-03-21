package typingsSlinky.antdMobile.actionSheetMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOption extends js.Object {
  var icon: TagMod[Any]
  var title: String
}

object ShareOption {
  @scala.inline
  def apply(icon: TagMod[Any], title: String): ShareOption = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShareOption]
  }
}

