package typingsSlinky.hlsParser.mod.types

import typingsSlinky.hlsParser.AnonUri
import typingsSlinky.hlsParser.mod.Byterange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.MediaInitializationSection")
@js.native
class MediaInitializationSection protected () extends js.Object {
  def this(properties: AnonUri) = this()
  var byterange: js.UndefOr[Byterange] = js.native
  var uri: String = js.native
}

