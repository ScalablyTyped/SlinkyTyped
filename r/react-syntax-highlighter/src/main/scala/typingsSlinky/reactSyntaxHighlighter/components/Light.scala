package typingsSlinky.reactSyntaxHighlighter.components

import typingsSlinky.reactSyntaxHighlighter.esmLightMod.default
import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Light {
  @JSImport("react-syntax-highlighter/dist/esm/light", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Light.type): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, js.Dictionary.empty))()
}

