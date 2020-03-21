package typingsSlinky.fluentFfmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Codecs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fluentFfmpeg.mod.Codec]
  type CodecsCallback = js.Function2[/* err */ js.Error, /* codecs */ typingsSlinky.fluentFfmpeg.mod.Codecs, scala.Unit]
  type Encoders = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fluentFfmpeg.mod.Encoder]
  type EncodersCallback = js.Function2[
    /* err */ js.Error, 
    /* encoders */ typingsSlinky.fluentFfmpeg.mod.Encoders, 
    scala.Unit
  ]
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fluentFfmpeg.mod.Filter]
  type FiltersCallback = js.Function2[/* err */ js.Error, /* filters */ typingsSlinky.fluentFfmpeg.mod.Filters, scala.Unit]
  type Formats = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fluentFfmpeg.mod.Format]
  type FormatsCallback = js.Function2[/* err */ js.Error, /* formats */ typingsSlinky.fluentFfmpeg.mod.Formats, scala.Unit]
  type GetPreset = js.Function1[/* command */ typingsSlinky.fluentFfmpeg.mod.FfmpegCommand, java.lang.String]
}
