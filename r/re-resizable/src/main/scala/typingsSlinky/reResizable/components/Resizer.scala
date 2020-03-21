package typingsSlinky.reResizable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reResizable.resizerMod.Direction
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resizer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reResizable.resizerMod.Resizer] {
  @JSImport("re-resizable/lib/resizer", "Resizer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ SyntheticMouseEvent[HTMLDivElement] | SyntheticTouchEvent[HTMLDivElement], /* dir */ Direction) => Unit,
    replaceStyles: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reResizable.resizerMod.Resizer] = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
    if (replaceStyles != null) __obj.updateDynamic("replaceStyles")(replaceStyles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reResizable.resizerMod.Props
}

