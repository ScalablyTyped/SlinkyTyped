package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.lightsailDomainMod.DomainArgs
import typingsSlinky.atPulumiAws.lightsailDomainMod.DomainState
import typingsSlinky.atPulumiAws.lightsailInstanceMod.InstanceArgs
import typingsSlinky.atPulumiAws.lightsailInstanceMod.InstanceState
import typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPairArgs
import typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPairState
import typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachmentArgs
import typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachmentState
import typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIpArgs
import typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIpState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail", JSImport.Namespace)
@js.native
object lightsailMod extends js.Object {
  @js.native
  class Domain protected ()
    extends typingsSlinky.atPulumiAws.lightsailDomainMod.Domain {
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
  
  @js.native
  class Instance protected ()
    extends typingsSlinky.atPulumiAws.lightsailInstanceMod.Instance {
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
  
  @js.native
  class KeyPair protected ()
    extends typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPair {
    /**
      * Create a KeyPair resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyPairArgs) = this()
    def this(name: String, args: KeyPairArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIp protected ()
    extends typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIp {
    /**
      * Create a StaticIp resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StaticIpArgs) = this()
    def this(name: String, args: StaticIpArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class StaticIpAttachment protected ()
    extends typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment {
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
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsSlinky.atPulumiAws.lightsailDomainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.lightsailDomainMod.Domain = js.native
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/domain.Domain */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState): typingsSlinky.atPulumiAws.lightsailInstanceMod.Instance = js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.lightsailInstanceMod.Instance = js.native
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState): typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPair = js.native
    def get(name: String, id: Input[ID], state: KeyPairState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.lightsailKeyPairMod.KeyPair = js.native
    /**
      * Returns true if the given object is an instance of KeyPair.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/keyPair.KeyPair */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState): typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIp = js.native
    def get(name: String, id: Input[ID], state: StaticIpState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.lightsailStaticIpMod.StaticIp = js.native
    /**
      * Returns true if the given object is an instance of StaticIp.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIp.StaticIp */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState): typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
    def get(name: String, id: Input[ID], state: StaticIpAttachmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.lightsailStaticIpAttachmentMod.StaticIpAttachment = js.native
    /**
      * Returns true if the given object is an instance of StaticIpAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/staticIpAttachment.StaticIpAttachment */ Boolean = js.native
  }
  
}

