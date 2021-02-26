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
import typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolumeArgs
import typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolumeState
import typingsSlinky.pulumiAws.tapePoolMod.TapePoolArgs
import typingsSlinky.pulumiAws.tapePoolMod.TapePoolState
import typingsSlinky.pulumiAws.uploadBufferMod.UploadBufferArgs
import typingsSlinky.pulumiAws.uploadBufferMod.UploadBufferState
import typingsSlinky.pulumiAws.workingStorageMod.WorkingStorageArgs
import typingsSlinky.pulumiAws.workingStorageMod.WorkingStorageState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegatewayMod {
  
  @JSImport("@pulumi/aws/storagegateway", "Cache")
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
  object Cache {
    
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "Cache.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws/storagegateway", "Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws/storagegateway", "Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: CacheState): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    @JSImport("@pulumi/aws/storagegateway", "Cache.get")
    @js.native
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.cacheMod.Cache = js.native
    
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "Cache.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume")
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
  object CachesIscsiVolume {
    
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "CachesIscsiVolume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "Gateway")
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
  object Gateway {
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "Gateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "NfsFileShare")
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
  object NfsFileShare {
    
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "NfsFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "NfsFileShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "SmbFileShare")
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
  object SmbFileShare {
    
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    @JSImport("@pulumi/aws/storagegateway", "SmbFileShare.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "SmbFileShare.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume")
  @js.native
  class StoredIscsiVolume protected ()
    extends typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume {
    /**
      * Create a StoredIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StoredIscsiVolumeArgs) = this()
    def this(name: String, args: StoredIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StoredIscsiVolume {
    
    /**
      * Get an existing StoredIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState): typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume.get")
    @js.native
    def get(name: String, id: Input[ID], state: StoredIscsiVolumeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.storedIscsiVolumeMod.StoredIscsiVolume = js.native
    
    /**
      * Returns true if the given object is an instance of StoredIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "StoredIscsiVolume.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/storedIscsiVolume.StoredIscsiVolume */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "TapePool")
  @js.native
  class TapePool protected ()
    extends typingsSlinky.pulumiAws.tapePoolMod.TapePool {
    /**
      * Create a TapePool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TapePoolArgs) = this()
    def this(name: String, args: TapePoolArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TapePool {
    
    /**
      * Get an existing TapePool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "TapePool.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws/storagegateway", "TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws/storagegateway", "TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: TapePoolState): typingsSlinky.pulumiAws.tapePoolMod.TapePool = js.native
    @JSImport("@pulumi/aws/storagegateway", "TapePool.get")
    @js.native
    def get(name: String, id: Input[ID], state: TapePoolState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.tapePoolMod.TapePool = js.native
    
    /**
      * Returns true if the given object is an instance of TapePool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "TapePool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "UploadBuffer")
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
  object UploadBuffer {
    
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    @JSImport("@pulumi/aws/storagegateway", "UploadBuffer.get")
    @js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "UploadBuffer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "WorkingStorage")
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
  object WorkingStorage {
    
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    @JSImport("@pulumi/aws/storagegateway", "WorkingStorage.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.workingStorageMod.WorkingStorage = js.native
    
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway", "WorkingStorage.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/storagegateway", "getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] = js.native
  @JSImport("@pulumi/aws/storagegateway", "getLocalDisk")
  @js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] = js.native
}
