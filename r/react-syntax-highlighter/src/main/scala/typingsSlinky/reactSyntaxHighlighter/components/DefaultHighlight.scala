package typingsSlinky.reactSyntaxHighlighter.components

import typingsSlinky.reactSyntaxHighlighter.defaultHighlightMod.default
import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultHighlight {
  @JSImport("react-syntax-highlighter/dist/cjs/default-highlight", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DefaultHighlight.type): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, js.Dictionary.empty))()
}

