package typingsSlinky.pulumiAws.mod.apigateway

import typingsSlinky.pulumiAws.basePathMappingMod.BasePathMappingArgs
import typingsSlinky.pulumiAws.basePathMappingMod.BasePathMappingState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigateway.BasePathMapping")
@js.native
class BasePathMapping protected ()
  extends typingsSlinky.pulumiAws.apigatewayMod.BasePathMapping {
  /**
    * Create a BasePathMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BasePathMappingArgs) = this()
  def this(name: String, args: BasePathMappingArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object BasePathMapping {
  
  /**
    * Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "apigateway.BasePathMapping.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.basePathMappingMod.BasePathMapping = js.native
  @JSImport("@pulumi/aws", "apigateway.BasePathMapping.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.basePathMappingMod.BasePathMapping = js.native
  @JSImport("@pulumi/aws", "apigateway.BasePathMapping.get")
  @js.native
  def get(name: String, id: Input[ID], state: BasePathMappingState): typingsSlinky.pulumiAws.basePathMappingMod.BasePathMapping = js.native
  @JSImport("@pulumi/aws", "apigateway.BasePathMapping.get")
  @js.native
  def get(name: String, id: Input[ID], state: BasePathMappingState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.basePathMappingMod.BasePathMapping = js.native
  
  /**
    * Returns true if the given object is an instance of BasePathMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "apigateway.BasePathMapping.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/basePathMapping.BasePathMapping */ Boolean = js.native
}
