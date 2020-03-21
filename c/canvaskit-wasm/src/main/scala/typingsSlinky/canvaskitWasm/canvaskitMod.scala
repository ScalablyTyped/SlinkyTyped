package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.CanvasKitInitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvaskit-wasm/bin/canvaskit", JSImport.Namespace)
@js.native
object canvaskitMod extends js.Object {
  def apply(): CanvasKitInitResult = js.native
}

