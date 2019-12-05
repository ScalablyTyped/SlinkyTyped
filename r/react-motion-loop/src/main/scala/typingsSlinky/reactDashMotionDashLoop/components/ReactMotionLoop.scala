package typingsSlinky.reactDashMotionDashLoop.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMotion.reactDashMotionMod.Style
import typingsSlinky.reactDashMotionDashLoop.reactDashMotionDashLoopMod.ReactMotionLoopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionLoop
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashMotionDashLoop.reactDashMotionDashLoopMod.ReactMotionLoop
    ] {
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(styleFrom: Style, styleTo: Style, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashMotionDashLoop.reactDashMotionDashLoopMod.ReactMotionLoop
  ] = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactMotionLoopProps
}

