package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/song/relationships
@js.native
trait SongRelationships extends StObject {
  
  var albums: Relationship[Album] = js.native
  
  var artists: Relationship[Artist] = js.native
  
  var genres: js.UndefOr[Relationship[Genre]] = js.native
  
  var station: js.UndefOr[Data] = js.native
}
object SongRelationships {
  
  @scala.inline
  def apply(albums: Relationship[Album], artists: Relationship[Artist]): SongRelationships = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongRelationships]
  }
  
  @scala.inline
  implicit class SongRelationshipsMutableBuilder[Self <: SongRelationships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbums(value: Relationship[Album]): Self = StObject.set(x, "albums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtists(value: Relationship[Artist]): Self = StObject.set(x, "artists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenres(value: Relationship[Genre]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    @scala.inline
    def setStation(value: Data): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationUndefined: Self = StObject.set(x, "station", js.undefined)
  }
}
