package typingsSlinky.pulumiAws.getPartitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartitionResult extends js.Object {
  
  val dnsSuffix: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDnsSuffix(value: String): Self = this.set("dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
  }
}
