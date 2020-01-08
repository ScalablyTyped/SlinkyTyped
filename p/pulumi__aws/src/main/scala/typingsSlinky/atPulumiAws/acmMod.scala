package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.acmCertificateMod.CertificateArgs
import typingsSlinky.atPulumiAws.acmCertificateMod.CertificateState
import typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidationArgs
import typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidationState
import typingsSlinky.atPulumiAws.acmGetCertificateMod.GetCertificateArgs
import typingsSlinky.atPulumiAws.acmGetCertificateMod.GetCertificateResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acm", JSImport.Namespace)
@js.native
object acmMod extends js.Object {
  @js.native
  class Certificate protected ()
    extends typingsSlinky.atPulumiAws.acmCertificateMod.Certificate {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CertificateValidation protected ()
    extends typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidation {
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
  
  def getCertificate(args: GetCertificateArgs): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
  def getCertificate(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] with GetCertificateResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.acmCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState): typingsSlinky.atPulumiAws.acmCertificateMod.Certificate = js.native
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.acmCertificateMod.Certificate = js.native
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState): typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
    def get(name: String, id: Input[ID], state: CertificateValidationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.acmCertificateValidationMod.CertificateValidation = js.native
    /**
      * Returns true if the given object is an instance of CertificateValidation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificateValidation.CertificateValidation */ Boolean = js.native
  }
  
}

