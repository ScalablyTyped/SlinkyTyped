package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyDBClusterSnapshotMessage extends StObject {
  
  /**
    * A value that indicates whether to copy all tags from the source DB cluster snapshot to the target DB cluster snapshot. By default, tags are not copied.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.  If you copy an encrypted DB cluster snapshot from your AWS account, you can specify a value for KmsKeyId to encrypt the copy with a new KMS encryption key. If you don't specify a value for KmsKeyId, then the copy of the DB cluster snapshot is encrypted with the same KMS key as the source DB cluster snapshot.  If you copy an encrypted DB cluster snapshot that is shared from another AWS account, then you must specify a value for KmsKeyId.  To copy an encrypted DB cluster snapshot to another AWS Region, you must set KmsKeyId to the KMS key ID you want to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you can't use encryption keys from one AWS Region in another AWS Region. If you copy an unencrypted DB cluster snapshot and specify a value for the KmsKeyId parameter, an error is returned.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * The URL that contains a Signature Version 4 signed request for the CopyDBClusterSnapshot API action in the AWS Region that contains the source DB cluster snapshot to copy. The PreSignedUrl parameter must be used when copying an encrypted DB cluster snapshot from another AWS Region. Don't specify PreSignedUrl when you are copying an encrypted DB cluster snapshot in the same AWS Region. The pre-signed URL must be a valid request for the CopyDBClusterSnapshot API action that can be executed in the source AWS Region that contains the encrypted DB cluster snapshot to be copied. The pre-signed URL request must contain the following parameter values:    KmsKeyId - The AWS KMS key identifier for the key to use to encrypt the copy of the DB cluster snapshot in the destination AWS Region. This is the same identifier for both the CopyDBClusterSnapshot action that is called in the destination AWS Region, and the action contained in the pre-signed URL.    DestinationRegion - The name of the AWS Region that the DB cluster snapshot is to be created in.    SourceDBClusterSnapshotIdentifier - The DB cluster snapshot identifier for the encrypted DB cluster snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For example, if you are copying an encrypted DB cluster snapshot from the us-west-2 AWS Region, then your SourceDBClusterSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see  Authenticating Requests: Using Query Parameters (AWS Signature Version 4) and  Signature Version 4 Signing Process.  If you are using an AWS SDK tool or the AWS CLI, you can specify SourceRegion (or --source-region for the AWS CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a pre-signed URL that is a valid request for the operation that can be executed in the source AWS Region. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the DB cluster snapshot to copy. This parameter isn't case-sensitive. You can't copy an encrypted, shared DB cluster snapshot from one AWS Region to another. Constraints:   Must specify a valid system snapshot in the "available" state.   If the source snapshot is in the same AWS Region as the copy, specify a valid DB snapshot identifier.   If the source snapshot is in a different AWS Region than the copy, specify a valid DB cluster snapshot ARN. For more information, go to  Copying Snapshots Across AWS Regions in the Amazon Aurora User Guide.    Example: my-cluster-snapshot1 
    */
  var SourceDBClusterSnapshotIdentifier: String = js.native
  
  /**
    * The ID of the region that contains the snapshot to be copied.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The identifier of the new DB cluster snapshot to create from the source DB cluster snapshot. This parameter isn't case-sensitive. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   First character must be a letter.   Can't end with a hyphen or contain two consecutive hyphens.   Example: my-cluster-snapshot2 
    */
  var TargetDBClusterSnapshotIdentifier: String = js.native
}
object CopyDBClusterSnapshotMessage {
  
  @scala.inline
  def apply(SourceDBClusterSnapshotIdentifier: String, TargetDBClusterSnapshotIdentifier: String): CopyDBClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterSnapshotIdentifier = SourceDBClusterSnapshotIdentifier.asInstanceOf[js.Any], TargetDBClusterSnapshotIdentifier = TargetDBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterSnapshotMessage]
  }
  
  @scala.inline
  implicit class CopyDBClusterSnapshotMessageMutableBuilder[Self <: CopyDBClusterSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTags(value: BooleanOptional): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    @scala.inline
    def setSourceDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetDBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
