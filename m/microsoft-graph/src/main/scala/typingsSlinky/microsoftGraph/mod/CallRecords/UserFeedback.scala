package typingsSlinky.microsoftGraph.mod.CallRecords

import typingsSlinky.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFeedback extends StObject {
  
  /**
    * The rating provided by the user of this endpoint about the quality of this Session. Possible values are: notRated, bad,
    * poor, fair, good, excellent, unknownFutureValue.
    */
  var rating: js.UndefOr[UserFeedbackRating] = js.native
  
  // The feedback text provided by the user of this endpoint for the session.
  var text: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The set of feedback tokens provided by the user of this endpoint for the session. This is a set of Boolean properties.
    * The property names should not be relied upon since they may change depending on what tokens are offered to the user.
    */
  var tokens: js.UndefOr[NullableOption[FeedbackTokenSet]] = js.native
}
object UserFeedback {
  
  @scala.inline
  def apply(): UserFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserFeedback]
  }
  
  @scala.inline
  implicit class UserFeedbackMutableBuilder[Self <: UserFeedback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: UserFeedbackRating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTokens(value: NullableOption[FeedbackTokenSet]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensNull: Self = StObject.set(x, "tokens", null)
    
    @scala.inline
    def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
  }
}
