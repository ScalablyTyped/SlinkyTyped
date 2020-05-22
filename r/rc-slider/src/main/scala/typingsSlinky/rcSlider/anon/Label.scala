package typingsSlinky.rcSlider.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String | ReactElement
  var style: js.Any
}

object Label {
  @scala.inline
  def apply(label: String | ReactElement, style: js.Any): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

