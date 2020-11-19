package typingsSlinky.phaser.global.spine

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.canvas")
@js.native
object canvas extends js.Object {
  
  @js.native
  class AssetManager ()
    extends typingsSlinky.phaser.spine.AssetManager {
    def this(pathPrefix: String) = this()
  }
  
  @js.native
  class CanvasTexture protected ()
    extends typingsSlinky.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
  }
  
  @js.native
  class SkeletonRenderer protected ()
    extends typingsSlinky.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
  }
  /* static members */
  @js.native
  object SkeletonRenderer extends js.Object {
    
    var QUAD_TRIANGLES: js.Array[Double] = js.native
    
    var VERTEX_SIZE: Double = js.native
  }
}
