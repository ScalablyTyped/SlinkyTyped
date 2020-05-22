package typingsSlinky.antDesignCompatible.iconMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends CoreIconProps {
  var component: js.UndefOr[ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    className: String = null,
    component: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]] = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null,
    onKeyUp: SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    role: String = null,
    rotate: js.UndefOr[Double] = js.undefined,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    theme: ThemeType = null,
    title: String = null,
    twoToneColor: String = null,
    `type`: String = null,
    viewBox: String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (twoToneColor != null) __obj.updateDynamic("twoToneColor")(twoToneColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

