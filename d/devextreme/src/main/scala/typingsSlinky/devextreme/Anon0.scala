package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.horizontal
import typingsSlinky.devextreme.devextremeStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(orientation: horizontal | vertical = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

