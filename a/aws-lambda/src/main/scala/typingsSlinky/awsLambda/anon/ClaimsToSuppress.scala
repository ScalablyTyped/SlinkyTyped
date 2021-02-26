package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.commonMod.StringMap
import typingsSlinky.awsLambda.preTokenGenerationMod.GroupOverrideDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsToSuppress extends StObject {
  
  var claimsToAddOrOverride: js.UndefOr[StringMap] = js.native
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  
  var groupOverrideDetails: js.UndefOr[GroupOverrideDetails] = js.native
}
object ClaimsToSuppress {
  
  @scala.inline
  def apply(): ClaimsToSuppress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToSuppress]
  }
  
  @scala.inline
  implicit class ClaimsToSuppressMutableBuilder[Self <: ClaimsToSuppress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimsToAddOrOverride(value: StringMap): Self = StObject.set(x, "claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsToAddOrOverrideUndefined: Self = StObject.set(x, "claimsToAddOrOverride", js.undefined)
    
    @scala.inline
    def setClaimsToSuppress(value: js.Array[String]): Self = StObject.set(x, "claimsToSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsToSuppressUndefined: Self = StObject.set(x, "claimsToSuppress", js.undefined)
    
    @scala.inline
    def setClaimsToSuppressVarargs(value: String*): Self = StObject.set(x, "claimsToSuppress", js.Array(value :_*))
    
    @scala.inline
    def setGroupOverrideDetails(value: GroupOverrideDetails): Self = StObject.set(x, "groupOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOverrideDetailsUndefined: Self = StObject.set(x, "groupOverrideDetails", js.undefined)
  }
}
