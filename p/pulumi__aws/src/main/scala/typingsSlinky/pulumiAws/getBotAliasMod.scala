package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBotAliasMod {
  
  @JSImport("@pulumi/aws/lex/getBotAlias", "getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs): js.Promise[GetBotAliasResult] = js.native
  @JSImport("@pulumi/aws/lex/getBotAlias", "getBotAlias")
  @js.native
  def getBotAlias(args: GetBotAliasArgs, opts: InvokeOptions): js.Promise[GetBotAliasResult] = js.native
  
  @js.native
  trait GetBotAliasArgs extends StObject {
    
    /**
      * The name of the bot.
      */
    val botName: String = js.native
    
    /**
      * The name of the bot alias. The name is case sensitive.
      */
    val name: String = js.native
  }
  object GetBotAliasArgs {
    
    @scala.inline
    def apply(botName: String, name: String): GetBotAliasArgs = {
      val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBotAliasArgs]
    }
    
    @scala.inline
    implicit class GetBotAliasArgsMutableBuilder[Self <: GetBotAliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBotName(value: String): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetBotAliasResult extends StObject {
    
    /**
      * The ARN of the bot alias.
      */
    val arn: String = js.native
    
    /**
      * The name of the bot.
      */
    val botName: String = js.native
    
    /**
      * The version of the bot that the alias points to.
      */
    val botVersion: String = js.native
    
    /**
      * Checksum of the bot alias.
      */
    val checksum: String = js.native
    
    /**
      * The date that the bot alias was created.
      */
    val createdDate: String = js.native
    
    /**
      * A description of the alias.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The date that the bot alias was updated. When you create a resource, the creation date and the last updated date are the same.
      */
    val lastUpdatedDate: String = js.native
    
    /**
      * The name of the alias. The name is not case sensitive.
      */
    val name: String = js.native
  }
  object GetBotAliasResult {
    
    @scala.inline
    def apply(
      arn: String,
      botName: String,
      botVersion: String,
      checksum: String,
      createdDate: String,
      description: String,
      id: String,
      lastUpdatedDate: String,
      name: String
    ): GetBotAliasResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBotAliasResult]
    }
    
    @scala.inline
    implicit class GetBotAliasResultMutableBuilder[Self <: GetBotAliasResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotName(value: String): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBotVersion(value: String): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDate(value: String): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
