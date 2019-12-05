package typingsSlinky.reactDashToastDashNotifications

import slinky.core.TagMod
import typingsSlinky.reactDashToastDashNotifications.reactDashToastDashNotificationsMod.AppearanceTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appearance extends js.Object {
  var appearance: AppearanceTypes
  var content: TagMod[Any]
  var id: String
}

object Anon_Appearance {
  @scala.inline
  def apply(appearance: AppearanceTypes, content: TagMod[Any], id: String): Anon_Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Appearance]
  }
}

