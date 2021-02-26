package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestListArgs
import typingsSlinky.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequestArgs
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificatesV1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequest")
  @js.native
  class CertificateSigningRequest protected ()
    extends typingsSlinky.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest {
    /**
      * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateSigningRequest {
    
    /**
      * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.certificateSigningRequestMod.CertificateSigningRequest = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequest.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequestList")
  @js.native
  class CertificateSigningRequestList protected ()
    extends typingsSlinky.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList {
    /**
      * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateSigningRequestListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateSigningRequestListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object CertificateSigningRequestList {
    
    /**
      * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsSlinky.pulumiKubernetes.certificateSigningRequestListMod.CertificateSigningRequestList = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1beta1", "CertificateSigningRequestList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
  }
}
