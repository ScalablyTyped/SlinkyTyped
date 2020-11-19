package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.lightsailDomainMod.DomainArgs
import typingsSlinky.pulumiAws.lightsailDomainMod.DomainState
import typingsSlinky.pulumiAws.lightsailInstanceMod.InstanceArgs
import typingsSlinky.pulumiAws.lightsailInstanceMod.InstanceState
import typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPairArgs
import typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPairState
import typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentArgs
import typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachmentState
import typingsSlinky.pulumiAws.staticIpMod.StaticIpArgs
import typingsSlinky.pulumiAws.staticIpMod.StaticIpState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "lightsail")
@js.native
object lightsail extends js.Object {
  
  @js.native
  class Domain protected ()
    extends typingsSlinky.pulumiAws.lightsailMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsSlinky.pulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailDomainMod.Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = js.native
  }
  
  @js.native
  class Instance protected ()
    extends typingsSlinky.pulumiAws.lightsailMod.Instance {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Instance extends js.Object {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState): typingsSlinky.pulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailInstanceMod.Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
  }
  
  @js.native
  class KeyPair protected ()
    extends typingsSlinky.pulumiAws.lightsailMod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyPairArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object KeyPair extends js.Object {
    
    /**
      * Get an existing KeyPair resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState): typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.lightsailKeyPairMod.KeyPair = js.native
    
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ Boolean = js.native
  }
  
  @js.native
  class StaticIp protected ()
    extends typingsSlinky.pulumiAws.lightsailMod.StaticIp {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StaticIpArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object StaticIp extends js.Object {
    
    /**
      * Get an existing StaticIp resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.staticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState): typingsSlinky.pulumiAws.staticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticIpMod.StaticIp = js.native
    
    /**
      * Returns true if the given object is an instance of StaticIp.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
  }
  
  @js.native
  class StaticIpAttachment protected ()
    extends typingsSlinky.pulumiAws.lightsailMod.StaticIpAttachment {
    /**
      * Create a StaticIpAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StaticIpAttachmentArgs) = this()
    def this(name: String, args: StaticIpAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object StaticIpAttachment extends js.Object {
    
    /**
      * Get an existing StaticIpAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState): typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.staticIpAttachmentMod.StaticIpAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
  }
}
