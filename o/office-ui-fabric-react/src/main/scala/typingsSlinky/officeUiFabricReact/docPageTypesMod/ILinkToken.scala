package typingsSlinky.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinkToken extends js.Object {
  /** If this token is a link, name of the doc page it points to */
  var linkedPage: js.UndefOr[String] = js.native
  /** If this token is a link, group/category of the doc page it points to */
  var linkedPageGroup: js.UndefOr[String] = js.native
  var text: String = js.native
}

object ILinkToken {
  @scala.inline
  def apply(text: String): ILinkToken = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkToken]
  }
  @scala.inline
  implicit class ILinkTokenOps[Self <: ILinkToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkedPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPage")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedPageGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPageGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedPageGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedPageGroup")(js.undefined)
        ret
    }
  }
  
}

