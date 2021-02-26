package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostReservationsResult extends StObject {
  
  /**
    * Details about the reservation's configuration.
    */
  var HostReservationSet: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.HostReservationSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeHostReservationsResult {
  
  @scala.inline
  def apply(): DescribeHostReservationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationsResult]
  }
  
  @scala.inline
  implicit class DescribeHostReservationsResultMutableBuilder[Self <: DescribeHostReservationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostReservationSet(value: HostReservationSet): Self = StObject.set(x, "HostReservationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostReservationSetUndefined: Self = StObject.set(x, "HostReservationSet", js.undefined)
    
    @scala.inline
    def setHostReservationSetVarargs(value: HostReservation*): Self = StObject.set(x, "HostReservationSet", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
