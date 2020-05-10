package typingsSlinky.reactSketchapp.components

import typingsSlinky.reactSketchapp.propsMod.TextProps
import typingsSlinky.reactSketchapp.textMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  @JSImport("react-sketchapp/lib/components/Svg/Text", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: TextProps): SharedBuilder_TextProps_1797750012[default] = new SharedBuilder_TextProps_1797750012[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Text.type): SharedBuilder_TextProps_1797750012[default] = new SharedBuilder_TextProps_1797750012[default](js.Array(this.component, js.Dictionary.empty))()
}

