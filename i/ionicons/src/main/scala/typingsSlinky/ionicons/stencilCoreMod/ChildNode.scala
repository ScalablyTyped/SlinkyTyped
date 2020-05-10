package typingsSlinky.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildNode extends js.Object {
  var vattrs: js.UndefOr[js.Any] = js.native
  var vchildren: js.UndefOr[js.Array[VNode]] = js.native
  var vkey: js.UndefOr[String | Double] = js.native
  var vname: js.UndefOr[String] = js.native
  var vtag: js.UndefOr[String | Double | js.Function] = js.native
  var vtext: js.UndefOr[String] = js.native
}

object ChildNode {
  @scala.inline
  def apply(): ChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildNode]
  }
  @scala.inline
  implicit class ChildNodeOps[Self <: ChildNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVattrs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vattrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVattrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vattrs")(js.undefined)
        ret
    }
    @scala.inline
    def withVchildren(value: js.Array[VNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vchildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVchildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vchildren")(js.undefined)
        ret
    }
    @scala.inline
    def withVkey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vkey")(js.undefined)
        ret
    }
    @scala.inline
    def withVname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vname")(js.undefined)
        ret
    }
    @scala.inline
    def withVtag(value: String | Double | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtag")(js.undefined)
        ret
    }
    @scala.inline
    def withVtext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVtext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vtext")(js.undefined)
        ret
    }
  }
  
}

