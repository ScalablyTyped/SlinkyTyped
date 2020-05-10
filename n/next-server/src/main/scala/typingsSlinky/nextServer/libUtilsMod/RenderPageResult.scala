package typingsSlinky.nextServer.libUtilsMod

import slinky.core.facade.ReactElement
import typingsSlinky.nextServer.nextServerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderPageResult extends js.Object {
  var dataOnly: js.UndefOr[`true`] = js.native
  var head: js.UndefOr[js.Array[ReactElement | Null]] = js.native
  var html: String = js.native
}

object RenderPageResult {
  @scala.inline
  def apply(html: String): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
  @scala.inline
  implicit class RenderPageResultOps[Self <: RenderPageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataOnly(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withHead(value: js.Array[ReactElement | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
  }
  
}

