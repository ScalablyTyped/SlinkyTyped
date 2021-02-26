package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.global
import typingsSlinky.ionic.ionicStrings.project
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandMetadata
  extends typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadata[CommandMetadataInput, CommandMetadataOption] {
  
  var `type`: global | project = js.native
}
object CommandMetadata {
  
  @scala.inline
  def apply(name: String, summary: String, `type`: global | project): CommandMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata]
  }
  
  @scala.inline
  implicit class CommandMetadataMutableBuilder[Self <: CommandMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: global | project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
