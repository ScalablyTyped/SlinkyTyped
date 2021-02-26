package typingsSlinky.jqueryAjaxfile.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.jqueryAjaxfile.KnockoutBindingContext
import typingsSlinky.jqueryAjaxfile.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTemplate extends StObject {
  
  def addTemplate(templateName: String, templateMarkup: String): Unit = js.native
  
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  
  def renderTemplateSource(templateSource: Object, bindingContext: KnockoutBindingContext, options: Object): js.Array[Node] = js.native
}
object AddTemplate {
  
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (Object, KnockoutBindingContext, Object) => js.Array[Node]
  ): AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AddTemplate]
  }
  
  @scala.inline
  implicit class AddTemplateMutableBuilder[Self <: AddTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTemplate(value: (String, String) => Unit): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTemplateSource(value: (Object, KnockoutBindingContext, Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
  }
}
