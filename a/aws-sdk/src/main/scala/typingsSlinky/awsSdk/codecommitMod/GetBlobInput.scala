package typingsSlinky.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBlobInput extends StObject {
  
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId = js.native
  
  /**
    * The name of the repository that contains the blob.
    */
  var repositoryName: RepositoryName = js.native
}
object GetBlobInput {
  
  @scala.inline
  def apply(blobId: ObjectId, repositoryName: RepositoryName): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobInput]
  }
  
  @scala.inline
  implicit class GetBlobInputMutableBuilder[Self <: GetBlobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
