package typingsSlinky.pulumiAws.reportDefinitionMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
@js.native
class ReportDefinition protected () extends CustomResource {
  /**
    * Create a ReportDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReportDefinitionArgs) = this()
  def this(name: String, args: ReportDefinitionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A list of additional artifacts. Valid values are: REDSHIFT, QUICKSIGHT.
    */
  val additionalArtifacts: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * A list of schema elements. Valid values are: RESOURCES.
    */
  val additionalSchemaElements: Output_[js.Array[String]] = js.native
  
  /**
    * Compression format for report. Valid values are: GZIP, ZIP.
    */
  val compression: Output_[String] = js.native
  
  /**
    * Format for report. Valid values are: textORcsv.
    */
  val format: Output_[String] = js.native
  
  /**
    * Unique name for the report. Must start with a number/letter and is case sensitive. Limited to 256 characters.
    */
  val reportName: Output_[String] = js.native
  
  /**
    * Name of the existing S3 bucket to hold generated reports.
    */
  val s3Bucket: Output_[String] = js.native
  
  /**
    * Report path prefix. Limited to 256 characters.
    */
  val s3Prefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Region of the existing S3 bucket to hold generated reports.
    */
  val s3Region: Output_[String] = js.native
  
  /**
    * The frequency on which report data are measured and displayed.  Valid values are: HOURLY, DAILY.
    */
  val timeUnit: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cur/reportDefinition", "ReportDefinition")
@js.native
object ReportDefinition extends js.Object {
  
  /**
    * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ReportDefinition = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReportDefinition = js.native
  def get(name: String, id: Input[ID], state: ReportDefinitionState): ReportDefinition = js.native
  def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): ReportDefinition = js.native
  
  /**
    * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = js.native
}
