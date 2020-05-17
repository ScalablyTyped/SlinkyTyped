package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCDescBehavior extends js.Object {
  @JSName("MSHTML.HTCDescBehavior_typekey")
  var MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior = js.native
  val name: String = js.native
  val urn: String = js.native
}

object HTCDescBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior, name: String, urn: String): HTCDescBehavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDescBehavior_typekey")(MSHTMLDotHTCDescBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDescBehavior]
  }
  @scala.inline
  implicit class HTCDescBehaviorOps[Self <: HTCDescBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTCDescBehavior_typekey(value: HTCDescBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTCDescBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

