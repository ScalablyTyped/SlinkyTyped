package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.danger
import typingsSlinky.antd.antdStrings.dashed
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.ghost
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.leftBottom
import typingsSlinky.antd.antdStrings.leftTop
import typingsSlinky.antd.antdStrings.link
import typingsSlinky.antd.antdStrings.primary
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.rightBottom
import typingsSlinky.antd.antdStrings.rightTop
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var disabled: Boolean
  var icon: ReactElement
  var okType: js.UndefOr[link | dashed | default | primary | ghost | danger] = js.undefined
  var placement: js.UndefOr[
    bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: ReactElement,
    transitionName: String,
    okType: link | dashed | default | primary | ghost | danger = null,
    placement: bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: String = null
  ): AnonIcon = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

