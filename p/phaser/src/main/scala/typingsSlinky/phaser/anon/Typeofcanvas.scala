package typingsSlinky.phaser.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.spine.canvas.AssetManager
import typingsSlinky.phaser.spine.canvas.CanvasTexture
import typingsSlinky.phaser.spine.canvas.SkeletonRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcanvas extends StObject {
  
  var AssetManager: Instantiable1[
    /* pathPrefix */ js.UndefOr[String], 
    typingsSlinky.phaser.spine.canvas.AssetManager
  ] = js.native
  
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typingsSlinky.phaser.spine.canvas.CanvasTexture] = js.native
  
  var SkeletonRenderer: (Instantiable1[
    /* context */ CanvasRenderingContext2D, 
    typingsSlinky.phaser.spine.canvas.SkeletonRenderer
  ]) with TypeofSkeletonRenderer = js.native
}
object Typeofcanvas {
  
  @scala.inline
  def apply(
    AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager],
    CanvasTexture: Instantiable1[/* image */ HTMLImageElement, CanvasTexture],
    SkeletonRenderer: (Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]) with TypeofSkeletonRenderer
  ): Typeofcanvas = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], CanvasTexture = CanvasTexture.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcanvas]
  }
  
  @scala.inline
  implicit class TypeofcanvasMutableBuilder[Self <: Typeofcanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager]): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasTexture(value: Instantiable1[/* image */ HTMLImageElement, CanvasTexture]): Self = StObject.set(x, "CanvasTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonRenderer(
      value: (Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]) with TypeofSkeletonRenderer
    ): Self = StObject.set(x, "SkeletonRenderer", value.asInstanceOf[js.Any])
  }
}
