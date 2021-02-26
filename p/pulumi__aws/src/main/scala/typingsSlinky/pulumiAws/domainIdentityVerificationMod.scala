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

object domainIdentityVerificationMod {
  
  @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification")
  @js.native
  class DomainIdentityVerification protected () extends CustomResource {
    /**
      * Create a DomainIdentityVerification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainIdentityVerificationArgs) = this()
    def this(name: String, args: DomainIdentityVerificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the domain identity.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID]): DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState): DomainIdentityVerification = js.native
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainIdentityVerificationState, opts: CustomResourceOptions): DomainIdentityVerification = js.native
    
    /**
      * Returns true if the given object is an instance of DomainIdentityVerification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ses/domainIdentityVerification", "DomainIdentityVerification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/domainIdentityVerification.DomainIdentityVerification */ Boolean = js.native
  }
  
  @js.native
  trait DomainIdentityVerificationArgs extends StObject {
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: Input[String] = js.native
  }
  object DomainIdentityVerificationArgs {
    
    @scala.inline
    def apply(domain: Input[String]): DomainIdentityVerificationArgs = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainIdentityVerificationArgs]
    }
    
    @scala.inline
    implicit class DomainIdentityVerificationArgsMutableBuilder[Self <: DomainIdentityVerificationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomainIdentityVerificationState extends StObject {
    
    /**
      * The ARN of the domain identity.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The domain name of the SES domain identity to verify.
      */
    val domain: js.UndefOr[Input[String]] = js.native
  }
  object DomainIdentityVerificationState {
    
    @scala.inline
    def apply(): DomainIdentityVerificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainIdentityVerificationState]
    }
    
    @scala.inline
    implicit class DomainIdentityVerificationStateMutableBuilder[Self <: DomainIdentityVerificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDomain(value: Input[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    }
  }
}
