package typingsSlinky.reactNativeShare.mod

import typingsSlinky.reactNativeShare.reactNativeShareStrings.text
import typingsSlinky.reactNativeShare.reactNativeShareStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityItem extends js.Object {
  var content: String
  var `type`: text | url
}

object ActivityItem {
  @scala.inline
  def apply(content: String, `type`: text | url): ActivityItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityItem]
  }
}

