package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.kmsAliasMod.AliasArgs
import typingsSlinky.atPulumiAws.kmsAliasMod.AliasState
import typingsSlinky.atPulumiAws.kmsCiphertextMod.CiphertextArgs
import typingsSlinky.atPulumiAws.kmsCiphertextMod.CiphertextState
import typingsSlinky.atPulumiAws.kmsExternalKeyMod.ExternalKeyArgs
import typingsSlinky.atPulumiAws.kmsExternalKeyMod.ExternalKeyState
import typingsSlinky.atPulumiAws.kmsGetAliasMod.GetAliasArgs
import typingsSlinky.atPulumiAws.kmsGetAliasMod.GetAliasResult
import typingsSlinky.atPulumiAws.kmsGetCipherTextMod.GetCipherTextArgs
import typingsSlinky.atPulumiAws.kmsGetCipherTextMod.GetCipherTextResult
import typingsSlinky.atPulumiAws.kmsGetKeyMod.GetKeyArgs
import typingsSlinky.atPulumiAws.kmsGetKeyMod.GetKeyResult
import typingsSlinky.atPulumiAws.kmsGetSecretMod.GetSecretArgs
import typingsSlinky.atPulumiAws.kmsGetSecretMod.GetSecretResult
import typingsSlinky.atPulumiAws.kmsGetSecretsMod.GetSecretsArgs
import typingsSlinky.atPulumiAws.kmsGetSecretsMod.GetSecretsResult
import typingsSlinky.atPulumiAws.kmsGrantMod.GrantArgs
import typingsSlinky.atPulumiAws.kmsGrantMod.GrantState
import typingsSlinky.atPulumiAws.kmsKeyMod.KeyArgs
import typingsSlinky.atPulumiAws.kmsKeyMod.KeyState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kms")
@js.native
object kms extends js.Object {
  @js.native
  class Alias protected ()
    extends typingsSlinky.atPulumiAws.kmsMod.Alias {
    /**
      * Create a Alias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AliasArgs) = this()
    def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Ciphertext protected ()
    extends typingsSlinky.atPulumiAws.kmsMod.Ciphertext {
    /**
      * Create a Ciphertext resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CiphertextArgs) = this()
    def this(name: String, args: CiphertextArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ExternalKey protected ()
    extends typingsSlinky.atPulumiAws.kmsMod.ExternalKey {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ExternalKeyArgs) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Grant protected ()
    extends typingsSlinky.atPulumiAws.kmsMod.Grant {
    /**
      * Create a Grant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GrantArgs) = this()
    def this(name: String, args: GrantArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Key protected ()
    extends typingsSlinky.atPulumiAws.kmsMod.Key {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyArgs) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] with GetCipherTextResult = js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] with GetSecretResult = js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] with GetSecretsResult = js.native
  /* static members */
  @js.native
  object Alias extends js.Object {
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState): typingsSlinky.atPulumiAws.kmsAliasMod.Alias = js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.kmsAliasMod.Alias = js.native
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Ciphertext extends js.Object {
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState): typingsSlinky.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.kmsCiphertextMod.Ciphertext = js.native
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ExternalKey extends js.Object {
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState): typingsSlinky.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Grant extends js.Object {
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.kmsGrantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState): typingsSlinky.atPulumiAws.kmsGrantMod.Grant = js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.kmsGrantMod.Grant = js.native
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Key extends js.Object {
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.kmsKeyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState): typingsSlinky.atPulumiAws.kmsKeyMod.Key = js.native
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.kmsKeyMod.Key = js.native
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
  }
  
}

