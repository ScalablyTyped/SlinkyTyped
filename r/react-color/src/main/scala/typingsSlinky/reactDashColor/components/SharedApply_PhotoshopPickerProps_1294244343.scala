package typingsSlinky.reactDashColor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashColor.libComponentsPhotoshopPhotoshopMod.PhotoshopPickerProps
import typingsSlinky.reactDashColor.reactDashColorMod.Color
import typingsSlinky.reactDashColor.reactDashColorMod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PhotoshopPickerProps_1294244343[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: onChange */
  def apply(
    color: Color = null,
    header: String = null,
    onAccept: /* color */ ColorResult => Unit = null,
    onCancel: /* color */ ColorResult => Unit = null,
    onChangeComplete: /* color */ ColorResult => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1(onChangeComplete))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PhotoshopPickerProps
}

