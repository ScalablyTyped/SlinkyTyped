package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCEventBehavior extends js.Object {
  @JSName("MSHTML.HTCEventBehavior_typekey")
  var MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior = js.native
  def fire(pVar: IHTMLEventObj): Unit = js.native
}

object HTCEventBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior, fire: IHTMLEventObj => Unit): HTCEventBehavior = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire))
    __obj.updateDynamic("MSHTML.HTCEventBehavior_typekey")(MSHTMLDotHTCEventBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCEventBehavior]
  }
  @scala.inline
  implicit class HTCEventBehaviorOps[Self <: HTCEventBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTCEventBehavior_typekey(value: HTCEventBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTCEventBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFire(value: IHTMLEventObj => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

