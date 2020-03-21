package typingsSlinky.reactElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactElemental.AnonLabel
import typingsSlinky.reactElemental.mod.SelectListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectList
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactElemental.mod.SelectList] {
  @JSImport("react-elemental", "SelectList")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: placeholder, style, width */
  def apply(
    error: String = null,
    height: Int | Double = null,
    onChange: /* value */ String => Unit = null,
    options: js.Array[AnonLabel] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactElemental.mod.SelectList] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactElemental.mod.SelectList] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactElemental.mod.SelectList](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SelectListProps
}

