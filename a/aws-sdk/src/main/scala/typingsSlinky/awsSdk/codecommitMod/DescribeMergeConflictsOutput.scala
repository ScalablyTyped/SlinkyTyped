package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMergeConflictsOutput extends StObject {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * Contains metadata about the conflicts found in the merge.
    */
  var conflictMetadata: ConflictMetadata = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  
  /**
    * A list of merge hunks of the differences between the files or lines.
    */
  var mergeHunks: MergeHunks = js.native
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}
object DescribeMergeConflictsOutput {
  
  @scala.inline
  def apply(
    conflictMetadata: ConflictMetadata,
    destinationCommitId: ObjectId,
    mergeHunks: MergeHunks,
    sourceCommitId: ObjectId
  ): DescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadata = conflictMetadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeHunks = mergeHunks.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMergeConflictsOutput]
  }
  
  @scala.inline
  implicit class DescribeMergeConflictsOutputMutableBuilder[Self <: DescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommitIdUndefined: Self = StObject.set(x, "baseCommitId", js.undefined)
    
    @scala.inline
    def setConflictMetadata(value: ConflictMetadata): Self = StObject.set(x, "conflictMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeHunks(value: MergeHunks): Self = StObject.set(x, "mergeHunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeHunksVarargs(value: MergeHunk*): Self = StObject.set(x, "mergeHunks", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
