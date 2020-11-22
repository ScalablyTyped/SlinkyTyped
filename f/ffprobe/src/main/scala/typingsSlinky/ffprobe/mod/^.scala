package typingsSlinky.ffprobe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ffprobe", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(filePath: String, options: Options): js.Promise[FFProbeResult] = js.native
  def apply(
    filePath: String,
    options: Options,
    cb: js.Function2[/* err */ js.Error, /* info */ FFProbeResult, Unit]
  ): Unit = js.native
}
