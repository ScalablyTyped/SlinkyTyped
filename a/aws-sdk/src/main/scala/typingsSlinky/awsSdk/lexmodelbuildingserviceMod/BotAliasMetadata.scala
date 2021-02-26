package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotAliasMetadata extends StObject {
  
  /**
    * The name of the bot to which the alias points.
    */
  var botName: js.UndefOr[BotName] = js.native
  
  /**
    * The version of the Amazon Lex bot to which the alias points.
    */
  var botVersion: js.UndefOr[Version] = js.native
  
  /**
    * Checksum of the bot alias.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * Settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.native
  
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the bot alias.
    */
  var name: js.UndefOr[AliasName] = js.native
}
object BotAliasMetadata {
  
  @scala.inline
  def apply(): BotAliasMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotAliasMetadata]
  }
  
  @scala.inline
  implicit class BotAliasMetadataMutableBuilder[Self <: BotAliasMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    @scala.inline
    def setBotVersion(value: Version): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setConversationLogs(value: ConversationLogsResponse): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
