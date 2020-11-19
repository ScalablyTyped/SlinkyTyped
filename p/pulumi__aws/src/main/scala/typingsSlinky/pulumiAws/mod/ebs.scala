package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyArgs
import typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyState
import typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultArgs
import typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultState
import typingsSlinky.pulumiAws.getDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typingsSlinky.pulumiAws.getEbsVolumesMod.GetEbsVolumesArgs
import typingsSlinky.pulumiAws.getEbsVolumesMod.GetEbsVolumesResult
import typingsSlinky.pulumiAws.getEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typingsSlinky.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsArgs
import typingsSlinky.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsResult
import typingsSlinky.pulumiAws.getSnapshotMod.GetSnapshotArgs
import typingsSlinky.pulumiAws.getSnapshotMod.GetSnapshotResult
import typingsSlinky.pulumiAws.getVolumeMod.GetVolumeArgs
import typingsSlinky.pulumiAws.getVolumeMod.GetVolumeResult
import typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopyArgs
import typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopyState
import typingsSlinky.pulumiAws.snapshotMod.SnapshotArgs
import typingsSlinky.pulumiAws.snapshotMod.SnapshotState
import typingsSlinky.pulumiAws.volumeMod.VolumeArgs
import typingsSlinky.pulumiAws.volumeMod.VolumeState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ebs")
@js.native
object ebs extends js.Object {
  
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] = js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] = js.native
  
  def getEbsVolumes(): js.Promise[GetEbsVolumesResult] = js.native
  def getEbsVolumes(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  def getEbsVolumes(args: GetEbsVolumesArgs): js.Promise[GetEbsVolumesResult] = js.native
  def getEbsVolumes(args: GetEbsVolumesArgs, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] = js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] = js.native
  
  def getSnapshot(): js.Promise[GetSnapshotResult] = js.native
  def getSnapshot(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] = js.native
  
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] = js.native
  def getSnapshotIds(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] = js.native
  
  def getVolume(): js.Promise[GetVolumeResult] = js.native
  def getVolume(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] = js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] = js.native
  
  @js.native
  class DefaultKmsKey protected ()
    extends typingsSlinky.pulumiAws.ebsMod.DefaultKmsKey {
    /**
      * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultKmsKeyArgs) = this()
    def this(name: String, args: DefaultKmsKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object DefaultKmsKey extends js.Object {
    
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
  }
  
  @js.native
  class EncryptionByDefault protected ()
    extends typingsSlinky.pulumiAws.ebsMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object EncryptionByDefault extends js.Object {
    
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
  }
  
  @js.native
  class Snapshot protected ()
    extends typingsSlinky.pulumiAws.ebsMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typingsSlinky.pulumiAws.snapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotMod.Snapshot = js.native
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
  }
  
  @js.native
  class SnapshotCopy protected ()
    extends typingsSlinky.pulumiAws.ebsMod.SnapshotCopy {
    /**
      * Create a SnapshotCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyArgs) = this()
    def this(name: String, args: SnapshotCopyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object SnapshotCopy extends js.Object {
    
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
  }
  
  @js.native
  class Volume protected ()
    extends typingsSlinky.pulumiAws.ebsMod.Volume {
    /**
      * Create a Volume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VolumeArgs) = this()
    def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Volume extends js.Object {
    
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.volumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.volumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState): typingsSlinky.pulumiAws.volumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.volumeMod.Volume = js.native
    
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
}
