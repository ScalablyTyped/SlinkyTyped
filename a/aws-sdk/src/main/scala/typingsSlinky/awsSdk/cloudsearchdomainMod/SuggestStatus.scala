package typingsSlinky.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}

object SuggestStatus {
  @scala.inline
  def apply(): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestStatus]
  }
  @scala.inline
  implicit class SuggestStatusOps[Self <: SuggestStatus] (val x: Self) extends AnyVal {
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

