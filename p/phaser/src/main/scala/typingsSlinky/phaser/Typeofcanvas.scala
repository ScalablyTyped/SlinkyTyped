package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.spine.canvas.AssetManager
import typingsSlinky.phaser.spine.canvas.CanvasTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcanvas extends js.Object {
  var AssetManager: Instantiable1[
    js.UndefOr[/* pathPrefix */ String], 
    typingsSlinky.phaser.spine.canvas.AssetManager
  ]
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typingsSlinky.phaser.spine.canvas.CanvasTexture]
  var SkeletonRenderer: TypeofSkeletonRenderer
}

object Typeofcanvas {
  @scala.inline
  def apply(
    AssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], AssetManager],
    CanvasTexture: Instantiable1[/* image */ HTMLImageElement, CanvasTexture],
    SkeletonRenderer: TypeofSkeletonRenderer
  ): Typeofcanvas = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], CanvasTexture = CanvasTexture.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofcanvas]
  }
}

