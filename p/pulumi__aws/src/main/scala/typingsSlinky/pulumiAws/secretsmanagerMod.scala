package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getSecretRotationMod.GetSecretRotationArgs
import typingsSlinky.pulumiAws.getSecretRotationMod.GetSecretRotationResult
import typingsSlinky.pulumiAws.getSecretVersionMod.GetSecretVersionArgs
import typingsSlinky.pulumiAws.getSecretVersionMod.GetSecretVersionResult
import typingsSlinky.pulumiAws.secretMod.SecretArgs
import typingsSlinky.pulumiAws.secretMod.SecretState
import typingsSlinky.pulumiAws.secretRotationMod.SecretRotationArgs
import typingsSlinky.pulumiAws.secretRotationMod.SecretRotationState
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/secretsmanager", JSImport.Namespace)
@js.native
object secretsmanagerMod extends js.Object {
  
  def getSecret(): js.Promise[GetSecretResult] = js.native
  def getSecret(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  
  def getSecretRotation(args: GetSecretRotationArgs): js.Promise[GetSecretRotationResult] = js.native
  def getSecretRotation(args: GetSecretRotationArgs, opts: InvokeOptions): js.Promise[GetSecretRotationResult] = js.native
  
  def getSecretVersion(args: GetSecretVersionArgs): js.Promise[GetSecretVersionResult] = js.native
  def getSecretVersion(args: GetSecretVersionArgs, opts: InvokeOptions): js.Promise[GetSecretVersionResult] = js.native
  
  @js.native
  class Secret protected ()
    extends typingsSlinky.pulumiAws.secretMod.Secret {
    /**
      * Create a Secret resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecretArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SecretArgs, opts: CustomResourceOptions) = this()
  }
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    def get(name: String, id: Input[ID], state: SecretState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretMod.Secret = js.native
    
    /**
      * Returns true if the given object is an instance of Secret.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secret.Secret */ Boolean = js.native
  }
  
  @js.native
  class SecretRotation protected ()
    extends typingsSlinky.pulumiAws.secretRotationMod.SecretRotation {
    /**
      * Create a SecretRotation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecretRotationArgs) = this()
    def this(name: String, args: SecretRotationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object SecretRotation extends js.Object {
    
    /**
      * Get an existing SecretRotation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: SecretRotationState): typingsSlinky.pulumiAws.secretRotationMod.SecretRotation = js.native
    def get(name: String, id: Input[ID], state: SecretRotationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretRotationMod.SecretRotation = js.native
    
    /**
      * Returns true if the given object is an instance of SecretRotation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretRotation.SecretRotation */ Boolean = js.native
  }
  
  @js.native
  class SecretVersion protected ()
    extends typingsSlinky.pulumiAws.secretVersionMod.SecretVersion {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    def get(name: String, id: Input[ID], state: SecretVersionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.secretVersionMod.SecretVersion = js.native
    
    /**
      * Returns true if the given object is an instance of SecretVersion.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/secretsmanager/secretVersion.SecretVersion */ Boolean = js.native
  }
}
