package typingsSlinky.csso.mod

import typingsSlinky.csso.anon.Classes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Usage extends js.Object {
  var blacklist: js.UndefOr[Classes] = js.native
  var classes: js.UndefOr[js.Array[String]] = js.native
  var ids: js.UndefOr[js.Array[String]] = js.native
  var scopes: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Usage {
  @scala.inline
  def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  @scala.inline
  implicit class UsageOps[Self <: Usage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: Classes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

