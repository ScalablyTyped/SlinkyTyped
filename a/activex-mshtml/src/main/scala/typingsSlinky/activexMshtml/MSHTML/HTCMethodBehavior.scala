package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCMethodBehavior extends js.Object {
  @JSName("MSHTML.HTCMethodBehavior_typekey")
  var MSHTMLDotHTCMethodBehavior_typekey: HTCMethodBehavior = js.native
}

object HTCMethodBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCMethodBehavior_typekey: HTCMethodBehavior): HTCMethodBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.HTCMethodBehavior_typekey")(MSHTMLDotHTCMethodBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCMethodBehavior]
  }
  @scala.inline
  implicit class HTCMethodBehaviorOps[Self <: HTCMethodBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTCMethodBehavior_typekey(value: HTCMethodBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTCMethodBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

