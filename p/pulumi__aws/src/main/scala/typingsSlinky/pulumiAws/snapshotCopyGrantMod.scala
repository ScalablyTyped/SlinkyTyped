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

object snapshotCopyGrantMod {
  
  @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
  @js.native
  class SnapshotCopyGrant protected () extends CustomResource {
    /**
      * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyGrantArgs) = this()
    def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of snapshot copy grant
      */
    val arn: Output_[String] = js.native
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object SnapshotCopyGrant {
    
    /**
      * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID]): SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): SnapshotCopyGrant = js.native
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant.get")
    @js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): SnapshotCopyGrant = js.native
    
    /**
      * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
  }
  
  @js.native
  trait SnapshotCopyGrantArgs extends StObject {
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: Input[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object SnapshotCopyGrantArgs {
    
    @scala.inline
    def apply(snapshotCopyGrantName: Input[String]): SnapshotCopyGrantArgs = {
      val __obj = js.Dynamic.literal(snapshotCopyGrantName = snapshotCopyGrantName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotCopyGrantArgs]
    }
    
    @scala.inline
    implicit class SnapshotCopyGrantArgsMutableBuilder[Self <: SnapshotCopyGrantArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setSnapshotCopyGrantName(value: Input[String]): Self = StObject.set(x, "snapshotCopyGrantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait SnapshotCopyGrantState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of snapshot copy grant
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val snapshotCopyGrantName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object SnapshotCopyGrantState {
    
    @scala.inline
    def apply(): SnapshotCopyGrantState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapshotCopyGrantState]
    }
    
    @scala.inline
    implicit class SnapshotCopyGrantStateMutableBuilder[Self <: SnapshotCopyGrantState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setSnapshotCopyGrantName(value: Input[String]): Self = StObject.set(x, "snapshotCopyGrantName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "snapshotCopyGrantName", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
