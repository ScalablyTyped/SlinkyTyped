package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistPlayer extends StObject {
  
  /** An <iframe> tag that embeds a player that will play the playlist. */
  var embedHtml: js.UndefOr[String] = js.native
}
object PlaylistPlayer {
  
  @scala.inline
  def apply(): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistPlayer]
  }
  
  @scala.inline
  implicit class PlaylistPlayerMutableBuilder[Self <: PlaylistPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
  }
}
