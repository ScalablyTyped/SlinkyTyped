package typingsSlinky.reactSketchapp.components

import typingsSlinky.reactSketchapp.propsMod.TextProps
import typingsSlinky.reactSketchapp.tspanMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TSpan {
  @JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TextProps): SharedBuilder_TextProps_1797750012[default] = new SharedBuilder_TextProps_1797750012[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TSpan.type): SharedBuilder_TextProps_1797750012[default] = new SharedBuilder_TextProps_1797750012[default](js.Array(this.component, js.Dictionary.empty))()
}

