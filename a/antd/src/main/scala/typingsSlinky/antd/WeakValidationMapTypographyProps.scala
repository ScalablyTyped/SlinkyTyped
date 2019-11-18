package typingsSlinky.antd

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/typography/Typography.TypographyProps> */
trait WeakValidationMapTypographyProps extends js.Object {
  var `aria-label`: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapTypographyProps {
  @scala.inline
  def apply(
    `aria-label`: Validator[js.UndefOr[Null | String]] = null,
    children: Validator[js.UndefOr[Null | TagMod[Any]]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapTypographyProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTypographyProps]
  }
}

