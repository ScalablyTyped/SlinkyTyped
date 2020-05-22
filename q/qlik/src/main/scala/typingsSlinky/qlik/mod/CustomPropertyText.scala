package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.array
import typingsSlinky.qlik.qlikStrings.boolean
import typingsSlinky.qlik.qlikStrings.integer
import typingsSlinky.qlik.qlikStrings.items
import typingsSlinky.qlik.qlikStrings.number
import typingsSlinky.qlik.qlikStrings.string
import typingsSlinky.qlik.qlikStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyText
  extends CustomPropertyCommon
     with CustomProperty {
  var component: text
}

object CustomPropertyText {
  @scala.inline
  def apply(
    component: text,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyText]
  }
}

