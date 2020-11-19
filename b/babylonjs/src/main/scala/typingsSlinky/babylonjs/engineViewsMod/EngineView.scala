package typingsSlinky.babylonjs.engineViewsMod

import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.cameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/Extensions/engine.views", "EngineView")
@js.native
class EngineView () extends js.Object {
  
  /** Defines an optional camera used to render the view (will use active camera else) */
  var camera: js.UndefOr[Camera] = js.native
  
  /** Defines the canvas where to render the view */
  var target: HTMLCanvasElement = js.native
}
