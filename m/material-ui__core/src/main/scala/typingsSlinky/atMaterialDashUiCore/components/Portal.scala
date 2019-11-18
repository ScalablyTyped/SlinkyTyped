package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.portalMod.default
import typingsSlinky.atMaterialDashUiCore.portalPortalMod.PortalProps
import typingsSlinky.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Portal
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atMaterialDashUiCore.portalMod.default].asInstanceOf[String | js.Object]
  def apply(
    container: ReactInstance | js.Function0[ReactInstance] = null,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: () => Unit = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal.asInstanceOf[js.Any])
    if (onRendered != null) __obj.updateDynamic("onRendered")(js.Any.fromFunction0(onRendered))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PortalProps
}

