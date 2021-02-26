package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicyArgs
import typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicyState
import typingsSlinky.pulumiAws.elasticsearchDomainMod.DomainArgs
import typingsSlinky.pulumiAws.elasticsearchDomainMod.DomainState
import typingsSlinky.pulumiAws.getDomainMod.GetDomainArgs
import typingsSlinky.pulumiAws.getDomainMod.GetDomainResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticsearch {
  
  @JSImport("@pulumi/aws", "elasticsearch.Domain")
  @js.native
  class Domain protected ()
    extends typingsSlinky.pulumiAws.elasticsearchMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticsearch.Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.elasticsearchDomainMod.Domain = js.native
    @JSImport("@pulumi/aws", "elasticsearch.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticsearchDomainMod.Domain = js.native
    @JSImport("@pulumi/aws", "elasticsearch.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsSlinky.pulumiAws.elasticsearchDomainMod.Domain = js.native
    @JSImport("@pulumi/aws", "elasticsearch.Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.elasticsearchDomainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticsearch.Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy")
  @js.native
  class DomainPolicy protected ()
    extends typingsSlinky.pulumiAws.elasticsearchMod.DomainPolicy {
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
  /* static members */
  object DomainPolicy {
    
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState): typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "elasticsearch.DomainPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "elasticsearch.getDomain")
  @js.native
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] = js.native
  @JSImport("@pulumi/aws", "elasticsearch.getDomain")
  @js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] = js.native
}
