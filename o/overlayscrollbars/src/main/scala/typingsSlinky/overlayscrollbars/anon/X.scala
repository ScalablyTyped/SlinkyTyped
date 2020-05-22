package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.Position
import typingsSlinky.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends _Coordinates {
  var x: js.UndefOr[Position] = js.undefined
  var y: js.UndefOr[Position] = js.undefined
}

object X {
  @scala.inline
  def apply(x: Position = null, y: Position = null): X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

