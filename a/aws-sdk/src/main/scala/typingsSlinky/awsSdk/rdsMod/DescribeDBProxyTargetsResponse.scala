package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDBProxyTargetsResponse extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * An arbitrary number of DBProxyTarget objects, containing details of the corresponding targets.
    */
  var Targets: js.UndefOr[TargetList] = js.native
}
object DescribeDBProxyTargetsResponse {
  
  @scala.inline
  def apply(): DescribeDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyTargetsResponse]
  }
  
  @scala.inline
  implicit class DescribeDBProxyTargetsResponseOps[Self <: DescribeDBProxyTargetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: DBProxyTarget*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: TargetList): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
}
