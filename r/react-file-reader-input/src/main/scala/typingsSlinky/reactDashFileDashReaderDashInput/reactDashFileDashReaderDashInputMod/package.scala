package typingsSlinky.reactDashFileDashReaderDashInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashFileDashReaderDashInputMod {
  import org.scalajs.dom.raw.File
  import org.scalajs.dom.raw.ProgressEvent
  import slinky.core.ReactComponentClass

  type FileInput = ReactComponentClass[Props]
  type Result = js.Tuple2[ProgressEvent, File]
}
