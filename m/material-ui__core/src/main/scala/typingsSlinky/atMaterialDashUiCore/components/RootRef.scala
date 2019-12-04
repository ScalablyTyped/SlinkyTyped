package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.rootRefMod.default
import typingsSlinky.atMaterialDashUiCore.rootRefRootRefMod.RootRefProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootRef
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    rootRef: (js.Function1[/* instance */ js.Any | Null, Unit]) | ReactRef[js.Any] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RootRefProps[js.Any]
}

