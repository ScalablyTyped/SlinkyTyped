package typingsSlinky.naja.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormsHandler extends js.Object {
  var netteForms: js.Object = js.native
  def initForms(element: Element): Unit = js.native
  def processForm(event: Event): Unit = js.native
}

object FormsHandler {
  @scala.inline
  def apply(initForms: Element => Unit, netteForms: js.Object, processForm: Event => Unit): FormsHandler = {
    val __obj = js.Dynamic.literal(initForms = js.Any.fromFunction1(initForms), netteForms = netteForms.asInstanceOf[js.Any], processForm = js.Any.fromFunction1(processForm))
    __obj.asInstanceOf[FormsHandler]
  }
  @scala.inline
  implicit class FormsHandlerOps[Self <: FormsHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitForms(value: Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initForms")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNetteForms(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netteForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessForm(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processForm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

