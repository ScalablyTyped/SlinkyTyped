package typingsSlinky.pulumiAws.getPartitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPartitionResult extends js.Object {
  val dnsSuffix: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val partition: String = js.native
}

object GetPartitionResult {
  @scala.inline
  def apply(dnsSuffix: String, id: String, partition: String): GetPartitionResult = {
    val __obj = js.Dynamic.literal(dnsSuffix = dnsSuffix.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPartitionResult]
  }
  @scala.inline
  implicit class GetPartitionResultOps[Self <: GetPartitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

