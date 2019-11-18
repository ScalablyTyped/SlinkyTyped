package typingsSlinky.antd.esAvatarMod

import slinky.core.TagMod
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.large
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Type of the Icon to be used in avatar */
  var icon: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Shape of avatar, options:`circle`, `square` */
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[large | small | typingsSlinky.antd.antdStrings.default | Double] = js.undefined
  /** Src of image avatar */
  var src: js.UndefOr[String] = js.undefined
  /** Srcset of image avatar */
  var srcSet: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    alt: String = null,
    children: TagMod[Any] = null,
    className: String = null,
    icon: String = null,
    onError: () => Boolean = null,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | typingsSlinky.antd.antdStrings.default | Double = null,
    src: String = null,
    srcSet: String = null,
    style: CSSProperties = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

