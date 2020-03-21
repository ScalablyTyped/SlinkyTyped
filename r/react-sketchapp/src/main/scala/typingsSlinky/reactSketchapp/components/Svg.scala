package typingsSlinky.reactSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactSketchapp.mod.Style
import typingsSlinky.reactSketchapp.mod.StyleReference
import typingsSlinky.reactSketchapp.svgMod.default
import typingsSlinky.reactSketchapp.svgSvgMod.SvgProps
import typingsSlinky.reactSketchapp.typesMod.ResizeConstraints
import typingsSlinky.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Svg
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-sketchapp/lib/components/Svg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    height: String | Double = null,
    opacity: String | Double = null,
    preserveAspectRatio: String = null,
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null,
    viewBox: String = null,
    width: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactSketchapp.svgMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SvgProps
}

