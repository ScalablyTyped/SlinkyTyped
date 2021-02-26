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

object mailFromMod {
  
  @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom")
  @js.native
  class MailFrom protected () extends CustomResource {
    /**
      * Create a MailFrom resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MailFromArgs) = this()
    def this(name: String, args: MailFromArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: Output_[String] = js.native
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID]): MailFrom = js.native
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MailFrom = js.native
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState): MailFrom = js.native
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom.get")
    @js.native
    def get(name: String, id: Input[ID], state: MailFromState, opts: CustomResourceOptions): MailFrom = js.native
    
    /**
      * Returns true if the given object is an instance of MailFrom.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/mailFrom", "MailFrom.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/mailFrom.MailFrom */ Boolean = js.native
  }
  
  @js.native
  trait MailFromArgs extends StObject {
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.native
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: Input[String] = js.native
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: Input[String] = js.native
  }
  object MailFromArgs {
    
    @scala.inline
    def apply(domain: Input[String], mailFromDomain: Input[String]): MailFromArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], mailFromDomain = mailFromDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[MailFromArgs]
    }
    
    @scala.inline
    implicit class MailFromArgsMutableBuilder[Self <: MailFromArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviorOnMxFailure(value: Input[String]): Self = StObject.set(x, "behaviorOnMxFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorOnMxFailureUndefined: Self = StObject.set(x, "behaviorOnMxFailure", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailFromDomain(value: Input[String]): Self = StObject.set(x, "mailFromDomain", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MailFromState extends StObject {
    
    /**
      * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
      */
    val behaviorOnMxFailure: js.UndefOr[Input[String]] = js.native
    
    /**
      * Verified domain name to generate DKIM tokens for.
      */
    val domain: js.UndefOr[Input[String]] = js.native
    
    /**
      * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
      */
    val mailFromDomain: js.UndefOr[Input[String]] = js.native
  }
  object MailFromState {
    
    @scala.inline
    def apply(): MailFromState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailFromState]
    }
    
    @scala.inline
    implicit class MailFromStateMutableBuilder[Self <: MailFromState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaviorOnMxFailure(value: Input[String]): Self = StObject.set(x, "behaviorOnMxFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviorOnMxFailureUndefined: Self = StObject.set(x, "behaviorOnMxFailure", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setMailFromDomain(value: Input[String]): Self = StObject.set(x, "mailFromDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMailFromDomainUndefined: Self = StObject.set(x, "mailFromDomain", js.undefined)
    }
  }
}
