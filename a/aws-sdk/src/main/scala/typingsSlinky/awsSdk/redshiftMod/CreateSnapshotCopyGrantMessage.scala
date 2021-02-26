package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSnapshotCopyGrantMessage extends StObject {
  
  /**
    * The unique identifier of the customer master key (CMK) to which to grant Amazon Redshift permission. If no key is specified, the default key is used.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The name of the snapshot copy grant. This name must be unique in the region for the AWS account. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
    */
  var SnapshotCopyGrantName: String = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateSnapshotCopyGrantMessage {
  
  @scala.inline
  def apply(SnapshotCopyGrantName: String): CreateSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotCopyGrantMessage]
  }
  
  @scala.inline
  implicit class CreateSnapshotCopyGrantMessageMutableBuilder[Self <: CreateSnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
