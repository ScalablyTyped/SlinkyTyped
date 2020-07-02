package typingsSlinky.antd.passwordMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.inputInputMod.InputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordProps extends InputProps {
  val action: js.UndefOr[String] = js.undefined
  var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, ReactElement]] = js.undefined
  val inputPrefixCls: js.UndefOr[String] = js.undefined
  var visibilityToggle: js.UndefOr[Boolean] = js.undefined
}

object PasswordProps {
  @scala.inline
  def apply(): PasswordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordProps]
  }
  @scala.inline
  implicit class PasswordPropsOps[Self <: PasswordProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setIconRender(value: /* visible */ Boolean => ReactElement): Self = this.set("iconRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIconRender: Self = this.set("iconRender", js.undefined)
    @scala.inline
    def setInputPrefixCls(value: String): Self = this.set("inputPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPrefixCls: Self = this.set("inputPrefixCls", js.undefined)
    @scala.inline
    def setVisibilityToggle(value: Boolean): Self = this.set("visibilityToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityToggle: Self = this.set("visibilityToggle", js.undefined)
  }
  
}

