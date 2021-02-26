package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.cloudwatch.LogMetricFilterMetricTransformation
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMetricFilterMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
  @js.native
  class LogMetricFilter protected () extends CustomResource {
    /**
      * Create a LogMetricFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogMetricFilterArgs) = this()
    def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: Output_[String] = js.native
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: Output_[LogMetricFilterMetricTransformation] = js.native
    
    /**
      * A name for the metric filter.
      */
    val name: Output_[String] = js.native
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: Output_[String] = js.native
  }
  /* static members */
  object LogMetricFilter {
    
    /**
      * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState): LogMetricFilter = js.native
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): LogMetricFilter = js.native
    
    /**
      * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = js.native
  }
  
  @js.native
  trait LogMetricFilterArgs extends StObject {
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: Input[String] = js.native
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation] = js.native
    
    /**
      * A name for the metric filter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: Input[String] = js.native
  }
  object LogMetricFilterArgs {
    
    @scala.inline
    def apply(
      logGroupName: Input[String],
      metricTransformation: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation],
      pattern: Input[String]
    ): LogMetricFilterArgs = {
      val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], metricTransformation = metricTransformation.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMetricFilterArgs]
    }
    
    @scala.inline
    implicit class LogMetricFilterArgsMutableBuilder[Self <: LogMetricFilterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricTransformation(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]): Self = StObject.set(x, "metricTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: Input[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogMetricFilterState extends StObject {
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]
      ] = js.native
    
    /**
      * A name for the metric filter.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: js.UndefOr[Input[String]] = js.native
  }
  object LogMetricFilterState {
    
    @scala.inline
    def apply(): LogMetricFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogMetricFilterState]
    }
    
    @scala.inline
    implicit class LogMetricFilterStateMutableBuilder[Self <: LogMetricFilterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setMetricTransformation(value: Input[typingsSlinky.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]): Self = StObject.set(x, "metricTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricTransformationUndefined: Self = StObject.set(x, "metricTransformation", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: Input[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
