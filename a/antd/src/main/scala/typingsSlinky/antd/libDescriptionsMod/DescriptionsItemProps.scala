package typingsSlinky.antd.libDescriptionsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsItemProps extends js.Object {
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[TagMod[Any]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
}

object DescriptionsItemProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    className: String = null,
    label: TagMod[Any] = null,
    prefixCls: String = null,
    span: Int | Double = null
  ): DescriptionsItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsItemProps]
  }
}

