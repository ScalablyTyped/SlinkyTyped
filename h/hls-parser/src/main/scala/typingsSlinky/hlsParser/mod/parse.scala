package typingsSlinky.hlsParser.mod

import typingsSlinky.hlsParser.mod.types.MasterPlaylist
import typingsSlinky.hlsParser.mod.types.MediaPlaylist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "parse")
@js.native
object parse extends js.Object {
  
  def apply(manifest: String): MasterPlaylist | MediaPlaylist = js.native
}
