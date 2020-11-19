package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.cacheMod.CacheArgs
import typingsSlinky.pulumiAws.cacheMod.CacheState
import typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeArgs
import typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeState
import typingsSlinky.pulumiAws.getLocalDiskMod.GetLocalDiskArgs
import typingsSlinky.pulumiAws.getLocalDiskMod.GetLocalDiskResult
import typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShareArgs
import typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShareState
import typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShareArgs
import typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShareState
import typingsSlinky.pulumiAws.storagegatewayGatewayMod.GatewayArgs
import typingsSlinky.pulumiAws.storagegatewayGatewayMod.GatewayState
import typingsSlinky.pulumiAws.uploadBufferMod.UploadBufferArgs
import typingsSlinky.pulumiAws.uploadBufferMod.UploadBufferState
import typingsSlinky.pulumiAws.workingStorageMod.WorkingStorageArgs
import typingsSlinky.pulumiAws.workingStorageMod.WorkingStorageState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/storagegateway", JSImport.Namespace)
@js.native
object storagegatewayMod extends js.Object {
  
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = js.native
  
  @js.native
  class Cache protected ()
    extends typingsSlinky.pulumiAws.cacheMod.Cache {
    /**
      * Create a Cache resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CacheArgs) = this()
    def this(name: String, args: CacheArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Cache extends js.Object {
    
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
  }
  
  @js.native
  class CachesIscsiVolume protected ()
    extends typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume {
    /**
      * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CachesIscsiVolumeArgs) = this()
    def this(name: String, args: CachesIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object CachesIscsiVolume extends js.Object {
    
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  @js.native
  class Gateway protected ()
    extends typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Gateway extends js.Object {
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  @js.native
  class NfsFileShare protected ()
    extends typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare {
    /**
      * Create a NfsFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsFileShareArgs) = this()
    def this(name: String, args: NfsFileShareArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object NfsFileShare extends js.Object {
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  @js.native
  class SmbFileShare protected ()
    extends typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare {
    /**
      * Create a SmbFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmbFileShareArgs) = this()
    def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
  }
  
  @js.native
  class UploadBuffer protected ()
    extends typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer {
    /**
      * Create a UploadBuffer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UploadBufferArgs) = this()
    def this(name: String, args: UploadBufferArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object UploadBuffer extends js.Object {
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  @js.native
  class WorkingStorage protected ()
    extends typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage {
    /**
      * Create a WorkingStorage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkingStorageArgs) = this()
    def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object WorkingStorage extends js.Object {
    
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
}
