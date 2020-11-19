package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.certificateMod.CertificateArgs
import typingsSlinky.pulumiAws.certificateMod.CertificateState
import typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidationArgs
import typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidationState
import typingsSlinky.pulumiAws.getCertificateMod.GetCertificateArgs
import typingsSlinky.pulumiAws.getCertificateMod.GetCertificateResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/acm", JSImport.Namespace)
@js.native
object acmMod extends js.Object {
  
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] = js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  
  @js.native
  class Certificate protected ()
    extends typingsSlinky.pulumiAws.certificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Certificate extends js.Object {
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.certificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsSlinky.pulumiAws.certificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateMod.Certificate = js.native
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
  }
  
  @js.native
  class CertificateValidation protected ()
    extends typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidation {
    /**
      * Create a CertificateValidation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateValidationArgs) = this()
    def this(name: String, args: CertificateValidationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object CertificateValidation extends js.Object {
    
    /**
      * Get an existing CertificateValidation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState): typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateValidationMod.CertificateValidation = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
  }
}
