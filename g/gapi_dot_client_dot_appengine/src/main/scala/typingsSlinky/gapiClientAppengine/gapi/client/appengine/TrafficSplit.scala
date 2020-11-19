package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficSplit extends js.Object {
  
  /**
    * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once,
    * but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service
    * is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up
    * to three decimal places is supported for cookie-based splits.
    */
  var allocations: js.UndefOr[Record[String, Double]] = js.native
  
  /**
    * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are
    * changed.
    */
  var shardBy: js.UndefOr[String] = js.native
}
object TrafficSplit {
  
  @scala.inline
  def apply(): TrafficSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficSplit]
  }
  
  @scala.inline
  implicit class TrafficSplitOps[Self <: TrafficSplit] (val x: Self) extends AnyVal {
    
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
    def setAllocations(value: Record[String, Double]): Self = this.set("allocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocations: Self = this.set("allocations", js.undefined)
    
    @scala.inline
    def setShardBy(value: String): Self = this.set("shardBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardBy: Self = this.set("shardBy", js.undefined)
  }
}
