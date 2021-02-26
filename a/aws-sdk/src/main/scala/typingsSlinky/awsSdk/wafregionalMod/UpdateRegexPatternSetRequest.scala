package typingsSlinky.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRegexPatternSetRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typingsSlinky.awsSdk.wafregionalMod.ChangeToken = js.native
  
  /**
    * The RegexPatternSetId of the RegexPatternSet that you want to update. RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
  
  /**
    * An array of RegexPatternSetUpdate objects that you want to insert into or delete from a RegexPatternSet.
    */
  var Updates: RegexPatternSetUpdates = js.native
}
object UpdateRegexPatternSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, RegexPatternSetId: ResourceId, Updates: RegexPatternSetUpdates): UpdateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRegexPatternSetRequest]
  }
  
  @scala.inline
  implicit class UpdateRegexPatternSetRequestMutableBuilder[Self <: UpdateRegexPatternSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetId(value: ResourceId): Self = StObject.set(x, "RegexPatternSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdates(value: RegexPatternSetUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: RegexPatternSetUpdate*): Self = StObject.set(x, "Updates", js.Array(value :_*))
  }
}
