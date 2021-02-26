package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseImageVersions2 extends StObject {
  
  var additional_candidates: js.UndefOr[TopicalExploreFeedResponseAdditionalCandidates] = js.native
  
  var candidates: js.Array[TopicalExploreFeedResponseCandidatesItem] = js.native
}
object TopicalExploreFeedResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[TopicalExploreFeedResponseCandidatesItem]): TopicalExploreFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseImageVersions2]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseImageVersions2MutableBuilder[Self <: TopicalExploreFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_candidates(value: TopicalExploreFeedResponseAdditionalCandidates): Self = StObject.set(x, "additional_candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_candidatesUndefined: Self = StObject.set(x, "additional_candidates", js.undefined)
    
    @scala.inline
    def setCandidates(value: js.Array[TopicalExploreFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidatesVarargs(value: TopicalExploreFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
  }
}
