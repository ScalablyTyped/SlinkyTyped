package typingsSlinky.pulumiAws.smbFileShareMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.storagegateway.SmbFileShareCacheAttributes
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
@js.native
class SmbFileShare protected () extends CustomResource {
  /**
    * Create a SmbFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SmbFileShareArgs) = this()
  def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A list of users in the Active Directory that have admin access to the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val adminUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the SMB File Share.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Log Group used for the audit logs.
    */
  val auditDestinationArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
    */
  val authentication: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Refresh cache information. see Cache Attributes for more details.
    */
  val cacheAttributes: Output_[js.UndefOr[SmbFileShareCacheAttributes]] = js.native
  
  /**
    * The case of an object name in an Amazon S3 bucket. For `ClientSpecified`, the client determines the case sensitivity. For `CaseSensitive`, the gateway determines the case sensitivity. The default value is `ClientSpecified`.
    */
  val caseSensitivity: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the file share. Must be set if an S3 prefix name is set in `locationArn`.
    */
  val fileShareName: Output_[String] = js.native
  
  /**
    * ID of the SMB File Share.
    */
  val fileshareId: Output_[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: Output_[String] = js.native
  
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val invalidUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is true.
    */
  val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: Output_[String] = js.native
  
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: Output_[js.UndefOr[String]] = js.native
  
  /**
    * File share path used by the NFS client to identify the mount point.
    */
  val path: Output_[String] = js.native
  
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: Output_[String] = js.native
  
  /**
    * Set this value to `true` to enable ACL (access control list) on the SMB fileshare. Set it to `false` to map file and directory permissions to the POSIX permissions. This setting applies only to `ActiveDirectory` authentication type.
    */
  val smbAclEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val validUserLists: Output_[js.UndefOr[js.Array[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/storagegateway/smbFileShare", "SmbFileShare")
@js.native
object SmbFileShare extends js.Object {
  
  /**
    * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState): SmbFileShare = js.native
  def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): SmbFileShare = js.native
  
  /**
    * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
}
