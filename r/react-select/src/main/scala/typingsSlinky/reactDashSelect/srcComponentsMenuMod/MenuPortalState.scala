package typingsSlinky.reactDashSelect.srcComponentsMenuMod

import typingsSlinky.reactDashSelect.reactDashSelectStrings.bottom
import typingsSlinky.reactDashSelect.reactDashSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuPortalState extends js.Object {
  var placement: bottom | top | Null
}

object MenuPortalState {
  @scala.inline
  def apply(placement: bottom | top = null): MenuPortalState = {
    val __obj = js.Dynamic.literal()
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPortalState]
  }
}

