package typingsSlinky.reactDashVirtualized.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashVirtualized.distEsScrollSyncMod.ScrollSyncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollSync
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashVirtualized.distEsScrollSyncMod.ScrollSync] {
  @JSImport("react-virtualized/dist/es/ScrollSync", "ScrollSync")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashVirtualized.distEsScrollSyncMod.ScrollSync] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollSyncProps
}

