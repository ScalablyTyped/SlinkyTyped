package typingsSlinky.bmapgl.global

import typingsSlinky.bmapgl.BMapGL.DistanceToolOptions
import typingsSlinky.bmapgl.BMapGL.DrawingManagerOptions
import typingsSlinky.bmapgl.BMapGL.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGLLib")
@js.native
object BMapGLLib extends js.Object {
  
  @js.native
  class DistanceTool protected ()
    extends typingsSlinky.bmapgl.BMapGLLib.DistanceTool {
    def this(map: Map) = this()
    def this(map: Map, opts: DistanceToolOptions) = this()
  }
  
  @js.native
  class DrawingManager protected ()
    extends typingsSlinky.bmapgl.BMapGLLib.DrawingManager {
    def this(map: Map) = this()
    def this(map: Map, opts: DrawingManagerOptions) = this()
  }
}
