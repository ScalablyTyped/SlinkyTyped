package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getServiceQuotaMod.GetServiceQuotaArgs
import typingsSlinky.pulumiAws.getServiceQuotaMod.GetServiceQuotaResult
import typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuotaArgs
import typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuotaState
import typingsSlinky.pulumiAws.servicequotasGetServiceMod.GetServiceArgs
import typingsSlinky.pulumiAws.servicequotasGetServiceMod.GetServiceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicequotasMod {
  
  @JSImport("@pulumi/aws/servicequotas", "ServiceQuota")
  @js.native
  class ServiceQuota protected ()
    extends typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuota {
    /**
      * Create a ServiceQuota resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceQuotaArgs) = this()
    def this(name: String, args: ServiceQuotaArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ServiceQuota {
    
    /**
      * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceQuotaState): typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    
    /**
      * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/servicequotas", "ServiceQuota.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/servicequotas", "getService")
  @js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = js.native
  @JSImport("@pulumi/aws/servicequotas", "getService")
  @js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = js.native
  
  @JSImport("@pulumi/aws/servicequotas", "getServiceQuota")
  @js.native
  def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] = js.native
  @JSImport("@pulumi/aws/servicequotas", "getServiceQuota")
  @js.native
  def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] = js.native
}
