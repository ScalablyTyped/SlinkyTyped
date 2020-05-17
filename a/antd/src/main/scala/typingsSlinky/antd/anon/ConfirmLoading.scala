package typingsSlinky.antd.anon

import typingsSlinky.antd.antdStrings.danger
import typingsSlinky.antd.antdStrings.dashed
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.ghost
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmLoading extends js.Object {
  var confirmLoading: Boolean = js.native
  var maskTransitionName: String = js.native
  var okType: link | dashed | default | primary | ghost | danger = js.native
  var transitionName: String = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
}

object ConfirmLoading {
  @scala.inline
  def apply(
    confirmLoading: Boolean,
    maskTransitionName: String,
    okType: link | dashed | default | primary | ghost | danger,
    transitionName: String,
    visible: Boolean,
    width: Double
  ): ConfirmLoading = {
    val __obj = js.Dynamic.literal(confirmLoading = confirmLoading.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], okType = okType.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmLoading]
  }
  @scala.inline
  implicit class ConfirmLoadingOps[Self <: ConfirmLoading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirmLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaskTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskTransitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOkType(value: link | dashed | default | primary | ghost | danger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("okType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

