package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthorityArgs
import typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthorityState
import typingsSlinky.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityArgs
import typingsSlinky.pulumiAws.getCertificateAuthorityMod.GetCertificateAuthorityResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acmpcaMod {
  
  @JSImport("@pulumi/aws/acmpca", "CertificateAuthority")
  @js.native
  class CertificateAuthority protected ()
    extends typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthority {
    /**
      * Create a CertificateAuthority resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CertificateAuthorityArgs) = this()
    def this(name: String, args: CertificateAuthorityArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateAuthority {
    
    /**
      * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState): typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority.get")
    @js.native
    def get(name: String, id: Input[ID], state: CertificateAuthorityState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.certificateAuthorityMod.CertificateAuthority = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/acmpca", "CertificateAuthority.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/acmpca", "getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs): js.Promise[GetCertificateAuthorityResult] = js.native
  @JSImport("@pulumi/aws/acmpca", "getCertificateAuthority")
  @js.native
  def getCertificateAuthority(args: GetCertificateAuthorityArgs, opts: InvokeOptions): js.Promise[GetCertificateAuthorityResult] = js.native
}
