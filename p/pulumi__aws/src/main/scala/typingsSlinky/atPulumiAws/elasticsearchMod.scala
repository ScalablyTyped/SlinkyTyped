package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.elasticsearchDomainMod.DomainArgs
import typingsSlinky.atPulumiAws.elasticsearchDomainMod.DomainState
import typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicyArgs
import typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicyState
import typingsSlinky.atPulumiAws.elasticsearchGetDomainMod.GetDomainArgs
import typingsSlinky.atPulumiAws.elasticsearchGetDomainMod.GetDomainResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch", JSImport.Namespace)
@js.native
object elasticsearchMod extends js.Object {
  @js.native
  class Domain protected ()
    extends typingsSlinky.atPulumiAws.elasticsearchDomainMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainPolicy protected ()
    extends typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy {
    /**
      * Create a DomainPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPolicyArgs) = this()
    def this(name: String, args: DomainPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] with GetDomainResult = js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] with GetDomainResult = js.native
  /* static members */
  @js.native
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsSlinky.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticsearchDomainMod.Domain = js.native
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainPolicy extends js.Object {
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState): typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.elasticsearchDomainPolicyMod.DomainPolicy = js.native
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
  }
  
}

