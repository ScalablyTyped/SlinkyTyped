package typingsSlinky.captureConsole.mod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("capture-console", "startCapture")
@js.native
object startCapture extends js.Object {
  
  def apply(
    stream: WritableStream,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): Boolean = js.native
  def apply(
    stream: WritableStream,
    opts: CaptureOptions,
    exec: js.Function3[
      /* string */ String, 
      /* encoding */ js.UndefOr[String], 
      /* fd */ js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], Unit]], 
      Unit
    ]
  ): Boolean = js.native
}
