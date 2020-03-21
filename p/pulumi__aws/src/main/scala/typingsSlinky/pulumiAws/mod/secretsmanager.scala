package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getSecretVersionMod.GetSecretVersionArgs
import typingsSlinky.pulumiAws.getSecretVersionMod.GetSecretVersionResult
import typingsSlinky.pulumiAws.secretMod.SecretArgs
import typingsSlinky.pulumiAws.secretMod.SecretState
import typingsSlinky.pulumiAws.secretVersionMod.SecretVersionArgs
import typingsSlinky.pulumiAws.secretVersionMod.SecretVersionState
import typingsSlinky.pulumiAws.secretsmanagerGetSecretMod.GetSecretArgs
import typingsSlinky.pulumiAws.secretsmanagerGetSecretMod.GetSecretResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "secretsmanager")
@js.native
object secretsmanager extends js.Object {
  @js.native
  class Secret protected ()
    extends typingsSlinky.pulumiAws.secretsmanagerMod.Secret {
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
    extends typingsSlinky.pulumiAws.secretsmanagerMod.SecretVersion {
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretMod.Secret = js.native
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
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
  
}

