package typingsSlinky.reachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reachRouter.mod.ServerLocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ServerLocation
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reachRouter.mod.ServerLocation] {
  @JSImport("@reach/router", "ServerLocation")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(url: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reachRouter.mod.ServerLocation] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ServerLocationProps
}

