package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPlaylistPlayer extends StObject {
  
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the playlist.
    */
  var embedHtml: js.UndefOr[String] = js.native
}
object SchemaPlaylistPlayer {
  
  @scala.inline
  def apply(): SchemaPlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistPlayer]
  }
  
  @scala.inline
  implicit class SchemaPlaylistPlayerMutableBuilder[Self <: SchemaPlaylistPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
  }
}
