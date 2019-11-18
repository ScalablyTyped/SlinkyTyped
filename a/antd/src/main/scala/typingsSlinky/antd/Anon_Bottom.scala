package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.click
import typingsSlinky.antd.antdStrings.contextMenu
import typingsSlinky.antd.antdStrings.danger
import typingsSlinky.antd.antdStrings.dashed
import typingsSlinky.antd.antdStrings.default
import typingsSlinky.antd.antdStrings.focus
import typingsSlinky.antd.antdStrings.ghost
import typingsSlinky.antd.antdStrings.hover
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

trait Anon_Bottom extends js.Object {
  var disabled: Boolean
  var icon: ReactElement
  var okType: js.UndefOr[link | default | dashed | primary | ghost | danger] = js.undefined
  var placement: js.UndefOr[
    left | right | top | bottom | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[click | focus | contextMenu | hover] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: ReactElement,
    transitionName: String,
    okType: link | default | dashed | primary | ghost | danger = null,
    placement: left | right | top | bottom | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: click | focus | contextMenu | hover = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

