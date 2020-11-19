package typingsSlinky.reactMarkdown.components

import typingsSlinky.reactMarkdown.mod.ReactMarkdownProps
import typingsSlinky.reactMarkdown.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMarkdown {
  
  @JSImport("react-markdown", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactMarkdownProps): SharedBuilder_ReactMarkdownProps_1094156219[^] = new SharedBuilder_ReactMarkdownProps_1094156219[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactMarkdown.type): SharedBuilder_ReactMarkdownProps_1094156219[^] = new SharedBuilder_ReactMarkdownProps_1094156219[^](js.Array(this.component, js.Dictionary.empty))()
}
