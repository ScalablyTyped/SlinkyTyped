package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSetArgs
import typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSetState
import typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSetArgs
import typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSetState
import typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSetArgs
import typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSetState
import typingsSlinky.pulumiAws.domainDkimMod.DomainDkimArgs
import typingsSlinky.pulumiAws.domainDkimMod.DomainDkimState
import typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentityArgs
import typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentityState
import typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationArgs
import typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerificationState
import typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentityArgs
import typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentityState
import typingsSlinky.pulumiAws.eventDestinationMod.EventDestinationArgs
import typingsSlinky.pulumiAws.eventDestinationMod.EventDestinationState
import typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopicArgs
import typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopicState
import typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicyArgs
import typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicyState
import typingsSlinky.pulumiAws.mailFromMod.MailFromArgs
import typingsSlinky.pulumiAws.mailFromMod.MailFromState
import typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilterArgs
import typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilterState
import typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRuleArgs
import typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRuleState
import typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSetArgs
import typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSetState
import typingsSlinky.pulumiAws.templateMod.TemplateArgs
import typingsSlinky.pulumiAws.templateMod.TemplateState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ses {
  
  @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet")
  @js.native
  class ActiveReceiptRuleSet protected ()
    extends typingsSlinky.pulumiAws.sesMod.ActiveReceiptRuleSet {
    /**
      * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActiveReceiptRuleSetArgs) = this()
    def this(name: String, args: ActiveReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ActiveReceiptRuleSet {
    
    /**
      * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.activeReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ActiveReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.ConfgurationSet")
  @js.native
  class ConfgurationSet protected ()
    extends typingsSlinky.pulumiAws.sesMod.ConfgurationSet {
    /**
      * Create a ConfgurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.ses.ConfgurationSet has been deprecated in favor of aws.ses.ConfigurationSet */
    def this(name: String) = this()
    def this(name: String, args: ConfgurationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfgurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfgurationSet {
    
    /**
      * Get an existing ConfgurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState): typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfgurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfgurationSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.confgurationSetMod.ConfgurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfgurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ConfgurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/confgurationSet.ConfgurationSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.ConfigurationSet")
  @js.native
  class ConfigurationSet protected ()
    extends typingsSlinky.pulumiAws.sesMod.ConfigurationSet {
    /**
      * Create a ConfigurationSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfigurationSet {
    
    /**
      * Get an existing ConfigurationSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState): typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    @JSImport("@pulumi/aws", "ses.ConfigurationSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConfigurationSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.configurationSetMod.ConfigurationSet = js.native
    
    /**
      * Returns true if the given object is an instance of ConfigurationSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ConfigurationSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/configurationSet.ConfigurationSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.DomainDkim")
  @js.native
  class DomainDkim protected ()
    extends typingsSlinky.pulumiAws.sesMod.DomainDkim {
    /**
      * Create a DomainDkim resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainDkimArgs) = this()
    def this(name: String, args: DomainDkimArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainDkim {
    
    /**
      * Get an existing DomainDkim resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws", "ses.DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws", "ses.DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainDkimState): typingsSlinky.pulumiAws.domainDkimMod.DomainDkim = js.native
    @JSImport("@pulumi/aws", "ses.DomainDkim.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainDkimState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainDkimMod.DomainDkim = js.native
    
    /**
      * Returns true if the given object is an instance of DomainDkim.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.DomainDkim.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainDkim.DomainDkim */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.DomainIdentity")
  @js.native
  class DomainIdentity protected ()
    extends typingsSlinky.pulumiAws.sesMod.DomainIdentity {
    /**
      * Create a DomainIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityArgs) = this()
    def this(name: String, args: DomainIdentityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainIdentity {
    
    /**
      * Get an existing DomainIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState): typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainIdentityMod.DomainIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of DomainIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.DomainIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentity.DomainIdentity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.DomainIdentityVerification")
  @js.native
  class DomainIdentityVerification protected ()
    extends typingsSlinky.pulumiAws.sesMod.DomainIdentityVerification {
    /**
      * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityVerificationArgs) = this()
    def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DomainIdentityVerification {
    
    /**
      * Get an existing DomainIdentityVerification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.domainIdentityVerificationMod.DomainIdentityVerification = js.native
    
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.DomainIdentityVerification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.EmailIdentity")
  @js.native
  class EmailIdentity protected ()
    extends typingsSlinky.pulumiAws.sesMod.EmailIdentity {
    /**
      * Create a EmailIdentity resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EmailIdentityArgs) = this()
    def this(name: String, args: EmailIdentityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EmailIdentity {
    
    /**
      * Get an existing EmailIdentity resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws", "ses.EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws", "ses.EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    @JSImport("@pulumi/aws", "ses.EmailIdentity.get")
    @js.native
    def get(name: String, id: Input[ID], state: EmailIdentityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.emailIdentityMod.EmailIdentity = js.native
    
    /**
      * Returns true if the given object is an instance of EmailIdentity.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.EmailIdentity.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/emailIdentity.EmailIdentity */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.EventDestination")
  @js.native
  class EventDestination protected ()
    extends typingsSlinky.pulumiAws.sesMod.EventDestination {
    /**
      * Create a EventDestination resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EventDestinationArgs) = this()
    def this(name: String, args: EventDestinationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object EventDestination {
    
    /**
      * Get an existing EventDestination resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws", "ses.EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws", "ses.EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventDestinationState): typingsSlinky.pulumiAws.eventDestinationMod.EventDestination = js.native
    @JSImport("@pulumi/aws", "ses.EventDestination.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventDestinationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.eventDestinationMod.EventDestination = js.native
    
    /**
      * Returns true if the given object is an instance of EventDestination.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.EventDestination.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/eventDestination.EventDestination */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic")
  @js.native
  class IdentityNotificationTopic protected ()
    extends typingsSlinky.pulumiAws.sesMod.IdentityNotificationTopic {
    /**
      * Create a IdentityNotificationTopic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityNotificationTopicArgs) = this()
    def this(name: String, args: IdentityNotificationTopicArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IdentityNotificationTopic {
    
    /**
      * Get an existing IdentityNotificationTopic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState): typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityNotificationTopicState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityNotificationTopicMod.IdentityNotificationTopic = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityNotificationTopic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.IdentityNotificationTopic.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityNotificationTopic.IdentityNotificationTopic */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.IdentityPolicy")
  @js.native
  class IdentityPolicy protected ()
    extends typingsSlinky.pulumiAws.sesMod.IdentityPolicy {
    /**
      * Create a IdentityPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPolicyArgs) = this()
    def this(name: String, args: IdentityPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IdentityPolicy {
    
    /**
      * Get an existing IdentityPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws", "ses.IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws", "ses.IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState): typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    @JSImport("@pulumi/aws", "ses.IdentityPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPolicyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.identityPolicyMod.IdentityPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.IdentityPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/identityPolicy.IdentityPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.MailFrom")
  @js.native
  class MailFrom protected ()
    extends typingsSlinky.pulumiAws.sesMod.MailFrom {
    /**
      * Create a MailFrom resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MailFromArgs) = this()
    def this(name: String, args: MailFromArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MailFrom {
    
    /**
      * Get an existing MailFrom resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws", "ses.MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws", "ses.MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState): typingsSlinky.pulumiAws.mailFromMod.MailFrom = js.native
    @JSImport("@pulumi/aws", "ses.MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.mailFromMod.MailFrom = js.native
    
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.MailFrom.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptFilter")
  @js.native
  class ReceiptFilter protected ()
    extends typingsSlinky.pulumiAws.sesMod.ReceiptFilter {
    /**
      * Create a ReceiptFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptFilterArgs) = this()
    def this(name: String, args: ReceiptFilterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReceiptFilter {
    
    /**
      * Get an existing ReceiptFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState): typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptFilter.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptFilterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptFilterMod.ReceiptFilter = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptFilter.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptFilter.ReceiptFilter */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptRule")
  @js.native
  class ReceiptRule protected ()
    extends typingsSlinky.pulumiAws.sesMod.ReceiptRule {
    /**
      * Create a ReceiptRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleArgs) = this()
    def this(name: String, args: ReceiptRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReceiptRule {
    
    /**
      * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState): typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptRuleMod.ReceiptRule = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.ReceiptRuleSet")
  @js.native
  class ReceiptRuleSet protected ()
    extends typingsSlinky.pulumiAws.sesMod.ReceiptRuleSet {
    /**
      * Create a ReceiptRuleSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReceiptRuleSetArgs) = this()
    def this(name: String, args: ReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReceiptRuleSet {
    
    /**
      * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState): typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
    
    /**
      * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.ReceiptRuleSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "ses.Template")
  @js.native
  class Template protected ()
    extends typingsSlinky.pulumiAws.sesMod.Template {
    /**
      * Create a Template resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TemplateArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TemplateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Template {
    
    /**
      * Get an existing Template resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "ses.Template.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws", "ses.Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws", "ses.Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: TemplateState): typingsSlinky.pulumiAws.templateMod.Template = js.native
    @JSImport("@pulumi/aws", "ses.Template.get")
    @js.native
    def get(name: String, id: Input[ID], state: TemplateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.templateMod.Template = js.native
    
    /**
      * Returns true if the given object is an instance of Template.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "ses.Template.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/template.Template */ Boolean = js.native
  }
}
