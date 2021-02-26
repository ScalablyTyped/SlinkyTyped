package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetCommitsInput extends StObject {
  
  /**
    * The full commit IDs of the commits to get information about.  You must supply the full SHA IDs of each commit. You cannot use shortened SHA IDs. 
    */
  var commitIds: CommitIdsInputList = js.native
  
  /**
    * The name of the repository that contains the commits.
    */
  var repositoryName: RepositoryName = js.native
}
object BatchGetCommitsInput {
  
  @scala.inline
  def apply(commitIds: CommitIdsInputList, repositoryName: RepositoryName): BatchGetCommitsInput = {
    val __obj = js.Dynamic.literal(commitIds = commitIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetCommitsInput]
  }
  
  @scala.inline
  implicit class BatchGetCommitsInputMutableBuilder[Self <: BatchGetCommitsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitIds(value: CommitIdsInputList): Self = StObject.set(x, "commitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdsVarargs(value: ObjectId*): Self = StObject.set(x, "commitIds", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
