package typingsSlinky.rrc.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.rrc.mod.OnUpdateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnUpdate
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rrc.mod.OnUpdate] {
  @JSImport("rrc", "OnUpdate")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    call: /* location */ Location[LocationState] => Unit,
    immediate: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rrc.mod.OnUpdate] = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = OnUpdateProps
}

