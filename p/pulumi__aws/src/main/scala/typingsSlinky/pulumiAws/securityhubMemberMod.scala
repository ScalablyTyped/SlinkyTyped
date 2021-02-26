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

object securityhubMemberMod {
  
  @JSImport("@pulumi/aws/securityhub/member", "Member")
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
      * The ID of the member AWS account.
      */
    val accountId: Output_[String] = js.native
    
    /**
      * The email of the member AWS account.
      */
    val email: Output_[String] = js.native
    
    /**
      * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
      */
    val invite: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ID of the master Security Hub AWS account.
      */
    val masterId: Output_[String] = js.native
    
    /**
      * The status of the member account relationship.
      */
    val memberStatus: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/securityhub/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID]): Member = js.native
    @JSImport("@pulumi/aws/securityhub/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Member = js.native
    @JSImport("@pulumi/aws/securityhub/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState): Member = js.native
    @JSImport("@pulumi/aws/securityhub/member", "Member.get")
    @js.native
    def get(name: String, id: Input[ID], state: MemberState, opts: CustomResourceOptions): Member = js.native
    
    /**
      * Returns true if the given object is an instance of Member.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/securityhub/member", "Member.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/securityhub/member.Member */ Boolean = js.native
  }
  
  @js.native
  trait MemberArgs extends StObject {
    
    /**
      * The ID of the member AWS account.
      */
    val accountId: Input[String] = js.native
    
    /**
      * The email of the member AWS account.
      */
    val email: Input[String] = js.native
    
    /**
      * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
      */
    val invite: js.UndefOr[Input[Boolean]] = js.native
  }
  object MemberArgs {
    
    @scala.inline
    def apply(accountId: Input[String], email: Input[String]): MemberArgs = {
      val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemberArgs]
    }
    
    @scala.inline
    implicit class MemberArgsMutableBuilder[Self <: MemberArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountId(value: Input[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvite(value: Input[Boolean]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
    }
  }
  
  @js.native
  trait MemberState extends StObject {
    
    /**
      * The ID of the member AWS account.
      */
    val accountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The email of the member AWS account.
      */
    val email: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
      */
    val invite: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ID of the master Security Hub AWS account.
      */
    val masterId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of the member account relationship.
      */
    val memberStatus: js.UndefOr[Input[String]] = js.native
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
      def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setInvite(value: Input[Boolean]): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
      
      @scala.inline
      def setMasterId(value: Input[String]): Self = StObject.set(x, "masterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterIdUndefined: Self = StObject.set(x, "masterId", js.undefined)
      
      @scala.inline
      def setMemberStatus(value: Input[String]): Self = StObject.set(x, "memberStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberStatusUndefined: Self = StObject.set(x, "memberStatus", js.undefined)
    }
  }
}
