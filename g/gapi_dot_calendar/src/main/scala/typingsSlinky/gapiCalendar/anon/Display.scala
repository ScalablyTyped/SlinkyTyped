package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typingsSlinky.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Display extends StObject {
  
  var display: js.UndefOr[GadgetDisplayMode] = js.native
  
  var height: integer = js.native
  
  var iconLink: String = js.native
  
  var link: String = js.native
  
  def preferences(key: String): String = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var width: integer = js.native
}
object Display {
  
  @scala.inline
  def apply(
    height: integer,
    iconLink: String,
    link: String,
    preferences: String => String,
    title: String,
    `type`: String,
    width: integer
  ): Display = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], preferences = js.Any.fromFunction1(preferences), title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit class DisplayMutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: GadgetDisplayMode): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferences(value: String => String): Self = StObject.set(x, "preferences", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
