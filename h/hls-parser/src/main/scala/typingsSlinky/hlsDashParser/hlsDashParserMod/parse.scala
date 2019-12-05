package typingsSlinky.hlsDashParser.hlsDashParserMod

import typingsSlinky.hlsDashParser.hlsDashParserMod.types.MasterPlaylist
import typingsSlinky.hlsDashParser.hlsDashParserMod.types.MediaPlaylist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "parse")
@js.native
object parse extends js.Object {
  def apply(manifest: String): MasterPlaylist | MediaPlaylist = js.native
}

