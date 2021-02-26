package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfigArgs
import typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfigState
import typingsSlinky.pulumiAws.samplingRuleMod.SamplingRuleArgs
import typingsSlinky.pulumiAws.samplingRuleMod.SamplingRuleState
import typingsSlinky.pulumiAws.xrayGroupMod.GroupArgs
import typingsSlinky.pulumiAws.xrayGroupMod.GroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xray {
  
  @JSImport("@pulumi/aws", "xray.EncryptionConfig")
  @js.native
  class EncryptionConfig protected ()
    extends typingsSlinky.pulumiAws.xrayMod.EncryptionConfig {
    /**
      * Create a EncryptionConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EncryptionConfigArgs) = this()
    def this(name: String, args: EncryptionConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EncryptionConfig {
    
    /**
      * Get an existing EncryptionConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "xray.EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfig = js.native
    @JSImport("@pulumi/aws", "xray.EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfig = js.native
    @JSImport("@pulumi/aws", "xray.EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionConfigState): typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfig = js.native
    @JSImport("@pulumi/aws", "xray.EncryptionConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: EncryptionConfigState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.encryptionConfigMod.EncryptionConfig = js.native
    
    /**
      * Returns true if the given object is an instance of EncryptionConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "xray.EncryptionConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/encryptionConfig.EncryptionConfig */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "xray.Group")
  @js.native
  class Group protected ()
    extends typingsSlinky.pulumiAws.xrayMod.Group {
    /**
      * Create a Group resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GroupArgs) = this()
    def this(name: String, args: GroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Group {
    
    /**
      * Get an existing Group resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "xray.Group.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.xrayGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "xray.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.xrayGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "xray.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState): typingsSlinky.pulumiAws.xrayGroupMod.Group = js.native
    @JSImport("@pulumi/aws", "xray.Group.get")
    @js.native
    def get(name: String, id: Input[ID], state: GroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.xrayGroupMod.Group = js.native
    
    /**
      * Returns true if the given object is an instance of Group.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "xray.Group.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/group.Group */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "xray.SamplingRule")
  @js.native
  class SamplingRule protected ()
    extends typingsSlinky.pulumiAws.xrayMod.SamplingRule {
    /**
      * Create a SamplingRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SamplingRuleArgs) = this()
    def this(name: String, args: SamplingRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SamplingRule {
    
    /**
      * Get an existing SamplingRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "xray.SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.samplingRuleMod.SamplingRule = js.native
    @JSImport("@pulumi/aws", "xray.SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.samplingRuleMod.SamplingRule = js.native
    @JSImport("@pulumi/aws", "xray.SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState): typingsSlinky.pulumiAws.samplingRuleMod.SamplingRule = js.native
    @JSImport("@pulumi/aws", "xray.SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.samplingRuleMod.SamplingRule = js.native
    
    /**
      * Returns true if the given object is an instance of SamplingRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "xray.SamplingRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean = js.native
  }
}
