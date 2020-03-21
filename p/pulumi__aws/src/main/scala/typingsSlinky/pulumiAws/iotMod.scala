package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getEndpointMod.GetEndpointArgs
import typingsSlinky.pulumiAws.getEndpointMod.GetEndpointResult
import typingsSlinky.pulumiAws.iotCertificateMod.CertificateArgs
import typingsSlinky.pulumiAws.iotCertificateMod.CertificateState
import typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachmentArgs
import typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachmentState
import typingsSlinky.pulumiAws.iotPolicyMod.PolicyArgs
import typingsSlinky.pulumiAws.iotPolicyMod.PolicyState
import typingsSlinky.pulumiAws.roleAliasMod.RoleAliasArgs
import typingsSlinky.pulumiAws.roleAliasMod.RoleAliasState
import typingsSlinky.pulumiAws.thingMod.ThingArgs
import typingsSlinky.pulumiAws.thingMod.ThingState
import typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachmentArgs
import typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachmentState
import typingsSlinky.pulumiAws.thingTypeMod.ThingTypeArgs
import typingsSlinky.pulumiAws.thingTypeMod.ThingTypeState
import typingsSlinky.pulumiAws.topicRuleMod.TopicRuleArgs
import typingsSlinky.pulumiAws.topicRuleMod.TopicRuleState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot", JSImport.Namespace)
@js.native
object iotMod extends js.Object {
  @js.native
  class Certificate protected ()
    extends typingsSlinky.pulumiAws.iotCertificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Policy protected ()
    extends typingsSlinky.pulumiAws.iotPolicyMod.Policy {
    /**
      * Create a Policy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyArgs) = this()
    def this(name: String, args: PolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class PolicyAttachment protected ()
    extends typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment {
    /**
      * Create a PolicyAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PolicyAttachmentArgs) = this()
    def this(name: String, args: PolicyAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RoleAlias protected ()
    extends typingsSlinky.pulumiAws.roleAliasMod.RoleAlias {
    /**
      * Create a RoleAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RoleAliasArgs) = this()
    def this(name: String, args: RoleAliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Thing protected ()
    extends typingsSlinky.pulumiAws.thingMod.Thing {
    /**
      * Create a Thing resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingArgs) = this()
    def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ThingPrincipalAttachment protected ()
    extends typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment {
    /**
      * Create a ThingPrincipalAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ThingPrincipalAttachmentArgs) = this()
    def this(name: String, args: ThingPrincipalAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ThingType protected ()
    extends typingsSlinky.pulumiAws.thingTypeMod.ThingType {
    /**
      * Create a ThingType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ThingTypeArgs) = this()
    def this(name: String, args: ThingTypeArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicRule protected ()
    extends typingsSlinky.pulumiAws.topicRuleMod.TopicRule {
    /**
      * Create a TopicRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicRuleArgs) = this()
    def this(name: String, args: TopicRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  def getEndpoint(): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  def getEndpoint(args: GetEndpointArgs, opts: InvokeOptions): js.Promise[GetEndpointResult] with GetEndpointResult = js.native
  /* static members */
  @js.native
  object Certificate extends js.Object {
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsSlinky.pulumiAws.iotCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.iotCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Policy extends js.Object {
    /**
      * Get an existing Policy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState): typingsSlinky.pulumiAws.iotPolicyMod.Policy = js.native
    def get(name: String, id: Input[ID], state: PolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.iotPolicyMod.Policy = js.native
    /**
      * Returns true if the given object is an instance of Policy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policy.Policy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PolicyAttachment extends js.Object {
    /**
      * Get an existing PolicyAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState): typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    def get(name: String, id: Input[ID], state: PolicyAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.iotPolicyAttachmentMod.PolicyAttachment = js.native
    /**
      * Returns true if the given object is an instance of PolicyAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/policyAttachment.PolicyAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleAlias extends js.Object {
    /**
      * Get an existing RoleAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.roleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState): typingsSlinky.pulumiAws.roleAliasMod.RoleAlias = js.native
    def get(name: String, id: Input[ID], state: RoleAliasState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.roleAliasMod.RoleAlias = js.native
    /**
      * Returns true if the given object is an instance of RoleAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/roleAlias.RoleAlias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Thing extends js.Object {
    /**
      * Get an existing Thing resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.thingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState): typingsSlinky.pulumiAws.thingMod.Thing = js.native
    def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.thingMod.Thing = js.native
    /**
      * Returns true if the given object is an instance of Thing.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThingPrincipalAttachment extends js.Object {
    /**
      * Get an existing ThingPrincipalAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState): typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    def get(name: String, id: Input[ID], state: ThingPrincipalAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.thingPrincipalAttachmentMod.ThingPrincipalAttachment = js.native
    /**
      * Returns true if the given object is an instance of ThingPrincipalAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingPrincipalAttachment.ThingPrincipalAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ThingType extends js.Object {
    /**
      * Get an existing ThingType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.thingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState): typingsSlinky.pulumiAws.thingTypeMod.ThingType = js.native
    def get(name: String, id: Input[ID], state: ThingTypeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.thingTypeMod.ThingType = js.native
    /**
      * Returns true if the given object is an instance of ThingType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thingType.ThingType */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TopicRule extends js.Object {
    /**
      * Get an existing TopicRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.topicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState): typingsSlinky.pulumiAws.topicRuleMod.TopicRule = js.native
    def get(name: String, id: Input[ID], state: TopicRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.topicRuleMod.TopicRule = js.native
    /**
      * Returns true if the given object is an instance of TopicRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/topicRule.TopicRule */ Boolean = js.native
  }
  
}

