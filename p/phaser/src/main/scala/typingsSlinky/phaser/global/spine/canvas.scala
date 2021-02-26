package typingsSlinky.phaser.global.spine

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvas {
  
  @JSGlobal("spine.canvas.AssetManager")
  @js.native
  class AssetManager ()
    extends typingsSlinky.phaser.spine.AssetManager {
    def this(pathPrefix: String) = this()
  }
  
  @JSGlobal("spine.canvas.CanvasTexture")
  @js.native
  class CanvasTexture protected ()
    extends typingsSlinky.phaser.spine.canvas.CanvasTexture {
    def this(image: HTMLImageElement) = this()
  }
  
  @JSGlobal("spine.canvas.SkeletonRenderer")
  @js.native
  class SkeletonRenderer protected ()
    extends typingsSlinky.phaser.spine.canvas.SkeletonRenderer {
    def this(context: CanvasRenderingContext2D) = this()
  }
  object SkeletonRenderer {
    
    @JSGlobal("spine.canvas.SkeletonRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.QUAD_TRIANGLES")
    @js.native
    def QUAD_TRIANGLES: js.Array[Double] = js.native
    @scala.inline
    def QUAD_TRIANGLES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUAD_TRIANGLES")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("spine.canvas.SkeletonRenderer.VERTEX_SIZE")
    @js.native
    def VERTEX_SIZE: Double = js.native
    @scala.inline
    def VERTEX_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_SIZE")(x.asInstanceOf[js.Any])
  }
}
