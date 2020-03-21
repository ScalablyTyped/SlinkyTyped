package typingsSlinky.bandagedbdBdapi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.ProfilerProps
import typingsSlinky.react.mod.SchedulerInteraction
import typingsSlinky.react.reactStrings.mount
import typingsSlinky.react.reactStrings.update
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BdApiModuleReactProfiler
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.Profiler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    id: String,
    onRender: (/* id */ String, /* phase */ mount | update, /* actualDuration */ Double, /* baseDuration */ Double, /* startTime */ Double, /* commitTime */ Double, /* interactions */ Set[SchedulerInteraction]) => Unit,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onRender = js.Any.fromFunction7(onRender))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ProfilerProps
}

