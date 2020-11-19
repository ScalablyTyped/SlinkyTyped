package typingsSlinky.hlsParser.mod.types

import typingsSlinky.hlsParser.anon.BasePlaylistConstructorPrDiscontinuitySequenceBase
import typingsSlinky.hlsParser.hlsParserStrings.EVENT
import typingsSlinky.hlsParser.hlsParserStrings.VOD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "types.MediaPlaylist")
@js.native
class MediaPlaylist protected () extends Playlist {
  def this(properties: BasePlaylistConstructorPrDiscontinuitySequenceBase) = this()
  
  var discontinuitySequenceBase: js.UndefOr[Double] = js.native
  
  var endlist: Boolean = js.native
  
  var isIFrame: Boolean = js.native
  
  var mediaSequenceBase: js.UndefOr[Double] = js.native
  
  var playlistType: js.UndefOr[EVENT | VOD] = js.native
  
  var segments: js.Array[Segment] = js.native
  
  var targetDuration: Double = js.native
}
