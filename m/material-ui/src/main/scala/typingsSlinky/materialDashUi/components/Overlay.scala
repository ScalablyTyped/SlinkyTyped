package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.internalOverlayMod.OverlayProps
import typingsSlinky.materialDashUi.internalOverlayMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/internal/Overlay", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick */
  def apply(
    show: Boolean,
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OverlayProps
}

