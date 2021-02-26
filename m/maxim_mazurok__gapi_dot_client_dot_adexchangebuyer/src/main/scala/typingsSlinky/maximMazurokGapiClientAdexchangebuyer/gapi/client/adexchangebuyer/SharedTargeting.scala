package typingsSlinky.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedTargeting extends StObject {
  
  /** The list of values to exclude from targeting. Each value is AND'd together. */
  var exclusions: js.UndefOr[js.Array[TargetingValue]] = js.native
  
  /** The list of value to include as part of the targeting. Each value is OR'd together. */
  var inclusions: js.UndefOr[js.Array[TargetingValue]] = js.native
  
  /** The key representing the shared targeting criterion. */
  var key: js.UndefOr[String] = js.native
}
object SharedTargeting {
  
  @scala.inline
  def apply(): SharedTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedTargeting]
  }
  
  @scala.inline
  implicit class SharedTargetingMutableBuilder[Self <: SharedTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusions(value: js.Array[TargetingValue]): Self = StObject.set(x, "exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionsUndefined: Self = StObject.set(x, "exclusions", js.undefined)
    
    @scala.inline
    def setExclusionsVarargs(value: TargetingValue*): Self = StObject.set(x, "exclusions", js.Array(value :_*))
    
    @scala.inline
    def setInclusions(value: js.Array[TargetingValue]): Self = StObject.set(x, "inclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionsUndefined: Self = StObject.set(x, "inclusions", js.undefined)
    
    @scala.inline
    def setInclusionsVarargs(value: TargetingValue*): Self = StObject.set(x, "inclusions", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
