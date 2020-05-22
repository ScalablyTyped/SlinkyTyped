package typingsSlinky.computeScrollIntoView.mod.global

import typingsSlinky.computeScrollIntoView.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var visualViewport: js.UndefOr[Height] = js.undefined
}

object Window {
  @scala.inline
  def apply(visualViewport: Height = null): Window = {
    val __obj = js.Dynamic.literal()
    if (visualViewport != null) __obj.updateDynamic("visualViewport")(visualViewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

