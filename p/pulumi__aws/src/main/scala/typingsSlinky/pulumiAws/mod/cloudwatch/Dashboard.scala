package typingsSlinky.pulumiAws.mod.cloudwatch

import typingsSlinky.pulumiAws.dashboardMod.DashboardArgs
import typingsSlinky.pulumiAws.dashboardMod.DashboardState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "cloudwatch.Dashboard")
@js.native
class Dashboard protected ()
  extends typingsSlinky.pulumiAws.cloudwatchMod.Dashboard {
  /**
    * Create a Dashboard resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DashboardArgs) = this()
  def this(name: String, args: DashboardArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "cloudwatch.Dashboard")
@js.native
object Dashboard extends js.Object {
  
  /**
    * Get an existing Dashboard resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
  def get(name: String, id: Input[ID], state: DashboardState): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
  def get(name: String, id: Input[ID], state: DashboardState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.dashboardMod.Dashboard = js.native
  
  /**
    * Returns true if the given object is an instance of Dashboard.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/dashboard.Dashboard */ Boolean = js.native
}
