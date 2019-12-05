package typingsSlinky.fluentDashFfmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashFfmpegMod {
  import org.scalablytyped.runtime.StringDictionary

  type Codecs = StringDictionary[Codec]
  type CodecsCallback = js.Function2[/* err */ js.Error, /* codecs */ Codecs, Unit]
  type Encoders = StringDictionary[Encoder]
  type EncodersCallback = js.Function2[/* err */ js.Error, /* encoders */ Encoders, Unit]
  type Filters = StringDictionary[Filter]
  type FiltersCallback = js.Function2[/* err */ js.Error, /* filters */ Filters, Unit]
  type Formats = StringDictionary[Format]
  type FormatsCallback = js.Function2[/* err */ js.Error, /* formats */ Formats, Unit]
  type GetPreset = js.Function1[/* command */ FfmpegCommand, String]
}
