package typingsSlinky.reactDashDragtastic.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragState
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragState] {
  @JSImport("react-dragtastic", "DragState")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(subscribeTo: js.Array[String] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashDragtastic.reactDashDragtasticMod.DragState] = {
    val __obj = js.Dynamic.literal()
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DragStateProps
}

