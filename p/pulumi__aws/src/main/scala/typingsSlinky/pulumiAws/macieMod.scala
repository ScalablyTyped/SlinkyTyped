package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociationArgs
import typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociationState
import typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociationArgs
import typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macieMod {
  
  @JSImport("@pulumi/aws/macie", "MemberAccountAssociation")
  @js.native
  class MemberAccountAssociation protected ()
    extends typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation {
    /**
      * Create a MemberAccountAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberAccountAssociationArgs) = this()
    def this(name: String, args: MemberAccountAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MemberAccountAssociation {
    
    /**
      * Get an existing MemberAccountAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState): typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = js.native
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberAccountAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.memberAccountAssociationMod.MemberAccountAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of MemberAccountAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/macie", "MemberAccountAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/memberAccountAssociation.MemberAccountAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/macie", "S3BucketAssociation")
  @js.native
  class S3BucketAssociation protected ()
    extends typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociation {
    /**
      * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3BucketAssociationArgs) = this()
    def this(name: String, args: S3BucketAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object S3BucketAssociation {
    
    /**
      * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState): typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = js.native
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: S3BucketAssociationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.s3bucketAssociationMod.S3BucketAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of S3BucketAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/macie", "S3BucketAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/s3bucketAssociation.S3BucketAssociation */ Boolean = js.native
  }
}
