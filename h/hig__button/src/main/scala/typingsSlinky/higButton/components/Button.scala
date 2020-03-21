package typingsSlinky.higButton.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.higButton.mod.AvailableTargets_
import typingsSlinky.higButton.mod.AvailableTypes_
import typingsSlinky.higButton.mod.AvailableWidths_
import typingsSlinky.higButton.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@hig/button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    title: String,
    icon: ReactElement = null,
    link: String = null,
    onBlur: () => Unit = null,
    onClick: () => Unit = null,
    onFocus: () => Unit = null,
    onHover: () => Unit = null,
    onMouseDown: () => Unit = null,
    onMouseEnter: () => Unit = null,
    onMouseLeave: () => Unit = null,
    onMouseUp: () => Unit = null,
    stylesheet: js.Any = null,
    target: AvailableTargets_ = null,
    `type`: AvailableTypes_ = null,
    width: AvailableWidths_ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction0(onHover))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction0(onMouseUp))
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.higButton.mod.Props
}

