package typingsSlinky.ionicCliFramework.helpMod

import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.link
import typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteText
  - typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchemaFootnoteLink
*/
trait CommandHelpSchemaFootnote extends js.Object
object CommandHelpSchemaFootnote {
  
  @scala.inline
  def CommandHelpSchemaFootnoteText(id: String | Double, text: String, `type`: text): CommandHelpSchemaFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnote]
  }
  
  @scala.inline
  def CommandHelpSchemaFootnoteLink(id: String | Double, `type`: link, url: String): CommandHelpSchemaFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandHelpSchemaFootnote]
  }
}
