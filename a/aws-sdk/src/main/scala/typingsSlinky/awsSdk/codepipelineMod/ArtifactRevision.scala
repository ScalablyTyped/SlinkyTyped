package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactRevision extends StObject {
  
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of an artifact. This name might be system-generated, such as "MyApp", or defined by the user when an action is created.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  
  /**
    * An additional identifier for a revision, such as a commit date or, for artifacts stored in Amazon S3 buckets, the ETag value.
    */
  var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.native
  
  /**
    * The revision ID of the artifact.
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
object ArtifactRevision {
  
  @scala.inline
  def apply(): ArtifactRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRevision]
  }
  
  @scala.inline
  implicit class ArtifactRevisionMutableBuilder[Self <: ArtifactRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setName(value: ArtifactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRevisionChangeIdentifier(value: RevisionChangeIdentifier): Self = StObject.set(x, "revisionChangeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionChangeIdentifierUndefined: Self = StObject.set(x, "revisionChangeIdentifier", js.undefined)
    
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
