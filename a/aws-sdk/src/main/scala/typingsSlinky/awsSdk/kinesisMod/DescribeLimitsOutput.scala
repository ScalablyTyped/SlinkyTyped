package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLimitsOutput extends js.Object {
  /**
    * The number of open shards.
    */
  var OpenShardCount: ShardCountObject = js.native
  /**
    * The maximum number of shards.
    */
  var ShardLimit: ShardCountObject = js.native
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(OpenShardCount: ShardCountObject, ShardLimit: ShardCountObject): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal(OpenShardCount = OpenShardCount.asInstanceOf[js.Any], ShardLimit = ShardLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  @scala.inline
  implicit class DescribeLimitsOutputOps[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenShardCount(value: ShardCountObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpenShardCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShardLimit(value: ShardCountObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShardLimit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

