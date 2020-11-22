package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightsRepositoryEditReelResponseImageVersions2 extends js.Object {
  
  var candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem] = js.native
}
object HighlightsRepositoryEditReelResponseImageVersions2 {
  
  @scala.inline
  def apply(candidates: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): HighlightsRepositoryEditReelResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseImageVersions2]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseImageVersions2Ops[Self <: HighlightsRepositoryEditReelResponseImageVersions2] (val x: Self) extends AnyVal {
    
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
    def setCandidatesVarargs(value: HighlightsRepositoryEditReelResponseCandidatesItem*): Self = this.set("candidates", js.Array(value :_*))
    
    @scala.inline
    def setCandidates(value: js.Array[HighlightsRepositoryEditReelResponseCandidatesItem]): Self = this.set("candidates", value.asInstanceOf[js.Any])
  }
}
