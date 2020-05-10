package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterObject extends js.Object {
  var address: js.UndefOr[String] = js.native
  var fromBlock: js.UndefOr[Double | String] = js.native
  var toBlock: js.UndefOr[Double | String] = js.native
  var topics: js.UndefOr[js.Array[LogTopic]] = js.native
}

object FilterObject {
  @scala.inline
  def apply(): FilterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterObject]
  }
  @scala.inline
  implicit class FilterObjectOps[Self <: FilterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withFromBlock(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withToBlock(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[LogTopic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(js.undefined)
        ret
    }
  }
  
}

