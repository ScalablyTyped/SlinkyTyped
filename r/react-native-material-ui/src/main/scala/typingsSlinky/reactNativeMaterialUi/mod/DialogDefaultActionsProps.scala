package typingsSlinky.reactNativeMaterialUi.mod

import typingsSlinky.reactNativeMaterialUi.anon.DefaultActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogDefaultActionsProps extends js.Object {
  var actions: js.Array[String] = js.native
  var style: js.UndefOr[DefaultActionsContainer] = js.native
  def onActionPress(action: String): Unit = js.native
}

object DialogDefaultActionsProps {
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
  @scala.inline
  implicit class DialogDefaultActionsPropsOps[Self <: DialogDefaultActionsProps] (val x: Self) extends AnyVal {
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
    def withStyle(value: DefaultActionsContainer): Self = {
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

