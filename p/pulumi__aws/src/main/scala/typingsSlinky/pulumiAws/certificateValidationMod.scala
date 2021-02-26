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

object certificateValidationMod {
  
  @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation")
  @js.native
  class CertificateValidation protected () extends CustomResource {
    /**
      * Create a CertificateValidation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateValidationArgs) = this()
    def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the certificate that is being validated.
      */
    val certificateArn: Output_[String] = js.native
    
    /**
      * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
      */
    val validationRecordFqdns: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object CertificateValidation {
    
    /**
      * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID]): CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState): CertificateValidation = js.native
    @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): CertificateValidation = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/acm/certificateValidation", "CertificateValidation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
  }
  
  @js.native
  trait CertificateValidationArgs extends StObject {
    
    /**
      * The ARN of the certificate that is being validated.
      */
    val certificateArn: Input[String] = js.native
    
    /**
      * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
      */
    val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object CertificateValidationArgs {
    
    @scala.inline
    def apply(certificateArn: Input[String]): CertificateValidationArgs = {
      val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateValidationArgs]
    }
    
    @scala.inline
    implicit class CertificateValidationArgsMutableBuilder[Self <: CertificateValidationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRecordFqdns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "validationRecordFqdns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRecordFqdnsUndefined: Self = StObject.set(x, "validationRecordFqdns", js.undefined)
      
      @scala.inline
      def setValidationRecordFqdnsVarargs(value: Input[String]*): Self = StObject.set(x, "validationRecordFqdns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CertificateValidationState extends StObject {
    
    /**
      * The ARN of the certificate that is being validated.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
      */
    val validationRecordFqdns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object CertificateValidationState {
    
    @scala.inline
    def apply(): CertificateValidationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateValidationState]
    }
    
    @scala.inline
    implicit class CertificateValidationStateMutableBuilder[Self <: CertificateValidationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setValidationRecordFqdns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "validationRecordFqdns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRecordFqdnsUndefined: Self = StObject.set(x, "validationRecordFqdns", js.undefined)
      
      @scala.inline
      def setValidationRecordFqdnsVarargs(value: Input[String]*): Self = StObject.set(x, "validationRecordFqdns", js.Array(value :_*))
    }
  }
}
