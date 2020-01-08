package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs
import typingsSlinky.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyState
import typingsSlinky.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultArgs
import typingsSlinky.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultState
import typingsSlinky.atPulumiAws.ebsGetDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typingsSlinky.atPulumiAws.ebsGetEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typingsSlinky.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsArgs
import typingsSlinky.atPulumiAws.ebsGetSnapshotIdsMod.GetSnapshotIdsResult
import typingsSlinky.atPulumiAws.ebsGetSnapshotMod.GetSnapshotArgs
import typingsSlinky.atPulumiAws.ebsGetSnapshotMod.GetSnapshotResult
import typingsSlinky.atPulumiAws.ebsGetVolumeMod.GetVolumeArgs
import typingsSlinky.atPulumiAws.ebsGetVolumeMod.GetVolumeResult
import typingsSlinky.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopyArgs
import typingsSlinky.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopyState
import typingsSlinky.atPulumiAws.ebsSnapshotMod.SnapshotArgs
import typingsSlinky.atPulumiAws.ebsSnapshotMod.SnapshotState
import typingsSlinky.atPulumiAws.ebsVolumeMod.VolumeArgs
import typingsSlinky.atPulumiAws.ebsVolumeMod.VolumeState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ebs")
@js.native
object ebs extends js.Object {
  @js.native
  class DefaultKmsKey protected ()
    extends typingsSlinky.atPulumiAws.ebsMod.DefaultKmsKey {
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
  
  @js.native
  class EncryptionByDefault protected ()
    extends typingsSlinky.atPulumiAws.ebsMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typingsSlinky.atPulumiAws.ebsMod.Snapshot {
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
  
  @js.native
  class SnapshotCopy protected ()
    extends typingsSlinky.atPulumiAws.ebsMod.SnapshotCopy {
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
  
  @js.native
  class Volume protected ()
    extends typingsSlinky.atPulumiAws.ebsMod.Volume {
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
  
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getVolume(): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typingsSlinky.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typingsSlinky.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typingsSlinky.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ebsSnapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typingsSlinky.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ebsSnapshotCopyMod.SnapshotCopy = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.ebsVolumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState): typingsSlinky.atPulumiAws.ebsVolumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.ebsVolumeMod.Volume = js.native
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
  
}

