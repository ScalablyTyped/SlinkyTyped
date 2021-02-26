package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.anon.Name
import typingsSlinky.appleMusicApi.appleMusicApiStrings.genres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/genre
@js.native
trait Genre extends Resource {
  
  var attributes: Name = js.native
  
  @JSName("type")
  var type_Genre: genres = js.native
}
object Genre {
  
  @scala.inline
  def apply(attributes: Name, id: String, `type`: genres): Genre = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
  
  @scala.inline
  implicit class GenreMutableBuilder[Self <: Genre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: genres): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
