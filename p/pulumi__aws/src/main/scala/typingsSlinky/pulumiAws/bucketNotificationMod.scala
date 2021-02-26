package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.s3.BucketNotificationLambdaFunction
import typingsSlinky.pulumiAws.outputMod.s3.BucketNotificationQueue
import typingsSlinky.pulumiAws.outputMod.s3.BucketNotificationTopic
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketNotificationMod {
  
  @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification")
  @js.native
  class BucketNotification protected () extends CustomResource {
    /**
      * Create a BucketNotification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketNotificationArgs) = this()
    def this(name: String, args: BucketNotificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the bucket to put notification configuration.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Used to configure notifications to a Lambda Function (documented below).
      */
    val lambdaFunctions: Output_[js.UndefOr[js.Array[BucketNotificationLambdaFunction]]] = js.native
    
    /**
      * The notification configuration to SQS Queue (documented below).
      */
    val queues: Output_[js.UndefOr[js.Array[BucketNotificationQueue]]] = js.native
    
    /**
      * The notification configuration to SNS Topic (documented below).
      */
    val topics: Output_[js.UndefOr[js.Array[BucketNotificationTopic]]] = js.native
  }
  /* static members */
  object BucketNotification {
    
    /**
      * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketNotification = js.native
    @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketNotification = js.native
    @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState): BucketNotification = js.native
    @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): BucketNotification = js.native
    
    /**
      * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
  }
  
  @js.native
  trait BucketNotificationArgs extends StObject {
    
    /**
      * The name of the bucket to put notification configuration.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Used to configure notifications to a Lambda Function (documented below).
      */
    val lambdaFunctions: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]]
        ]
      ] = js.native
    
    /**
      * The notification configuration to SQS Queue (documented below).
      */
    val queues: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]]]
      ] = js.native
    
    /**
      * The notification configuration to SNS Topic (documented below).
      */
    val topics: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]]]
      ] = js.native
  }
  object BucketNotificationArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): BucketNotificationArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketNotificationArgs]
    }
    
    @scala.inline
    implicit class BucketNotificationArgsMutableBuilder[Self <: BucketNotificationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctions(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]]
            ]
      ): Self = StObject.set(x, "lambdaFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionsUndefined: Self = StObject.set(x, "lambdaFunctions", js.undefined)
      
      @scala.inline
      def setLambdaFunctionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]*): Self = StObject.set(x, "lambdaFunctions", js.Array(value :_*))
      
      @scala.inline
      def setQueues(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]]]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
      
      @scala.inline
      def setQueuesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]*): Self = StObject.set(x, "queues", js.Array(value :_*))
      
      @scala.inline
      def setTopics(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      @scala.inline
      def setTopicsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BucketNotificationState extends StObject {
    
    /**
      * The name of the bucket to put notification configuration.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Used to configure notifications to a Lambda Function (documented below).
      */
    val lambdaFunctions: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]]
        ]
      ] = js.native
    
    /**
      * The notification configuration to SQS Queue (documented below).
      */
    val queues: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]]]
      ] = js.native
    
    /**
      * The notification configuration to SNS Topic (documented below).
      */
    val topics: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]]]
      ] = js.native
  }
  object BucketNotificationState {
    
    @scala.inline
    def apply(): BucketNotificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketNotificationState]
    }
    
    @scala.inline
    implicit class BucketNotificationStateMutableBuilder[Self <: BucketNotificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setLambdaFunctions(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]]
            ]
      ): Self = StObject.set(x, "lambdaFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionsUndefined: Self = StObject.set(x, "lambdaFunctions", js.undefined)
      
      @scala.inline
      def setLambdaFunctionsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationLambdaFunction]*): Self = StObject.set(x, "lambdaFunctions", js.Array(value :_*))
      
      @scala.inline
      def setQueues(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]]]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueuesUndefined: Self = StObject.set(x, "queues", js.undefined)
      
      @scala.inline
      def setQueuesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationQueue]*): Self = StObject.set(x, "queues", js.Array(value :_*))
      
      @scala.inline
      def setTopics(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      @scala.inline
      def setTopicsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketNotificationTopic]*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
}
