package typingsSlinky.removeMarkdown

import typingsSlinky.removeMarkdown.anon.Gfm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("remove-markdown", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Strip Markdown formatting from text
    * @param markdown Markdown text
    */
  def apply(markdown: String): String = js.native
  def apply(markdown: String, options: Gfm): String = js.native
}
