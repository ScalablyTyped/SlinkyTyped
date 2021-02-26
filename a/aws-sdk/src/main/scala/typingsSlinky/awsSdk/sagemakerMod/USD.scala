package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USD extends StObject {
  
  /**
    * The fractional portion, in cents, of the amount. 
    */
  var Cents: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Cents] = js.native
  
  /**
    * The whole number of dollars in the amount.
    */
  var Dollars: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Dollars] = js.native
  
  /**
    * Fractions of a cent, in tenths.
    */
  var TenthFractionsOfACent: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TenthFractionsOfACent] = js.native
}
object USD {
  
  @scala.inline
  def apply(): USD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[USD]
  }
  
  @scala.inline
  implicit class USDMutableBuilder[Self <: USD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCents(value: Cents): Self = StObject.set(x, "Cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentsUndefined: Self = StObject.set(x, "Cents", js.undefined)
    
    @scala.inline
    def setDollars(value: Dollars): Self = StObject.set(x, "Dollars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarsUndefined: Self = StObject.set(x, "Dollars", js.undefined)
    
    @scala.inline
    def setTenthFractionsOfACent(value: TenthFractionsOfACent): Self = StObject.set(x, "TenthFractionsOfACent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenthFractionsOfACentUndefined: Self = StObject.set(x, "TenthFractionsOfACent", js.undefined)
  }
}
