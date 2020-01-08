package typingsSlinky.atLinguiReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atLinguiReact.selectMod.PluralPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PluralPropsWithoutI18n640228598[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    other: TagMod[Any],
    value: Double | String,
    few: TagMod[Any] = null,
    many: TagMod[Any] = null,
    offset: Double | String = null,
    one: TagMod[Any] = null,
    render: TagMod[Any] = null,
    two: TagMod[Any] = null,
    zero: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PluralPropsWithoutI18n
}

