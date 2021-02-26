package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.botAliasMod.BotAliasArgs
import typingsSlinky.pulumiAws.botAliasMod.BotAliasState
import typingsSlinky.pulumiAws.botMod.BotArgs
import typingsSlinky.pulumiAws.botMod.BotState
import typingsSlinky.pulumiAws.getBotAliasMod.GetBotAliasArgs
import typingsSlinky.pulumiAws.getBotAliasMod.GetBotAliasResult
import typingsSlinky.pulumiAws.getBotMod.GetBotArgs
import typingsSlinky.pulumiAws.getBotMod.GetBotResult
import typingsSlinky.pulumiAws.getIntentMod.GetIntentArgs
import typingsSlinky.pulumiAws.getIntentMod.GetIntentResult
import typingsSlinky.pulumiAws.getSlotTypeMod.GetSlotTypeArgs
import typingsSlinky.pulumiAws.getSlotTypeMod.GetSlotTypeResult
import typingsSlinky.pulumiAws.intentMod.IntentArgs
import typingsSlinky.pulumiAws.intentMod.IntentState
import typingsSlinky.pulumiAws.slotTypeMod.SlotTypeArgs
import typingsSlinky.pulumiAws.slotTypeMod.SlotTypeState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lex {
  
  @JSImport("@pulumi/aws", "lex.Bot")
  @js.native
  class Bot protected ()
    extends typingsSlinky.pulumiAws.lexMod.Bot {
    /**
      * Create a Bot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotArgs) = this()
    def this(name: String, args: BotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Bot {
    
    /**
      * Get an existing Bot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotState): typingsSlinky.pulumiAws.botMod.Bot = js.native
    @JSImport("@pulumi/aws", "lex.Bot.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.botMod.Bot = js.native
    
    /**
      * Returns true if the given object is an instance of Bot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.Bot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/bot.Bot */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.BotAlias")
  @js.native
  class BotAlias protected ()
    extends typingsSlinky.pulumiAws.lexMod.BotAlias {
    /**
      * Create a BotAlias resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BotAliasArgs) = this()
    def this(name: String, args: BotAliasArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object BotAlias {
    
    /**
      * Get an existing BotAlias resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotAliasState): typingsSlinky.pulumiAws.botAliasMod.BotAlias = js.native
    @JSImport("@pulumi/aws", "lex.BotAlias.get")
    @js.native
    def get(name: String, id: Input[ID], state: BotAliasState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.botAliasMod.BotAlias = js.native
    
    /**
      * Returns true if the given object is an instance of BotAlias.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.BotAlias.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/botAlias.BotAlias */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.Intent")
  @js.native
  class Intent protected ()
    extends typingsSlinky.pulumiAws.lexMod.Intent {
    /**
      * Create a Intent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IntentArgs) = this()
    def this(name: String, args: IntentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Intent {
    
    /**
      * Get an existing Intent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntentState): typingsSlinky.pulumiAws.intentMod.Intent = js.native
    @JSImport("@pulumi/aws", "lex.Intent.get")
    @js.native
    def get(name: String, id: Input[ID], state: IntentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.intentMod.Intent = js.native
    
    /**
      * Returns true if the given object is an instance of Intent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.Intent.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/intent.Intent */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.SlotType")
  @js.native
  class SlotType protected ()
    extends typingsSlinky.pulumiAws.lexMod.SlotType {
    /**
      * Create a SlotType resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SlotTypeArgs) = this()
    def this(name: String, args: SlotTypeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SlotType {
    
    /**
      * Get an existing SlotType resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: SlotTypeState): typingsSlinky.pulumiAws.slotTypeMod.SlotType = js.native
    @JSImport("@pulumi/aws", "lex.SlotType.get")
    @js.native
    def get(name: String, id: Input[ID], state: SlotTypeState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.slotTypeMod.SlotType = js.native
    
    /**
      * Returns true if the given object is an instance of SlotType.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "lex.SlotType.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "lex.getBot")
  @js.native
  def getBot(args: GetBotArgs): js.Promise[GetBotResult] = js.native
  @JSImport("@pulumi/aws", "lex.getBot")
  @js.native
  def getBot(args: GetBotArgs, opts: InvokeOptions): js.Promise[GetBotResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs): js.Promise[GetBotAliasResult] = js.native
  @JSImport("@pulumi/aws", "lex.getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs, opts: InvokeOptions): js.Promise[GetBotAliasResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getIntent")
  @js.native
  def getIntent(args: GetIntentArgs): js.Promise[GetIntentResult] = js.native
  @JSImport("@pulumi/aws", "lex.getIntent")
  @js.native
  def getIntent(args: GetIntentArgs, opts: InvokeOptions): js.Promise[GetIntentResult] = js.native
  
  @JSImport("@pulumi/aws", "lex.getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs): js.Promise[GetSlotTypeResult] = js.native
  @JSImport("@pulumi/aws", "lex.getSlotType")
  @js.native
  def getSlotType(args: GetSlotTypeArgs, opts: InvokeOptions): js.Promise[GetSlotTypeResult] = js.native
}
