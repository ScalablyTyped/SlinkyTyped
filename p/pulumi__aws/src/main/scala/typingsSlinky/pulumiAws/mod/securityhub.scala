package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.actionTargetMod.ActionTargetArgs
import typingsSlinky.pulumiAws.actionTargetMod.ActionTargetState
import typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscriptionArgs
import typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscriptionState
import typingsSlinky.pulumiAws.securityhubAccountMod.AccountArgs
import typingsSlinky.pulumiAws.securityhubAccountMod.AccountState
import typingsSlinky.pulumiAws.securityhubMemberMod.MemberArgs
import typingsSlinky.pulumiAws.securityhubMemberMod.MemberState
import typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscriptionArgs
import typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscriptionState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityhub {
  
  @JSImport("@pulumi/aws", "securityhub.Account")
  @js.native
  class Account protected ()
    extends typingsSlinky.pulumiAws.securityhubMod.Account {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Account {
    
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "securityhub.Account.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.securityhubAccountMod.Account = js.native
    @JSImport("@pulumi/aws", "securityhub.Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityhubAccountMod.Account = js.native
    @JSImport("@pulumi/aws", "securityhub.Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState): typingsSlinky.pulumiAws.securityhubAccountMod.Account = js.native
    @JSImport("@pulumi/aws", "securityhub.Account.get")
    @js.native
    def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityhubAccountMod.Account = js.native
    
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "securityhub.Account.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/account.Account */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "securityhub.ActionTarget")
  @js.native
  class ActionTarget protected ()
    extends typingsSlinky.pulumiAws.securityhubMod.ActionTarget {
    /**
      * Create a ActionTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ActionTargetArgs) = this()
    def this(name: String, args: ActionTargetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ActionTarget {
    
    /**
      * Get an existing ActionTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "securityhub.ActionTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.actionTargetMod.ActionTarget = js.native
    @JSImport("@pulumi/aws", "securityhub.ActionTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.actionTargetMod.ActionTarget = js.native
    @JSImport("@pulumi/aws", "securityhub.ActionTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActionTargetState): typingsSlinky.pulumiAws.actionTargetMod.ActionTarget = js.native
    @JSImport("@pulumi/aws", "securityhub.ActionTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: ActionTargetState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.actionTargetMod.ActionTarget = js.native
    
    /**
      * Returns true if the given object is an instance of ActionTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "securityhub.ActionTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/actionTarget.ActionTarget */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "securityhub.Member")
  @js.native
  class Member protected ()
    extends typingsSlinky.pulumiAws.securityhubMod.Member {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberArgs) = this()
    def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Member {
    
    /**
      * Get an existing Member resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "securityhub.Member.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.securityhubMemberMod.Member = js.native
    @JSImport("@pulumi/aws", "securityhub.Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityhubMemberMod.Member = js.native
    @JSImport("@pulumi/aws", "securityhub.Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState): typingsSlinky.pulumiAws.securityhubMemberMod.Member = js.native
    @JSImport("@pulumi/aws", "securityhub.Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.securityhubMemberMod.Member = js.native
    
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "securityhub.Member.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/member.Member */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "securityhub.ProductSubscription")
  @js.native
  class ProductSubscription protected ()
    extends typingsSlinky.pulumiAws.securityhubMod.ProductSubscription {
    /**
      * Create a ProductSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProductSubscriptionArgs) = this()
    def this(name: String, args: ProductSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ProductSubscription {
    
    /**
      * Get an existing ProductSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "securityhub.ProductSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.ProductSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.ProductSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState): typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.ProductSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProductSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.productSubscriptionMod.ProductSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of ProductSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "securityhub.ProductSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/productSubscription.ProductSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "securityhub.StandardsSubscription")
  @js.native
  class StandardsSubscription protected ()
    extends typingsSlinky.pulumiAws.securityhubMod.StandardsSubscription {
    /**
      * Create a StandardsSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StandardsSubscriptionArgs) = this()
    def this(name: String, args: StandardsSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StandardsSubscription {
    
    /**
      * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "securityhub.StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState): typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    @JSImport("@pulumi/aws", "securityhub.StandardsSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: StandardsSubscriptionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.standardsSubscriptionMod.StandardsSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of StandardsSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "securityhub.StandardsSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/standardsSubscription.StandardsSubscription */ Boolean = js.native
  }
}
