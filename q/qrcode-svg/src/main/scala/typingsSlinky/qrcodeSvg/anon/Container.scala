package typingsSlinky.qrcodeSvg.anon

import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.g
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.none
import typingsSlinky.qrcodeSvg.qrcodeSvgStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: svg | g | none
}

object Container {
  @scala.inline
  def apply(container: svg | g | none): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

