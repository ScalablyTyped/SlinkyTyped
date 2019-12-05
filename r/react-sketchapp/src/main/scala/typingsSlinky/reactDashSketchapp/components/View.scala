package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Style
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.StyleReference
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.ViewProps
import typingsSlinky.reactDashSketchapp.typesMod.ResizeConstraints
import typingsSlinky.reactDashSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object View
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.View] {
  @JSImport("react-sketchapp", "View")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.View] = {
    val __obj = js.Dynamic.literal()
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ViewProps
}

