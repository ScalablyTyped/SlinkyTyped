package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.resizeSensorMod.IResizeEntry
import typingsSlinky.blueprintjsCore.resizeSensorMod.IResizeSensorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizeSensor
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.ResizeSensor] {
  @JSImport("@blueprintjs/core", "ResizeSensor")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onResize: js.Array[IResizeEntry] => Unit,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.ResizeSensor] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IResizeSensorProps
}

