package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesListingsResult extends js.Object {
  
  /**
    * Information about the Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}
object DescribeReservedInstancesListingsResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesListingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesListingsResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesListingsResultOps[Self <: DescribeReservedInstancesListingsResult] (val x: Self) extends AnyVal {
    
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
    def setReservedInstancesListingsVarargs(value: ReservedInstancesListing*): Self = this.set("ReservedInstancesListings", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesListings(value: ReservedInstancesListingList): Self = this.set("ReservedInstancesListings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesListings: Self = this.set("ReservedInstancesListings", js.undefined)
  }
}
