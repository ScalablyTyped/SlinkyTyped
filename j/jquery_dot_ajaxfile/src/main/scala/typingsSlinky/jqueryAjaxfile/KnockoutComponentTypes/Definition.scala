package typingsSlinky.jqueryAjaxfile.KnockoutComponentTypes

import org.scalajs.dom.raw.Node
import typingsSlinky.jqueryAjaxfile.AnonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var createViewModel: js.UndefOr[js.Function2[/* params */ js.Any, /* options */ AnonElement, _]] = js.native
  var template: js.Array[Node] = js.native
}

object Definition {
  @scala.inline
  def apply(template: js.Array[Node]): Definition = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateViewModel(value: (/* params */ js.Any, /* options */ AnonElement) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewModel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewModel")(js.undefined)
        ret
    }
  }
  
}

