package typingsSlinky.atReachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Location] {
  @JSImport("@reach/router", "Location")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Location] = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LocationProps
}

