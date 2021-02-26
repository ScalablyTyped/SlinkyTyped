package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReservedInstancesListingResult extends StObject {
  
  /**
    * Information about the Standard Reserved Instance listing.
    */
  var ReservedInstancesListings: js.UndefOr[ReservedInstancesListingList] = js.native
}
object CreateReservedInstancesListingResult {
  
  @scala.inline
  def apply(): CreateReservedInstancesListingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReservedInstancesListingResult]
  }
  
  @scala.inline
  implicit class CreateReservedInstancesListingResultMutableBuilder[Self <: CreateReservedInstancesListingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstancesListings(value: ReservedInstancesListingList): Self = StObject.set(x, "ReservedInstancesListings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesListingsUndefined: Self = StObject.set(x, "ReservedInstancesListings", js.undefined)
    
    @scala.inline
    def setReservedInstancesListingsVarargs(value: ReservedInstancesListing*): Self = StObject.set(x, "ReservedInstancesListings", js.Array(value :_*))
  }
}
