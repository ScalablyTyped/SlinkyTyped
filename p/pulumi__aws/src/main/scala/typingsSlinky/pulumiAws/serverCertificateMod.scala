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

object serverCertificateMod {
  
  @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate")
  @js.native
  class ServerCertificate protected () extends CustomResource {
    /**
      * Create a ServerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServerCertificateArgs) = this()
    def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the server certificate.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The contents of the public key certificate in
      * PEM-encoded format.
      */
    val certificateBody: Output_[String] = js.native
    
    /**
      * The contents of the certificate chain.
      * This is typically a concatenation of the PEM-encoded public key certificates
      * of the chain.
      */
    val certificateChain: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the Server Certificate. Do not include the
      * path in this value. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IAM path for the server certificate.  If it is not
      * included, it defaults to a slash (/). If this certificate is for use with
      * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
      */
    val path: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The contents of the private key in PEM-encoded format.
      */
    val privateKey: Output_[String] = js.native
  }
  /* static members */
  object ServerCertificate {
    
    /**
      * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): ServerCertificate = js.native
    @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ServerCertificate = js.native
    @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServerCertificateState): ServerCertificate = js.native
    @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): ServerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/serverCertificate", "ServerCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
  }
  
  @js.native
  trait ServerCertificateArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the server certificate.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the public key certificate in
      * PEM-encoded format.
      */
    val certificateBody: Input[String] = js.native
    
    /**
      * The contents of the certificate chain.
      * This is typically a concatenation of the PEM-encoded public key certificates
      * of the chain.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Server Certificate. Do not include the
      * path in this value. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM path for the server certificate.  If it is not
      * included, it defaults to a slash (/). If this certificate is for use with
      * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the private key in PEM-encoded format.
      */
    val privateKey: Input[String] = js.native
  }
  object ServerCertificateArgs {
    
    @scala.inline
    def apply(certificateBody: Input[String], privateKey: Input[String]): ServerCertificateArgs = {
      val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerCertificateArgs]
    }
    
    @scala.inline
    implicit class ServerCertificateArgsMutableBuilder[Self <: ServerCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerCertificateState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the server certificate.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the public key certificate in
      * PEM-encoded format.
      */
    val certificateBody: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the certificate chain.
      * This is typically a concatenation of the PEM-encoded public key certificates
      * of the chain.
      */
    val certificateChain: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Server Certificate. Do not include the
      * path in this value. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IAM path for the server certificate.  If it is not
      * included, it defaults to a slash (/). If this certificate is for use with
      * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
      * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
      */
    val path: js.UndefOr[Input[String]] = js.native
    
    /**
      * The contents of the private key in PEM-encoded format.
      */
    val privateKey: js.UndefOr[Input[String]] = js.native
  }
  object ServerCertificateState {
    
    @scala.inline
    def apply(): ServerCertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerCertificateState]
    }
    
    @scala.inline
    implicit class ServerCertificateStateMutableBuilder[Self <: ServerCertificateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    }
  }
}
