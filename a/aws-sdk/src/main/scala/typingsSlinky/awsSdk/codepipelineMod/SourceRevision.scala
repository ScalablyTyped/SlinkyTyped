package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRevision extends StObject {
  
  /**
    * The name of the action that processed the revision to the source artifact.
    */
  var actionName: ActionName = js.native
  
  /**
    * The system-generated unique ID that identifies the revision number of the artifact.
    */
  var revisionId: js.UndefOr[Revision] = js.native
  
  /**
    * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
  
  /**
    * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
}
object SourceRevision {
  
  @scala.inline
  def apply(actionName: ActionName): SourceRevision = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRevision]
  }
  
  @scala.inline
  implicit class SourceRevisionMutableBuilder[Self <: SourceRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: ActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Revision): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setRevisionSummary(value: RevisionSummary): Self = StObject.set(x, "revisionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionSummaryUndefined: Self = StObject.set(x, "revisionSummary", js.undefined)
    
    @scala.inline
    def setRevisionUrl(value: Url): Self = StObject.set(x, "revisionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUrlUndefined: Self = StObject.set(x, "revisionUrl", js.undefined)
  }
}
