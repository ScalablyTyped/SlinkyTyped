package typingsSlinky.reactNativeMaterialUi

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActionsContainer extends js.Object {
  var actionsContainer: js.UndefOr[ViewStyle] = js.native
}

object AnonActionsContainer {
  @scala.inline
  def apply(): AnonActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonActionsContainer]
  }
  @scala.inline
  implicit class AnonActionsContainerOps[Self <: AnonActionsContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionsContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainer")(null)
        ret
    }
  }
  
}

