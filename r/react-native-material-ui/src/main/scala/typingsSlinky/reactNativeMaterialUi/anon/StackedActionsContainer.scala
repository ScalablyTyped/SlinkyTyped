package typingsSlinky.reactNativeMaterialUi.anon

import typingsSlinky.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackedActionsContainer extends js.Object {
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.native
}

object StackedActionsContainer {
  @scala.inline
  def apply(): StackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedActionsContainer]
  }
  @scala.inline
  implicit class StackedActionsContainerOps[Self <: StackedActionsContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackedActionsContainer(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedActionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedActionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedActionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedActionsContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedActionsContainer")(null)
        ret
    }
  }
  
}

