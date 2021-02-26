package typingsSlinky.figma.mod.global

import typingsSlinky.figma.figmaStrings.BACK
import typingsSlinky.figma.figmaStrings.CLOSE
import typingsSlinky.figma.figmaStrings.NODE
import typingsSlinky.figma.figmaStrings.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.Type
  - typingsSlinky.figma.anon.Url
  - typingsSlinky.figma.anon.DestinationId
*/
trait Action extends StObject
object Action {
  
  @scala.inline
  def DestinationId(navigation: Navigation, preserveScrollPosition: Boolean, `type`: NODE): typingsSlinky.figma.anon.DestinationId = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], preserveScrollPosition = preserveScrollPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.DestinationId]
  }
  
  @scala.inline
  def Type(`type`: BACK | CLOSE): typingsSlinky.figma.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.Type]
  }
  
  @scala.inline
  def Url(`type`: URL, url: String): typingsSlinky.figma.anon.Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.figma.anon.Url]
  }
}
