package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAddressResult extends StObject {
  
  /**
    * The address that you want the Snow device(s) associated with a specific job to be shipped to.
    */
  var Address: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Address] = js.native
}
object DescribeAddressResult {
  
  @scala.inline
  def apply(): DescribeAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressResult]
  }
  
  @scala.inline
  implicit class DescribeAddressResultMutableBuilder[Self <: DescribeAddressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
