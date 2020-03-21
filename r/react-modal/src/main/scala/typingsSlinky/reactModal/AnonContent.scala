package typingsSlinky.reactModal

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: Null | HTMLDivElement
  var overlay: Null | Element
}

object AnonContent {
  @scala.inline
  def apply(content: HTMLDivElement = null, overlay: Element = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

