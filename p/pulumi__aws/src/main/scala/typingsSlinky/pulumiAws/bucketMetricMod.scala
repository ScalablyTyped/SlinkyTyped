package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.s3.BucketMetricFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bucketMetricMod {
  
  @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
  @js.native
  class BucketMetric protected () extends CustomResource {
    /**
      * Create a BucketMetric resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BucketMetricArgs) = this()
    def this(name: String, args: BucketMetricArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: Output_[js.UndefOr[BucketMetricFilter]] = js.native
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object BucketMetric {
    
    /**
      * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID]): BucketMetric = js.native
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketMetric = js.native
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketMetricState): BucketMetric = js.native
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric.get")
    @js.native
    def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): BucketMetric = js.native
    
    /**
      * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = js.native
  }
  
  @js.native
  trait BucketMetricArgs extends StObject {
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: Input[String] = js.native
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketMetricFilter]] = js.native
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object BucketMetricArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): BucketMetricArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketMetricArgs]
    }
    
    @scala.inline
    implicit class BucketMetricArgsMutableBuilder[Self <: BucketMetricArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketMetricFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait BucketMetricState extends StObject {
    
    /**
      * The name of the bucket to put metric configuration.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.BucketMetricFilter]] = js.native
    
    /**
      * Unique identifier of the metrics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object BucketMetricState {
    
    @scala.inline
    def apply(): BucketMetricState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketMetricState]
    }
    
    @scala.inline
    implicit class BucketMetricStateMutableBuilder[Self <: BucketMetricState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setFilter(value: Input[typingsSlinky.pulumiAws.inputMod.s3.BucketMetricFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
