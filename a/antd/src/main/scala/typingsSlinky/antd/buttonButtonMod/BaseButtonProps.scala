package typingsSlinky.antd.buttonButtonMod

import slinky.core.TagMod
import typingsSlinky.antd.AnonDelay
import typingsSlinky.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseButtonProps extends js.Object {
  var block: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var danger: js.UndefOr[Boolean] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TagMod[Any]] = js.undefined
  var loading: js.UndefOr[Boolean | AnonDelay] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[ButtonShape] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var `type`: js.UndefOr[ButtonType] = js.undefined
}

object BaseButtonProps {
  @scala.inline
  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    danger: js.UndefOr[Boolean] = js.undefined,
    ghost: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    loading: Boolean | AnonDelay = null,
    prefixCls: String = null,
    shape: ButtonShape = null,
    size: SizeType = null,
    `type`: ButtonType = null
  ): BaseButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(danger)) __obj.updateDynamic("danger")(danger.asInstanceOf[js.Any])
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseButtonProps]
  }
}

