package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.s3.AnalyticsConfigurationFilter
import typingsSlinky.pulumiAws.outputMod.s3.AnalyticsConfigurationStorageClassAnalysis
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsConfigurationMod {
  
  @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration")
  @js.native
  class AnalyticsConfiguration protected () extends CustomResource {
    /**
      * Create a AnalyticsConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AnalyticsConfigurationArgs) = this()
    def this(name: String, args: AnalyticsConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the bucket this analytics configuration is associated with.
      */
    val bucket: Output_[String] = js.native
    
    /**
      * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: Output_[js.UndefOr[AnalyticsConfigurationFilter]] = js.native
    
    /**
      * Unique identifier of the analytics configuration for the bucket.
      */
    val name: Output_[String] = js.native
    
    /**
      * Configuration for the analytics data export (documented below).
      */
    val storageClassAnalysis: Output_[js.UndefOr[AnalyticsConfigurationStorageClassAnalysis]] = js.native
  }
  /* static members */
  object AnalyticsConfiguration {
    
    /**
      * Get an existing AnalyticsConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsConfigurationState): AnalyticsConfiguration = js.native
    @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: AnalyticsConfigurationState, opts: CustomResourceOptions): AnalyticsConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of AnalyticsConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/s3/analyticsConfiguration", "AnalyticsConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/analyticsConfiguration.AnalyticsConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait AnalyticsConfigurationArgs extends StObject {
    
    /**
      * The name of the bucket this analytics configuration is associated with.
      */
    val bucket: Input[String] = js.native
    
    /**
      * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter]] = js.native
    
    /**
      * Unique identifier of the analytics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration for the analytics data export (documented below).
      */
    val storageClassAnalysis: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis]
      ] = js.native
  }
  object AnalyticsConfigurationArgs {
    
    @scala.inline
    def apply(bucket: Input[String]): AnalyticsConfigurationArgs = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsConfigurationArgs]
    }
    
    @scala.inline
    implicit class AnalyticsConfigurationArgsMutableBuilder[Self <: AnalyticsConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStorageClassAnalysis(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis]): Self = StObject.set(x, "storageClassAnalysis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassAnalysisUndefined: Self = StObject.set(x, "storageClassAnalysis", js.undefined)
    }
  }
  
  @js.native
  trait AnalyticsConfigurationState extends StObject {
    
    /**
      * The name of the bucket this analytics configuration is associated with.
      */
    val bucket: js.UndefOr[Input[String]] = js.native
    
    /**
      * Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
      */
    val filter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter]] = js.native
    
    /**
      * Unique identifier of the analytics configuration for the bucket.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration for the analytics data export (documented below).
      */
    val storageClassAnalysis: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis]
      ] = js.native
  }
  object AnalyticsConfigurationState {
    
    @scala.inline
    def apply(): AnalyticsConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsConfigurationState]
    }
    
    @scala.inline
    implicit class AnalyticsConfigurationStateMutableBuilder[Self <: AnalyticsConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
      
      @scala.inline
      def setFilter(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStorageClassAnalysis(value: Input[typingsSlinky.pulumiAws.inputMod.s3.AnalyticsConfigurationStorageClassAnalysis]): Self = StObject.set(x, "storageClassAnalysis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassAnalysisUndefined: Self = StObject.set(x, "storageClassAnalysis", js.undefined)
    }
  }
}
