package typingsSlinky.reactMotionLoop.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import typingsSlinky.reactMotionLoop.mod.ReactMotionLoopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMotionLoop
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMotionLoop.mod.ReactMotionLoop] {
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    styleFrom: Style,
    styleTo: Style,
    defaultStyle: PlainStyle = null,
    onRest: () => Unit = null,
    style: Style = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMotionLoop.mod.ReactMotionLoop] = {
    val __obj = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactMotionLoopProps
}

