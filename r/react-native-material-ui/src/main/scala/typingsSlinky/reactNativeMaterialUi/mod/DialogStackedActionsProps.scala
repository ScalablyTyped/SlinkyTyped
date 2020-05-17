package typingsSlinky.reactNativeMaterialUi.mod

import typingsSlinky.reactNativeMaterialUi.anon.StackedActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogStackedActionsProps extends js.Object {
  var actions: js.Array[String] = js.native
  var style: js.UndefOr[StackedActionsContainer] = js.native
  def onActionPress(action: String): Unit = js.native
}

object DialogStackedActionsProps {
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
  @scala.inline
  implicit class DialogStackedActionsPropsOps[Self <: DialogStackedActionsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnActionPress(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActionPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: StackedActionsContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

