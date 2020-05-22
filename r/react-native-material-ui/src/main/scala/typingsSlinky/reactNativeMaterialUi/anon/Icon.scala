package typingsSlinky.reactNativeMaterialUi.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: String | ReactElement
  var label: String
  var name: String
}

object Icon {
  @scala.inline
  def apply(icon: String | ReactElement, label: String, name: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

