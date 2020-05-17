package typingsSlinky.prosemirrorMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TightLists extends js.Object {
  var tightLists: js.UndefOr[Boolean | Null] = js.native
}

object TightLists {
  @scala.inline
  def apply(): TightLists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TightLists]
  }
  @scala.inline
  implicit class TightListsOps[Self <: TightLists] (val x: Self) extends AnyVal {
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

