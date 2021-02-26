package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
  @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot")
  @js.native
  class Snapshot protected () extends CustomResource {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      */
    val dataEncryptionKeyId: Output_[String] = js.native
    
    /**
      * A description of what the snapshot is.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: Output_[Boolean] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: Output_[String] = js.native
    
    /**
      * The AWS account ID of the EBS snapshot owner.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: Output_[String] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: Output_[Double] = js.native
  }
  /* static members */
  object Snapshot {
    
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): Snapshot = js.native
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Snapshot = js.native
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState): Snapshot = js.native
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): Snapshot = js.native
    
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ebs/snapshot", "Snapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
  }
  
  @js.native
  trait SnapshotArgs extends StObject {
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: Input[String] = js.native
  }
  object SnapshotArgs {
    
    @scala.inline
    def apply(volumeId: Input[String]): SnapshotArgs = {
      val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotArgs]
    }
    
    @scala.inline
    implicit class SnapshotArgsMutableBuilder[Self <: SnapshotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SnapshotState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the EBS Snapshot.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The data encryption key identifier for the snapshot.
      */
    val dataEncryptionKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description of what the snapshot is.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the snapshot is encrypted.
      */
    val encrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARN for the KMS encryption key.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
      */
    val ownerAlias: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS account ID of the EBS snapshot owner.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the snapshot
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The Volume ID of which to make a snapshot.
      */
    val volumeId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The size of the drive in GiBs.
      */
    val volumeSize: js.UndefOr[Input[Double]] = js.native
  }
  object SnapshotState {
    
    @scala.inline
    def apply(): SnapshotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotState]
    }
    
    @scala.inline
    implicit class SnapshotStateMutableBuilder[Self <: SnapshotState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDataEncryptionKeyId(value: Input[String]): Self = StObject.set(x, "dataEncryptionKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataEncryptionKeyIdUndefined: Self = StObject.set(x, "dataEncryptionKeyId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEncrypted(value: Input[Boolean]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setOwnerAlias(value: Input[String]): Self = StObject.set(x, "ownerAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAliasUndefined: Self = StObject.set(x, "ownerAlias", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVolumeId(value: Input[String]): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
      
      @scala.inline
      def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    }
  }
}
