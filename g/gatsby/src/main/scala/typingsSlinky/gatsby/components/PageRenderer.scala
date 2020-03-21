package typingsSlinky.gatsby.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.gatsby.mod.PageRendererProps
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageRenderer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gatsby.mod.PageRenderer] {
  @JSImport("gatsby", "PageRenderer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(location: WindowLocation, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.gatsby.mod.PageRenderer] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PageRendererProps
}

