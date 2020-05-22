package typingsSlinky.antd.anon

import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[Double | small | large | default] = js.undefined
}

object Shape {
  @scala.inline
  def apply(shape: circle | square = null, size: Double | small | large | default = null): Shape = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

