package typingsSlinky.reactRelay.mod

import typingsSlinky.reactRelay.anon.PartialPageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionData extends js.Object {
  var edges: js.UndefOr[js.Array[_] | Null] = js.native
  var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.native
}

object ConnectionData {
  @scala.inline
  def apply(): ConnectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionData]
  }
  @scala.inline
  implicit class ConnectionDataOps[Self <: ConnectionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(null)
        ret
    }
    @scala.inline
    def withPageInfo(value: PartialPageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withPageInfoNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageInfo")(null)
        ret
    }
  }
  
}

