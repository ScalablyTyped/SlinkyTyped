package typingsSlinky.mapsjs.anon

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.mapsjs.mod.geometry
import typingsSlinky.mapsjs.mod.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderBitmap extends StObject {
  
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.native
  
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.native
  
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.native
}
object RenderBitmap {
  
  @scala.inline
  def apply(): RenderBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderBitmap]
  }
  
  @scala.inline
  implicit class RenderBitmapMutableBuilder[Self <: RenderBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderBitmap(
      value: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Unit
    ): Self = StObject.set(x, "renderBitmap", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRenderBitmapUndefined: Self = StObject.set(x, "renderBitmap", js.undefined)
    
    @scala.inline
    def setRenderGeometry(value: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "renderGeometry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderGeometryUndefined: Self = StObject.set(x, "renderGeometry", js.undefined)
    
    @scala.inline
    def setRenderPoint(value: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Unit): Self = StObject.set(x, "renderPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderPointUndefined: Self = StObject.set(x, "renderPoint", js.undefined)
  }
}
