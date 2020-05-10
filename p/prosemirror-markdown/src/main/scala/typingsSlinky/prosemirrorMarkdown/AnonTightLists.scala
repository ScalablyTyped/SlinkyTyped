package typingsSlinky.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTightLists extends js.Object {
  var tightLists: js.UndefOr[Boolean | Null] = js.native
}

object AnonTightLists {
  @scala.inline
  def apply(): AnonTightLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonTightLists]
  }
  @scala.inline
  implicit class AnonTightListsOps[Self <: AnonTightLists] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTightLists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tightLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTightLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tightLists")(js.undefined)
        ret
    }
    @scala.inline
    def withTightListsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tightLists")(null)
        ret
    }
  }
  
}

