package typingsSlinky.glDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.glDashReact.glDashReactMod.BusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bus
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.glDashReact.glDashReactMod.Bus] {
  @JSImport("gl-react", "Bus")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(index: Double, uniform: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.glDashReact.glDashReactMod.Bus] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (uniform != null) __obj.updateDynamic("uniform")(uniform.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BusProps
}

