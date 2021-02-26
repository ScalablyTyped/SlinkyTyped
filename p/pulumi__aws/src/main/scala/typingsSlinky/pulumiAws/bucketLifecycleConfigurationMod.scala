package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.s3control.BucketLifecycleConfigurationRule
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketLifecycleConfigurationMod {
  
  @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration")
  @js.native
  class BucketLifecycleConfiguration protected () extends CustomResource {
    /**
      * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
    def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: Output_[js.Array[BucketLifecycleConfigurationRule]] = js.native
  }
  /* static members */
  object BucketLifecycleConfiguration {
    
    /**
      * Get an existing BucketLifecycleConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): BucketLifecycleConfiguration = js.native
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): BucketLifecycleConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait BucketLifecycleConfigurationArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: Input[
        js.Array[
          Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]
        ]
      ] = js.native
  }
  object BucketLifecycleConfigurationArgs {
    
    @scala.inline
    def apply(
      bucket: Input[String],
      rules: Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]
          ]
        ]
    ): BucketLifecycleConfigurationArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationArgs]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationArgsMutableBuilder[Self <: BucketLifecycleConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]
              ]
            ]
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BucketLifecycleConfigurationState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the bucket.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block(s) containing lifecycle rules for the bucket.
      */
    val rules: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]
          ]
        ]
      ] = js.native
  }
  object BucketLifecycleConfigurationState {
    
    @scala.inline
    def apply(): BucketLifecycleConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationState]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationStateMutableBuilder[Self <: BucketLifecycleConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setRules(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]
              ]
            ]
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3control.BucketLifecycleConfigurationRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
