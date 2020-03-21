package typingsSlinky.reactMotion.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.StaggeredMotionProps
import typingsSlinky.reactMotion.mod.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaggeredMotion
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactMotion.mod.StaggeredMotion] {
  @JSImport("react-motion", "StaggeredMotion")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    styles: js.UndefOr[js.Array[PlainStyle]] => js.Array[Style],
    defaultStyles: js.Array[PlainStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactMotion.mod.StaggeredMotion] = {
    val __obj = js.Dynamic.literal(styles = js.Any.fromFunction1(styles))
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StaggeredMotionProps
}

