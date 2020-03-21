package typingsSlinky.rcSlider

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String | ReactElement
  var style: js.Any
}

object AnonLabel {
  @scala.inline
  def apply(label: String | ReactElement, style: js.Any): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLabel]
  }
}

