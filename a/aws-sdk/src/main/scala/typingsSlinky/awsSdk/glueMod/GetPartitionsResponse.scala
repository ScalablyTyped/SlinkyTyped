package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionsResponse extends js.Object {
  /**
    * A continuation token, if the returned list of partitions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
}

object GetPartitionsResponse {
  @scala.inline
  def apply(): GetPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionsResponse]
  }
  @scala.inline
  implicit class GetPartitionsResponseOps[Self <: GetPartitionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitions(value: PartitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(js.undefined)
        ret
    }
  }
  
}

