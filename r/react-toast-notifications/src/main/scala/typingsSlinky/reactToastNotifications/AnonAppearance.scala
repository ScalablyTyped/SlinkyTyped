package typingsSlinky.reactToastNotifications

import slinky.core.TagMod
import typingsSlinky.reactToastNotifications.mod.AppearanceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearance extends js.Object {
  var appearance: AppearanceTypes
  var content: TagMod[Any]
  var id: String
}

object AnonAppearance {
  @scala.inline
  def apply(appearance: AppearanceTypes, content: TagMod[Any], id: String): AnonAppearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppearance]
  }
}

