package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.secretsmanagerGetSecretMod.GetSecretArgs
import typingsSlinky.atPulumiAws.secretsmanagerGetSecretMod.GetSecretResult
import typingsSlinky.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionArgs
import typingsSlinky.atPulumiAws.secretsmanagerGetSecretVersionMod.GetSecretVersionResult
import typingsSlinky.atPulumiAws.secretsmanagerSecretMod.SecretArgs
import typingsSlinky.atPulumiAws.secretsmanagerSecretMod.SecretState
import typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionArgs
import typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersionState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
@js.native
object secretsmanagerMod extends js.Object {
  @js.native
  class Secret protected ()
    extends typingsSlinky.atPulumiAws.secretsmanagerSecretMod.Secret {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecretArgs) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SecretVersion protected ()
    extends typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion {
    /**
      * Create a SecretVersion resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretVersionArgs) = this()
    def this(name: String, args: SecretVersionArgs, opts: CustomResourceOptions) = this()
  }
  
  def getSecret(): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] with GetSecretVersionResult = js.native
  /* static members */
  @js.native
  object Secret extends js.Object {
    /**
      * Get an existing Secret resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState): typingsSlinky.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.secretsmanagerSecretMod.Secret = js.native
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SecretVersion extends js.Object {
    /**
      * Get an existing SecretVersion resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.secretsmanagerSecretVersionMod.SecretVersion = js.native
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
  
}

