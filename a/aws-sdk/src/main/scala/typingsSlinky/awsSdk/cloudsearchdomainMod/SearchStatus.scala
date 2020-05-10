package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}

object SearchStatus {
  @scala.inline
  def apply(): SearchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatus]
  }
  @scala.inline
  implicit class SearchStatusOps[Self <: SearchStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rid")(js.undefined)
        ret
    }
    @scala.inline
    def withTimems(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timems")(js.undefined)
        ret
    }
  }
  
}

