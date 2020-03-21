package typingsSlinky.qrcodeSvg

import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.g
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.none
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: svg | g | none
}

object AnonContainer {
  @scala.inline
  def apply(container: svg | g | none): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainer]
  }
}

