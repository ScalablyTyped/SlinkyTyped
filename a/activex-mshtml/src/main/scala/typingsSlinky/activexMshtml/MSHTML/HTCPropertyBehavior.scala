package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCPropertyBehavior extends js.Object {
  @JSName("MSHTML.HTCPropertyBehavior_typekey")
  var MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior = js.native
  var value: js.Any = js.native
  def fireChange(): Unit = js.native
}

object HTCPropertyBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCPropertyBehavior_typekey: HTCPropertyBehavior, fireChange: () => Unit, value: js.Any): HTCPropertyBehavior = {
    val __obj = js.Dynamic.literal(fireChange = js.Any.fromFunction0(fireChange), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(MSHTMLDotHTCPropertyBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCPropertyBehavior]
  }
  @scala.inline
  implicit class HTCPropertyBehaviorOps[Self <: HTCPropertyBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTCPropertyBehavior_typekey(value: HTCPropertyBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTCPropertyBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFireChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

