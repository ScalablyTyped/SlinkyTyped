package typingsSlinky.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ffmpegMod {
  import typingsSlinky.ffmpeg.Anon_Album
  import typingsSlinky.ffmpeg.Anon_Audiocodecid
  import typingsSlinky.ffmpeg.Anon_Author
  import typingsSlinky.ffmpeg.Anon_C
  import typingsSlinky.ffmpeg.Anon_Durationtime
  import typingsSlinky.ffmpeg.Anon_IARL
  import typingsSlinky.std.Partial

  type AVIMetadata = Partial[Anon_IARL]
  type FLVMetadata = Partial[Anon_Audiocodecid]
  type FrameToJPGSettings = Partial[Anon_Durationtime]
  type SaveCallback = js.Function2[/* err */ js.Error, /* files */ String, Unit]
  type StandardVideoMetadata = Partial[Anon_Album]
  type WMVMetadata = Partial[Anon_Author]
  type WatermarkSettings = Partial[Anon_C]
}
