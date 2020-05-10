package typingsSlinky.reactNativeMaterialUi

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultActionsContainer extends js.Object {
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.native
}

object AnonDefaultActionsContainer {
  @scala.inline
  def apply(): AnonDefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultActionsContainer]
  }
  @scala.inline
  implicit class AnonDefaultActionsContainerOps[Self <: AnonDefaultActionsContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultActionsContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultActionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultActionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultActionsContainer")(null)
        ret
    }
  }
  
}

