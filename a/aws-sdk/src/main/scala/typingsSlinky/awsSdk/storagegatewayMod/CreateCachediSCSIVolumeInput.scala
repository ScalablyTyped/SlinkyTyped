package typingsSlinky.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCachediSCSIVolumeInput extends StObject {
  
  /**
    * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.
    */
  var ClientToken: typingsSlinky.awsSdk.storagegatewayMod.ClientToken = js.native
  
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway. Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typingsSlinky.awsSdk.storagegatewayMod.NetworkInterfaceId = js.native
  
  /**
    * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if you want to create the iSCSI storage volume from a snapshot; otherwise, do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.SnapshotId] = js.native
  
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The VolumeSizeInBytes value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  var SourceVolumeARN: js.UndefOr[VolumeARN] = js.native
  
  /**
    * A list of up to 50 tags that you can assign to a cached volume. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers that you can represent in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256 characters. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: typingsSlinky.awsSdk.storagegatewayMod.TargetName = js.native
  
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: long = js.native
}
object CreateCachediSCSIVolumeInput {
  
  @scala.inline
  def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    NetworkInterfaceId: NetworkInterfaceId,
    TargetName: TargetName,
    VolumeSizeInBytes: long
  ): CreateCachediSCSIVolumeInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], TargetName = TargetName.asInstanceOf[js.Any], VolumeSizeInBytes = VolumeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachediSCSIVolumeInput]
  }
  
  @scala.inline
  implicit class CreateCachediSCSIVolumeInputMutableBuilder[Self <: CreateCachediSCSIVolumeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    @scala.inline
    def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setSourceVolumeARN(value: VolumeARN): Self = StObject.set(x, "SourceVolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVolumeARNUndefined: Self = StObject.set(x, "SourceVolumeARN", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetName(value: TargetName): Self = StObject.set(x, "TargetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
  }
}
