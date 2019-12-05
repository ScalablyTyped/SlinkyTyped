package typingsSlinky.hlsDashParser.hlsDashParserMod

import typingsSlinky.hlsDashParser.hlsDashParserMod.types.MasterPlaylist
import typingsSlinky.hlsDashParser.hlsDashParserMod.types.MediaPlaylist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "stringify")
@js.native
object stringify extends js.Object {
  def apply(playlist: MasterPlaylist): String = js.native
  def apply(playlist: MediaPlaylist): String = js.native
}

