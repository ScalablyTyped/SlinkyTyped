package typingsSlinky.knockout

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit = js.native
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node] = js.native
}

object AnonAddTemplate {
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
  ): AnonAddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AnonAddTemplate]
  }
  @scala.inline
  implicit class AnonAddTemplateOps[Self <: AnonAddTemplate] (val x: Self) extends AnyVal {
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
    def withRenderTemplateSource(value: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTemplateSource")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

