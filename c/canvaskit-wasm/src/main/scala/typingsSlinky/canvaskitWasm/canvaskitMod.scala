package typingsSlinky.canvaskitWasm

import typingsSlinky.canvaskitWasm.mod.CanvasKit
import typingsSlinky.canvaskitWasm.mod.CanvasKitInitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvaskit-wasm/bin/canvaskit", JSImport.Namespace)
@js.native
object canvaskitMod extends js.Object {
  
  def apply(opts: CanvasKitInitOptions): js.Promise[CanvasKit] = js.native
}
