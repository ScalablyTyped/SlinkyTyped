package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.appleMusicApiStrings.playlists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/playlist
@js.native
trait Playlist extends Resource {
  
  var attributes: js.UndefOr[typingsSlinky.appleMusicApi.anon.Artwork] = js.native
  
  var relationships: js.UndefOr[typingsSlinky.appleMusicApi.anon.Curator] = js.native
  
  @JSName("type")
  var type_Playlist: playlists = js.native
}
object Playlist {
  
  @scala.inline
  def apply(id: String, `type`: playlists): Playlist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playlist]
  }
  
  @scala.inline
  implicit class PlaylistMutableBuilder[Self <: Playlist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: typingsSlinky.appleMusicApi.anon.Artwork): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setRelationships(value: typingsSlinky.appleMusicApi.anon.Curator): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setType(value: playlists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
