package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.ArtboardProps
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Style
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.StyleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Artboard
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Artboard] {
  @JSImport("react-sketchapp", "Artboard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(style: Style | StyleReference = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Artboard] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Artboard] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashSketchapp.reactDashSketchappMod.Artboard](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ArtboardProps
}

