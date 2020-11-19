package typingsSlinky.knockout.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "templateEngine")
@js.native
abstract class templateEngine () extends js.Object {
  
  var allowTemplateRewriting: Boolean = js.native
  
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  
  def isTemplateRewritten(template: String): Boolean = js.native
  def isTemplateRewritten(template: String, templateDocument: Document): Boolean = js.native
  def isTemplateRewritten(template: Node): Boolean = js.native
  def isTemplateRewritten(template: Node, templateDocument: Document): Boolean = js.native
  
  def makeTemplateSource(template: String): TemplateSource = js.native
  def makeTemplateSource(template: String, templateDocument: Document): TemplateSource = js.native
  def makeTemplateSource(template: Node): TemplateSource = js.native
  def makeTemplateSource(template: Node, templateDocument: Document): TemplateSource = js.native
  
  def renderTemplate(template: String, bindingContext: BindingContext[_], options: TemplateOptions[_]): js.Array[Node] = js.native
  def renderTemplate(
    template: String,
    bindingContext: BindingContext[_],
    options: TemplateOptions[_],
    templateDocument: Document
  ): js.Array[Node] = js.native
  def renderTemplate(template: Node, bindingContext: BindingContext[_], options: TemplateOptions[_]): js.Array[Node] = js.native
  def renderTemplate(
    template: Node,
    bindingContext: BindingContext[_],
    options: TemplateOptions[_],
    templateDocument: Document
  ): js.Array[Node] = js.native
  
  def renderTemplateSource(templateSource: TemplateSource, bindingContext: BindingContext[_], options: TemplateOptions[_]): js.Array[Node] = js.native
  def renderTemplateSource(
    templateSource: TemplateSource,
    bindingContext: BindingContext[_],
    options: TemplateOptions[_],
    templateDocument: Document
  ): js.Array[Node] = js.native
  
  def rewriteTemplate(template: String, rewriterCallback: js.Function1[/* val */ String, String]): Unit = js.native
  def rewriteTemplate(
    template: String,
    rewriterCallback: js.Function1[/* val */ String, String],
    templateDocument: Document
  ): Unit = js.native
  def rewriteTemplate(template: Node, rewriterCallback: js.Function1[/* val */ String, String]): Unit = js.native
  def rewriteTemplate(
    template: Node,
    rewriterCallback: js.Function1[/* val */ String, String],
    templateDocument: Document
  ): Unit = js.native
}
