package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstStepRequired extends js.Object {
  
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
  implicit class FirstStepRequiredOps[Self <: FirstStepRequired] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setFirstStepRequired(value: Boolean): Self = this.set("firstStepRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstStepRequired: Self = this.set("firstStepRequired", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Number*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[Number]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
