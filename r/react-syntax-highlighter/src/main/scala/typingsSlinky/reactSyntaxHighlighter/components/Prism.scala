package typingsSlinky.reactSyntaxHighlighter.components

import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Prism {
  @JSImport("react-syntax-highlighter", "Prism")
  @js.native
  object component extends js.Object
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps_1113076166[typingsSlinky.reactSyntaxHighlighter.mod.Prism] = new SharedBuilder_SyntaxHighlighterProps_1113076166[typingsSlinky.reactSyntaxHighlighter.mod.Prism](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Prism.type): SharedBuilder_SyntaxHighlighterProps_1113076166[typingsSlinky.reactSyntaxHighlighter.mod.Prism] = new SharedBuilder_SyntaxHighlighterProps_1113076166[typingsSlinky.reactSyntaxHighlighter.mod.Prism](js.Array(this.component, js.Dictionary.empty))()
}

