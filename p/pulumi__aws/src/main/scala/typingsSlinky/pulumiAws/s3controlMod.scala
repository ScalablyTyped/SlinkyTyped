package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationArgs
import typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfigurationState
import typingsSlinky.pulumiAws.bucketMod.BucketArgs
import typingsSlinky.pulumiAws.bucketMod.BucketState
import typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicyArgs
import typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicyState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3control", JSImport.Namespace)
@js.native
object s3controlMod extends js.Object {
  
  @js.native
  class Bucket protected ()
    extends typingsSlinky.pulumiAws.bucketMod.Bucket {
    /**
      * Create a Bucket resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketArgs) = this()
    def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Bucket extends js.Object {
    
    /**
      * Get an existing Bucket resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.bucketMod.Bucket = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketMod.Bucket = js.native
    def get(name: String, id: Input[ID], state: BucketState): typingsSlinky.pulumiAws.bucketMod.Bucket = js.native
    def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketMod.Bucket = js.native
    
    /**
      * Returns true if the given object is an instance of Bucket.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucket.Bucket */ Boolean = js.native
  }
  
  @js.native
  class BucketLifecycleConfiguration protected ()
    extends typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration {
    /**
      * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
    def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object BucketLifecycleConfiguration extends js.Object {
    
    /**
      * Get an existing BucketLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketLifecycleConfigurationMod.BucketLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = js.native
  }
  
  @js.native
  class BucketPolicy protected ()
    extends typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicy {
    /**
      * Create a BucketPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketPolicyArgs) = this()
    def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object BucketPolicy extends js.Object {
    
    /**
      * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState): typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean = js.native
  }
}
