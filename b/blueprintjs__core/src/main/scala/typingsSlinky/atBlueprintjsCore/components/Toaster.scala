package typingsSlinky.atBlueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsToastToasterMod.IToasterProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsToastToasterMod.ToasterPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toaster
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Toaster] {
  @JSImport("@blueprintjs/core/lib/esm/components", "Toaster")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className */
  def apply(
    canEscapeKeyClear: js.UndefOr[Boolean] = js.undefined,
    maxToasts: Int | Double = null,
    position: ToasterPosition = null,
    usePortal: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Toaster] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canEscapeKeyClear)) __obj.updateDynamic("canEscapeKeyClear")(canEscapeKeyClear.asInstanceOf[js.Any])
    if (maxToasts != null) __obj.updateDynamic("maxToasts")(maxToasts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IToasterProps
}

