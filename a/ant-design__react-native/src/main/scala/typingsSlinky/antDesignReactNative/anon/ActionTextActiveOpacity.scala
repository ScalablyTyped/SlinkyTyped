package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTextActiveOpacity extends js.Object {
  var WrapComponent: View = js.native
  var actionTextActiveOpacity: Double = js.native
  var actionTextUnderlayColor: String = js.native
  var dismissText: String = js.native
  var okText: String = js.native
  var title: String = js.native
  var triggerType: String = js.native
  def onDismiss(): Unit = js.native
  def onOk(_underscore: js.Any): Unit = js.native
  def onVisibleChange(_underscore: js.Any): Unit = js.native
}

object ActionTextActiveOpacity {
  @scala.inline
  def apply(
    WrapComponent: View,
    actionTextActiveOpacity: Double,
    actionTextUnderlayColor: String,
    dismissText: String,
    okText: String,
    onDismiss: () => Unit,
    onOk: js.Any => Unit,
    onVisibleChange: js.Any => Unit,
    title: String,
    triggerType: String
  ): ActionTextActiveOpacity = {
    val __obj = js.Dynamic.literal(WrapComponent = WrapComponent.asInstanceOf[js.Any], actionTextActiveOpacity = actionTextActiveOpacity.asInstanceOf[js.Any], actionTextUnderlayColor = actionTextUnderlayColor.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss), onOk = js.Any.fromFunction1(onOk), onVisibleChange = js.Any.fromFunction1(onVisibleChange), title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTextActiveOpacity]
  }
  @scala.inline
  implicit class ActionTextActiveOpacityOps[Self <: ActionTextActiveOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrapComponent(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WrapComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionTextActiveOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextActiveOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionTextUnderlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTextUnderlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDismissText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnOk(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnVisibleChange(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibleChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

