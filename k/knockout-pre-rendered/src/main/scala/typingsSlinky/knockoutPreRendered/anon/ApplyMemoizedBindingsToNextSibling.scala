package typingsSlinky.knockoutPreRendered.anon

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import typingsSlinky.knockoutPreRendered.KnockoutTemplateEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyMemoizedBindingsToNextSibling extends js.Object {
  
  def applyMemoizedBindingsToNextSibling(bindings: js.Any, nodeName: String): String = js.native
  
  def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document): js.Any = js.native
  def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document): js.Any = js.native
  
  def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): js.Any = js.native
}
