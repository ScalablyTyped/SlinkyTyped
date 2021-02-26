package typingsSlinky.reactSyntaxHighlighter

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prismAsyncLightMod {
  
  @JSImport("react-syntax-highlighter/dist/cjs/prism-async-light", JSImport.Default)
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-syntax-highlighter/dist/cjs/prism-async-light", "default.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = ReactComponentClass[SyntaxHighlighterProps]
}
