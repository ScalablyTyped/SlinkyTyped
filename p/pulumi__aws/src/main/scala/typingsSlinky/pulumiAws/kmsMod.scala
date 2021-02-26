package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.ciphertextMod.CiphertextArgs
import typingsSlinky.pulumiAws.ciphertextMod.CiphertextState
import typingsSlinky.pulumiAws.externalKeyMod.ExternalKeyArgs
import typingsSlinky.pulumiAws.externalKeyMod.ExternalKeyState
import typingsSlinky.pulumiAws.getAliasMod.GetAliasArgs
import typingsSlinky.pulumiAws.getAliasMod.GetAliasResult
import typingsSlinky.pulumiAws.getCipherTextMod.GetCipherTextArgs
import typingsSlinky.pulumiAws.getCipherTextMod.GetCipherTextResult
import typingsSlinky.pulumiAws.getSecretMod.GetSecretArgs
import typingsSlinky.pulumiAws.getSecretMod.GetSecretResult
import typingsSlinky.pulumiAws.getSecretsMod.GetSecretsArgs
import typingsSlinky.pulumiAws.getSecretsMod.GetSecretsResult
import typingsSlinky.pulumiAws.grantMod.GrantArgs
import typingsSlinky.pulumiAws.grantMod.GrantState
import typingsSlinky.pulumiAws.keyMod.KeyArgs
import typingsSlinky.pulumiAws.keyMod.KeyState
import typingsSlinky.pulumiAws.kmsAliasMod.AliasArgs
import typingsSlinky.pulumiAws.kmsAliasMod.AliasState
import typingsSlinky.pulumiAws.kmsGetKeyMod.GetKeyArgs
import typingsSlinky.pulumiAws.kmsGetKeyMod.GetKeyResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kmsMod {
  
  @JSImport("@pulumi/aws/kms", "Alias")
  @js.native
  class Alias protected ()
    extends typingsSlinky.pulumiAws.kmsAliasMod.Alias {
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
  /* static members */
  object Alias {
    
    /**
      * Get an existing Alias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws/kms", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws/kms", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState): typingsSlinky.pulumiAws.kmsAliasMod.Alias = js.native
    @JSImport("@pulumi/aws/kms", "Alias.get")
    @js.native
    def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.kmsAliasMod.Alias = js.native
    
    /**
      * Returns true if the given object is an instance of Alias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms", "Alias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/alias.Alias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/kms", "Ciphertext")
  @js.native
  class Ciphertext protected ()
    extends typingsSlinky.pulumiAws.ciphertextMod.Ciphertext {
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
  /* static members */
  object Ciphertext {
    
    /**
      * Get an existing Ciphertext resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms", "Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws/kms", "Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws/kms", "Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: CiphertextState): typingsSlinky.pulumiAws.ciphertextMod.Ciphertext = js.native
    @JSImport("@pulumi/aws/kms", "Ciphertext.get")
    @js.native
    def get(name: String, id: Input[ID], state: CiphertextState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.ciphertextMod.Ciphertext = js.native
    
    /**
      * Returns true if the given object is an instance of Ciphertext.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms", "Ciphertext.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/ciphertext.Ciphertext */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/kms", "ExternalKey")
  @js.native
  class ExternalKey protected ()
    extends typingsSlinky.pulumiAws.externalKeyMod.ExternalKey {
    /**
      * Create a ExternalKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ExternalKeyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ExternalKey {
    
    /**
      * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms", "ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws/kms", "ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws/kms", "ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState): typingsSlinky.pulumiAws.externalKeyMod.ExternalKey = js.native
    @JSImport("@pulumi/aws/kms", "ExternalKey.get")
    @js.native
    def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.externalKeyMod.ExternalKey = js.native
    
    /**
      * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms", "ExternalKey.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/kms", "Grant")
  @js.native
  class Grant protected ()
    extends typingsSlinky.pulumiAws.grantMod.Grant {
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
  /* static members */
  object Grant {
    
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws/kms", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws/kms", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState): typingsSlinky.pulumiAws.grantMod.Grant = js.native
    @JSImport("@pulumi/aws/kms", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.grantMod.Grant = js.native
    
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms", "Grant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/kms", "Key")
  @js.native
  class Key protected ()
    extends typingsSlinky.pulumiAws.keyMod.Key {
    /**
      * Create a Key resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: KeyArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Key {
    
    /**
      * Get an existing Key resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms", "Key.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws/kms", "Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws/kms", "Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyState): typingsSlinky.pulumiAws.keyMod.Key = js.native
    @JSImport("@pulumi/aws/kms", "Key.get")
    @js.native
    def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.keyMod.Key = js.native
    
    /**
      * Returns true if the given object is an instance of Key.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms", "Key.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/kms", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  @JSImport("@pulumi/aws/kms", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
  
  @JSImport("@pulumi/aws/kms", "getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs): js.Promise[GetCipherTextResult] = js.native
  @JSImport("@pulumi/aws/kms", "getCipherText")
  @js.native
  def getCipherText(args: GetCipherTextArgs, opts: InvokeOptions): js.Promise[GetCipherTextResult] = js.native
  
  @JSImport("@pulumi/aws/kms", "getKey")
  @js.native
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] = js.native
  @JSImport("@pulumi/aws/kms", "getKey")
  @js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] = js.native
  
  @JSImport("@pulumi/aws/kms", "getSecret")
  @js.native
  def getSecret(args: GetSecretArgs): js.Promise[GetSecretResult] = js.native
  @JSImport("@pulumi/aws/kms", "getSecret")
  @js.native
  def getSecret(args: GetSecretArgs, opts: InvokeOptions): js.Promise[GetSecretResult] = js.native
  
  @JSImport("@pulumi/aws/kms", "getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs): js.Promise[GetSecretsResult] = js.native
  @JSImport("@pulumi/aws/kms", "getSecrets")
  @js.native
  def getSecrets(args: GetSecretsArgs, opts: InvokeOptions): js.Promise[GetSecretsResult] = js.native
}
