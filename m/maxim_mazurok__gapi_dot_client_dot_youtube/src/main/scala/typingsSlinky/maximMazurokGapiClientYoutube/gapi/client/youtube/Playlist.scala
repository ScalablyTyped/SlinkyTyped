package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Playlist extends StObject {
  
  /** The contentDetails object contains information like video count. */
  var contentDetails: js.UndefOr[PlaylistContentDetails] = js.native
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify the playlist. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlist". */
  var kind: js.UndefOr[String] = js.native
  
  /** Localizations for different languages */
  var localizations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.PlaylistLocalization}
    */ typingsSlinky.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Playlist with TopLevel[js.Any]
  ] = js.native
  
  /** The player object contains information that you would use to play the playlist in an embedded player. */
  var player: js.UndefOr[PlaylistPlayer] = js.native
  
  /** The snippet object contains basic details about the playlist, such as its title and description. */
  var snippet: js.UndefOr[PlaylistSnippet] = js.native
  
  /** The status object contains status information for the playlist. */
  var status: js.UndefOr[PlaylistStatus] = js.native
}
object Playlist {
  
  @scala.inline
  def apply(): Playlist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Playlist]
  }
  
  @scala.inline
  implicit class PlaylistMutableBuilder[Self <: Playlist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: PlaylistContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalizations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.youtube.gapi.client.youtube.PlaylistLocalization}
      */ typingsSlinky.maximMazurokGapiClientYoutube.maximMazurokGapiClientYoutubeStrings.Playlist with TopLevel[js.Any]
    ): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setPlayer(value: PlaylistPlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
    
    @scala.inline
    def setSnippet(value: PlaylistSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatus(value: PlaylistStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
