package typingsSlinky.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCliFramework.definitionsMod.TextFootnote
  - typingsSlinky.ionicCliFramework.definitionsMod.LinkFootnote
*/
trait Footnote extends StObject
object Footnote {
  
  @scala.inline
  def LinkFootnote(id: String | Double, url: String): typingsSlinky.ionicCliFramework.definitionsMod.LinkFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionicCliFramework.definitionsMod.LinkFootnote]
  }
  
  @scala.inline
  def TextFootnote(id: String | Double, text: String): typingsSlinky.ionicCliFramework.definitionsMod.TextFootnote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ionicCliFramework.definitionsMod.TextFootnote]
  }
}
