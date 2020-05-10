package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSketchapp.clipPathMod.ClipPathProps
import typingsSlinky.reactSketchapp.clipPathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClipPath {
  @JSImport("react-sketchapp/lib/components/Svg/ClipPath", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ClipPathProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ClipPathProps]))
  }
}

