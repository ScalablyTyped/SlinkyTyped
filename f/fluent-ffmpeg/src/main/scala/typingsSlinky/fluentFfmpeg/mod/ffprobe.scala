package typingsSlinky.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent-ffmpeg", "ffprobe")
@js.native
object ffprobe extends js.Object {
  
  def apply(file: String, callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
  def apply(
    file: String,
    index: Double,
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def apply(
    file: String,
    index: Double,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def apply(
    file: String,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
}
