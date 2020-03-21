package typingsSlinky.reactElemental.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactElemental.mod.ModalProps
import typingsSlinky.reactElemental.mod.ModalSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Modal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactElemental.mod.Modal] {
  @JSImport("react-elemental", "Modal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    onHide: () => Unit = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    size: ModalSize = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Modal] = {
    val __obj = js.Dynamic.literal()
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Modal] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactElemental.mod.Modal](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ModalProps
}

