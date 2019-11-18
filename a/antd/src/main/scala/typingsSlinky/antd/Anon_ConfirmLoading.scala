package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.danger
import typingsSlinky.antd.antdStrings.dashed
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.ghost
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfirmLoading extends js.Object {
  var confirmLoading: Boolean
  var maskTransitionName: String
  var okType: link | default | dashed | primary | ghost | danger
  var transitionName: String
  var visible: Boolean
  var width: Double
}

object Anon_ConfirmLoading {
  @scala.inline
  def apply(
    confirmLoading: Boolean,
    maskTransitionName: String,
    okType: link | default | dashed | primary | ghost | danger,
    transitionName: String,
    visible: Boolean,
    width: Double
  ): Anon_ConfirmLoading = {
    val __obj = js.Dynamic.literal(confirmLoading = confirmLoading.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], okType = okType.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConfirmLoading]
  }
}

