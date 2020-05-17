package typingsSlinky.jqueryAjaxfile.anon

import org.scalajs.dom.raw.Node
import typingsSlinky.jqueryAjaxfile.KnockoutBindingContext
import typingsSlinky.jqueryAjaxfile.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTemplate extends js.Object {
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
  implicit class AddTemplateOps[Self <: AddTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTemplate(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateJavaScriptEvaluatorBlock(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createJavaScriptEvaluatorBlock")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTemplateSource(value: (Object, KnockoutBindingContext, Object) => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTemplateSource")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

