package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1.CertificateSigningRequestSpec
import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1.CertificateSigningRequestStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1CertificateSigningRequestMod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1/certificateSigningRequest", "CertificateSigningRequest")
  @js.native
  class CertificateSigningRequest protected () extends CustomResource {
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
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[certificatesDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * spec contains the certificate request, and is immutable after creation. Only the request, signerName, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
      */
    val spec: Output_[CertificateSigningRequestSpec] = js.native
    
    /**
      * status contains information about whether the request is approved or denied, and the certificate issued by the signer, or the failure condition indicating signer failure.
      */
    val status: Output_[CertificateSigningRequestStatus] = js.native
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
    @JSImport("@pulumi/kubernetes/certificates/v1/certificateSigningRequest", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID]): CertificateSigningRequest = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1/certificateSigningRequest", "CertificateSigningRequest.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequest = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1/certificateSigningRequest", "CertificateSigningRequest.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1/certificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
  }
  
  @js.native
  trait CertificateSigningRequestArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest]
      ] = js.native
    
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * spec contains the certificate request, and is immutable after creation. Only the request, signerName, and usages fields can be set on creation. Other fields are derived by Kubernetes and cannot be modified by users.
      */
    val spec: Input[
        typingsSlinky.pulumiKubernetes.inputMod.certificates.v1.CertificateSigningRequestSpec
      ] = js.native
  }
  object CertificateSigningRequestArgs {
    
    @scala.inline
    def apply(
      spec: Input[
          typingsSlinky.pulumiKubernetes.inputMod.certificates.v1.CertificateSigningRequestSpec
        ]
    ): CertificateSigningRequestArgs = {
      val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestArgs]
    }
    
    @scala.inline
    implicit class CertificateSigningRequestArgsMutableBuilder[Self <: CertificateSigningRequestArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setSpec(
        value: Input[
              typingsSlinky.pulumiKubernetes.inputMod.certificates.v1.CertificateSigningRequestSpec
            ]
      ): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
}
