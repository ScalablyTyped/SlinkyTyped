package typingsSlinky.reactSyntaxHighlighter.components

import typingsSlinky.reactSyntaxHighlighter.esmDefaultHighlightMod.default
import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultHighlight {
  
  @JSImport("react-syntax-highlighter/dist/esm/default-highlight", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DefaultHighlight.type): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SyntaxHighlighterProps): SharedBuilder_SyntaxHighlighterProps_1113076166[default] = new SharedBuilder_SyntaxHighlighterProps_1113076166[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
