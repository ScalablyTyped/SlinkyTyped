package typingsSlinky.pulumiKubernetes

import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequest
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateSigningRequestListMod {
  
  @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList")
  @js.native
  class CertificateSigningRequestList protected () extends CustomResource {
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
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[certificatesDotk8sDotioSlashv1beta1] = js.native
    
    val items: Output_[js.Array[CertificateSigningRequest]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[
        typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
      ] = js.native
    
    val metadata: Output_[ListMeta] = js.native
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
    @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID]): CertificateSigningRequestList = js.native
    @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequestList = js.native
    
    /**
      * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
  }
  
  @js.native
  trait CertificateSigningRequestListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1beta1]] = js.native
    
    val items: Input[
        js.Array[
          Input[
            typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest
          ]
        ]
      ] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[
          typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
        ]
      ] = js.native
    
    val metadata: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.native
  }
  object CertificateSigningRequestListArgs {
    
    @scala.inline
    def apply(
      items: Input[
          js.Array[
            Input[
              typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest
            ]
          ]
        ]
    ): CertificateSigningRequestListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSigningRequestListArgs]
    }
    
    @scala.inline
    implicit class CertificateSigningRequestListArgsMutableBuilder[Self <: CertificateSigningRequestListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[certificatesDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(
        value: Input[
              js.Array[
                Input[
                  typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest
                ]
              ]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(
        value: (Input[
              typingsSlinky.pulumiKubernetes.inputMod.certificates.v1beta1.CertificateSigningRequest
            ])*
      ): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(
        value: Input[
              typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
