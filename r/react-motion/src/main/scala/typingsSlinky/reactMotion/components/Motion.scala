package typingsSlinky.reactMotion.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMotion.mod.MotionProps
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Motion
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMotion.mod.Motion] {
  @JSImport("react-motion", "Motion")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    style: Style,
    defaultStyle: PlainStyle = null,
    onRest: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMotion.mod.Motion] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MotionProps
}

