package typingsSlinky.baseui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import typingsSlinky.baseui.toastMod.ToasterOverrides
import typingsSlinky.baseui.toastMod.ToasterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToasterContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.toastMod.ToasterContainer] {
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoHideDuration: Int | Double = null,
    overrides: ToasterOverrides = null,
    placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.baseui.toastMod.ToasterContainer] = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.baseui.toastMod.ToasterContainer] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.baseui.toastMod.ToasterContainer](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ToasterProps
}

