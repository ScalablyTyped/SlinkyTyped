package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstStepRequired extends StObject {
  
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[Boolean] = js.native
  
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[String] = js.native
  
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[Number]] = js.native
  
  /** URL for this goal. */
  var url: js.UndefOr[String] = js.native
}
object FirstStepRequired {
  
  @scala.inline
  def apply(): FirstStepRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstStepRequired]
  }
  
  @scala.inline
  implicit class FirstStepRequiredMutableBuilder[Self <: FirstStepRequired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setFirstStepRequired(value: Boolean): Self = StObject.set(x, "firstStepRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstStepRequiredUndefined: Self = StObject.set(x, "firstStepRequired", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[Number]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Number*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
