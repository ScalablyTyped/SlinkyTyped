package typingsSlinky.reactSyntaxHighlighter

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-syntax-highlighter/dist/cjs/prism-light", JSImport.Namespace)
@js.native
object prismLightMod extends js.Object {
  
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  /* static members */
  @js.native
  object default extends js.Object {
    
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = ReactComponentClass[SyntaxHighlighterProps]
}
