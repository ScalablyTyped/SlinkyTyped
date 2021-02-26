package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getServiceAccountMod.GetServiceAccountArgs
import typingsSlinky.pulumiAws.getServiceAccountMod.GetServiceAccountResult
import typingsSlinky.pulumiAws.trailMod.TrailArgs
import typingsSlinky.pulumiAws.trailMod.TrailState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtrailMod {
  
  @JSImport("@pulumi/aws/cloudtrail", "Trail")
  @js.native
  class Trail protected ()
    extends typingsSlinky.pulumiAws.trailMod.Trail {
    /**
      * Create a Trail resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TrailArgs) = this()
    def this(name: String, args: TrailArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Trail {
    
    /**
      * Get an existing Trail resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudtrail", "Trail.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.trailMod.Trail = js.native
    @JSImport("@pulumi/aws/cloudtrail", "Trail.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.trailMod.Trail = js.native
    @JSImport("@pulumi/aws/cloudtrail", "Trail.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrailState): typingsSlinky.pulumiAws.trailMod.Trail = js.native
    @JSImport("@pulumi/aws/cloudtrail", "Trail.get")
    @js.native
    def get(name: String, id: Input[ID], state: TrailState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.trailMod.Trail = js.native
    
    /**
      * Returns true if the given object is an instance of Trail.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudtrail", "Trail.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/cloudtrail", "getServiceAccount")
  @js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/cloudtrail", "getServiceAccount")
  @js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/cloudtrail", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/cloudtrail", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
}
