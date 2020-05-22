package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.mod.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  var buttons: js.Array[Button]
  var element: js.UndefOr[org.scalajs.dom.raw.Element] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[Button], element: org.scalajs.dom.raw.Element = null): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

