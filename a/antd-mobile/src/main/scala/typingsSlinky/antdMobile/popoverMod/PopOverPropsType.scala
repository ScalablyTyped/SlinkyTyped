package typingsSlinky.antdMobile.popoverMod

import slinky.core.TagMod
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.bottomLeft
import typingsSlinky.antdMobile.antdMobileStrings.bottomRight
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.antdMobileStrings.topLeft
import typingsSlinky.antdMobile.antdMobileStrings.topRight
import typingsSlinky.antdMobile.popoverPropsTypeMod.PopoverPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPropsType extends PopoverPropsType {
  var mask: js.UndefOr[Boolean] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var placement: js.UndefOr[left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopOverPropsType {
  @scala.inline
  def apply(
    overlay: TagMod[Any],
    disabled: js.UndefOr[Boolean] = js.undefined,
    mask: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    placement: left | right | top | bottom | topLeft | topRight | bottomLeft | bottomRight = null,
    prefixCls: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PopOverPropsType = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverPropsType]
  }
}

