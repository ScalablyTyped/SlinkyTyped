package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.anon.Playlists
import typingsSlinky.appleMusicApi.anon.Url
import typingsSlinky.appleMusicApi.appleMusicApiStrings.curators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/curator
@js.native
trait Curator extends Resource {
  
  var attributes: js.UndefOr[Url] = js.native
  
  var relationships: js.UndefOr[Playlists] = js.native
  
  @JSName("type")
  var type_Curator: curators = js.native
}
object Curator {
  
  @scala.inline
  def apply(id: String, `type`: curators): Curator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curator]
  }
  
  @scala.inline
  implicit class CuratorMutableBuilder[Self <: Curator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Url): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: Playlists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: curators): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
