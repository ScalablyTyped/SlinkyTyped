package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeConflictsOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list is always empty.
    */
  var conflictMetadataList: ConflictMetadataList = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  
  /**
    * A Boolean value that indicates whether the code is mergeable by the specified merge option.
    */
  var mergeable: IsMergeable = js.native
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}
object GetMergeConflictsOutput {
  
  @scala.inline
  def apply(
    conflictMetadataList: ConflictMetadataList,
    destinationCommitId: ObjectId,
    mergeable: IsMergeable,
    sourceCommitId: ObjectId
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadataList = conflictMetadataList.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
  
  @scala.inline
  implicit class GetMergeConflictsOutputMutableBuilder[Self <: GetMergeConflictsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommitIdUndefined: Self = StObject.set(x, "baseCommitId", js.undefined)
    
    @scala.inline
    def setConflictMetadataList(value: ConflictMetadataList): Self = StObject.set(x, "conflictMetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictMetadataListVarargs(value: ConflictMetadata*): Self = StObject.set(x, "conflictMetadataList", js.Array(value :_*))
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable(value: IsMergeable): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
