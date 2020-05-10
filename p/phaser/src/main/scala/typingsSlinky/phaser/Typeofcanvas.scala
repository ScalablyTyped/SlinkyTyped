package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.spine.canvas.AssetManager
import typingsSlinky.phaser.spine.canvas.CanvasTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcanvas extends js.Object {
  var AssetManager: Instantiable1[
    js.UndefOr[/* pathPrefix */ String], 
    typingsSlinky.phaser.spine.canvas.AssetManager
  ] = js.native
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typingsSlinky.phaser.spine.canvas.CanvasTexture] = js.native
  var SkeletonRenderer: TypeofSkeletonRenderer = js.native
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
  @scala.inline
  implicit class TypeofcanvasOps[Self <: Typeofcanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetManager(value: Instantiable1[js.UndefOr[/* pathPrefix */ String], AssetManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasTexture(value: Instantiable1[/* image */ HTMLImageElement, CanvasTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CanvasTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonRenderer(value: TypeofSkeletonRenderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonRenderer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

