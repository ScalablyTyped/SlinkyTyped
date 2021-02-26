package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new audio item.
  */
@js.native
trait INewAudio extends StObject {
  
  /**
    * The audio's album name.
    */
  var album: js.UndefOr[String] = js.native
  
  /**
    * The artist name of the audio's album.
    */
  var album_artist: js.UndefOr[String] = js.native
  
  /**
    * The audio's artist name.
    */
  var artist: js.UndefOr[String] = js.native
  
  /**
    * A description of the audio.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The audio's genre.
    */
  var genre: js.UndefOr[String] = js.native
  
  /**
    * The name of the audio.
    */
  var name: String = js.native
  
  /**
    * The audio's title.
    */
  var title: js.UndefOr[String] = js.native
}
object INewAudio {
  
  @scala.inline
  def apply(name: String): INewAudio = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewAudio]
  }
  
  @scala.inline
  implicit class INewAudioMutableBuilder[Self <: INewAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
    
    @scala.inline
    def setAlbum_artist(value: String): Self = StObject.set(x, "album_artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlbum_artistUndefined: Self = StObject.set(x, "album_artist", js.undefined)
    
    @scala.inline
    def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtistUndefined: Self = StObject.set(x, "artist", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
