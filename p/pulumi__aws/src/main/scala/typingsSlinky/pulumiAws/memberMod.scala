package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberMod {
  
  @JSImport("@pulumi/aws/guardduty/member", "Member")
  @js.native
  class Member protected () extends CustomResource {
    /**
      * Create a Member resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MemberArgs) = this()
    def this(name: String, args: MemberArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AWS account ID for member account.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * The detector ID of the GuardDuty account where you want to create member accounts.
      */
    val detectorId: Output_[String] = js.native
    
    /**
      * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
      */
    val disableEmailNotification: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Email address for member account.
      */
    val email: Output_[String] = js.native
    
    /**
      * Message for invitation.
      */
    val invitationMessage: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
      */
    val invite: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
      */
    val relationshipStatus: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/guardduty/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID]): Member = js.native
    @JSImport("@pulumi/aws/guardduty/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Member = js.native
    @JSImport("@pulumi/aws/guardduty/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState): Member = js.native
    @JSImport("@pulumi/aws/guardduty/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): Member = js.native
    
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/guardduty/member", "Member.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/member.Member */ Boolean = js.native
  }
  
  @js.native
  trait MemberArgs extends StObject {
    
    /**
      * AWS account ID for member account.
      */
    val accountId: Input[String] = js.native
    
    /**
      * The detector ID of the GuardDuty account where you want to create member accounts.
      */
    val detectorId: Input[String] = js.native
    
    /**
      * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
      */
    val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Email address for member account.
      */
    val email: Input[String] = js.native
    
    /**
      * Message for invitation.
      */
    val invitationMessage: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
      */
    val invite: js.UndefOr[Input[Boolean]] = js.native
  }
  object MemberArgs {
    
    @scala.inline
    def apply(accountId: Input[String], detectorId: Input[String], email: Input[String]): MemberArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberArgs]
    }
    
    @scala.inline
    implicit class MemberArgsMutableBuilder[Self <: MemberArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEmailNotification(value: Input[Boolean]): Self = StObject.set(x, "disableEmailNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEmailNotificationUndefined: Self = StObject.set(x, "disableEmailNotification", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvitationMessage(value: Input[String]): Self = StObject.set(x, "invitationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvitationMessageUndefined: Self = StObject.set(x, "invitationMessage", js.undefined)
      
      @scala.inline
      def setInvite(value: Input[Boolean]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
    }
  }
  
  @js.native
  trait MemberState extends StObject {
    
    /**
      * AWS account ID for member account.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The detector ID of the GuardDuty account where you want to create member accounts.
      */
    val detectorId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
      */
    val disableEmailNotification: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Email address for member account.
      */
    val email: js.UndefOr[Input[String]] = js.native
    
    /**
      * Message for invitation.
      */
    val invitationMessage: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationshipStatus` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
      */
    val invite: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
      */
    val relationshipStatus: js.UndefOr[Input[String]] = js.native
  }
  object MemberState {
    
    @scala.inline
    def apply(): MemberState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemberState]
    }
    
    @scala.inline
    implicit class MemberStateMutableBuilder[Self <: MemberState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      @scala.inline
      def setDetectorId(value: Input[String]): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
      
      @scala.inline
      def setDisableEmailNotification(value: Input[Boolean]): Self = StObject.set(x, "disableEmailNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEmailNotificationUndefined: Self = StObject.set(x, "disableEmailNotification", js.undefined)
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInvitationMessage(value: Input[String]): Self = StObject.set(x, "invitationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvitationMessageUndefined: Self = StObject.set(x, "invitationMessage", js.undefined)
      
      @scala.inline
      def setInvite(value: Input[Boolean]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
      
      @scala.inline
      def setRelationshipStatus(value: Input[String]): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    }
  }
}
