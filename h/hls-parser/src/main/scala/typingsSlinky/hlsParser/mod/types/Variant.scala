package typingsSlinky.hlsParser.mod.types

import typingsSlinky.hlsParser.AnonAudio
import typingsSlinky.hlsParser.AnonAverageBandwidth
import typingsSlinky.hlsParser.AnonHeight
import typingsSlinky.hlsParser.hlsParserStrings.AUDIO
import typingsSlinky.hlsParser.hlsParserStrings.SUBTITLES
import typingsSlinky.hlsParser.hlsParserStrings.VIDEO
import typingsSlinky.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types.Variant")
@js.native
class Variant protected () extends js.Object {
  def this(properties: AnonAverageBandwidth) = this()
  var audio: js.Array[Rendition[AUDIO]] = js.native
  var averageBandwidth: js.UndefOr[Double] = js.native
  var bandwidth: Double = js.native
  var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
  var codecs: js.UndefOr[String] = js.native
  var currentRenditions: AnonAudio = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hdcpLevel: js.UndefOr[String] = js.native
  var isIFrameOnly: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[AnonHeight] = js.native
  var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
  var uri: String = js.native
  var video: js.Array[Rendition[VIDEO]] = js.native
}

