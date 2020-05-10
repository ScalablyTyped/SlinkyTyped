package typingsSlinky.jqueryAjaxChain

import typingsSlinky.jqueryAjaxChain.ajaxChain.JQueryAjaxChainStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * JQueryAjaxChain constructor
    */
  var AjaxChain: JQueryAjaxChainStatic = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(AjaxChain: JQueryAjaxChainStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(AjaxChain = AjaxChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxChain(value: JQueryAjaxChainStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AjaxChain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

