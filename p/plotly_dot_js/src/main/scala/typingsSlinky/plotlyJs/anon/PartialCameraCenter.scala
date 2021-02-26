package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Point
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Camera> */
@js.native
trait PartialCameraCenter extends StObject {
  
  var center: js.UndefOr[Partial[Point]] = js.native
  
  var eye: js.UndefOr[Partial[Point]] = js.native
  
  var up: js.UndefOr[Partial[Point]] = js.native
}
object PartialCameraCenter {
  
  @scala.inline
  def apply(): PartialCameraCenter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCameraCenter]
  }
  
  @scala.inline
  implicit class PartialCameraCenterMutableBuilder[Self <: PartialCameraCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Partial[Point]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setEye(value: Partial[Point]): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeUndefined: Self = StObject.set(x, "eye", js.undefined)
    
    @scala.inline
    def setUp(value: Partial[Point]): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
