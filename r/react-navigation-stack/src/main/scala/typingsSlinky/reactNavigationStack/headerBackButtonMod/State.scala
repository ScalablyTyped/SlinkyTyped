package typingsSlinky.reactNavigationStack.headerBackButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var initialTextWidth: js.UndefOr[Double] = js.undefined
}

object State {
  @scala.inline
  def apply(initialTextWidth: js.UndefOr[Double] = js.undefined): State = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initialTextWidth)) __obj.updateDynamic("initialTextWidth")(initialTextWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

