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

object sshKeyMod {
  
  @JSImport("@pulumi/aws/iam/sshKey", "SshKey")
  @js.native
  class SshKey protected () extends CustomResource {
    /**
      * Create a SshKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SshKeyArgs) = this()
    def this(name: String, args: SshKeyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: Output_[String] = js.native
    
    /**
      * The MD5 message digest of the SSH public key.
      */
    val fingerprint: Output_[String] = js.native
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: Output_[String] = js.native
    
    /**
      * The unique identifier for the SSH public key.
      */
    val sshPublicKeyId: Output_[String] = js.native
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: Output_[String] = js.native
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: Output_[String] = js.native
  }
  /* static members */
  object SshKey {
    
    /**
      * Get an existing SshKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID]): SshKey = js.native
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SshKey = js.native
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState): SshKey = js.native
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: SshKeyState, opts: CustomResourceOptions): SshKey = js.native
    
    /**
      * Returns true if the given object is an instance of SshKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/iam/sshKey", "SshKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/sshKey.SshKey */ Boolean = js.native
  }
  
  @js.native
  trait SshKeyArgs extends StObject {
    
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: Input[String] = js.native
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: Input[String] = js.native
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: Input[String] = js.native
  }
  object SshKeyArgs {
    
    @scala.inline
    def apply(encoding: Input[String], publicKey: Input[String], username: Input[String]): SshKeyArgs = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SshKeyArgs]
    }
    
    @scala.inline
    implicit class SshKeyArgsMutableBuilder[Self <: SshKeyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: Input[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SshKeyState extends StObject {
    
    /**
      * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
      */
    val encoding: js.UndefOr[Input[String]] = js.native
    
    /**
      * The MD5 message digest of the SSH public key.
      */
    val fingerprint: js.UndefOr[Input[String]] = js.native
    
    /**
      * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
      */
    val publicKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier for the SSH public key.
      */
    val sshPublicKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the IAM user to associate the SSH public key with.
      */
    val username: js.UndefOr[Input[String]] = js.native
  }
  object SshKeyState {
    
    @scala.inline
    def apply(): SshKeyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SshKeyState]
    }
    
    @scala.inline
    implicit class SshKeyStateMutableBuilder[Self <: SshKeyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: Input[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFingerprint(value: Input[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setPublicKey(value: Input[String]): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setSshPublicKeyId(value: Input[String]): Self = StObject.set(x, "sshPublicKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSshPublicKeyIdUndefined: Self = StObject.set(x, "sshPublicKeyId", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
