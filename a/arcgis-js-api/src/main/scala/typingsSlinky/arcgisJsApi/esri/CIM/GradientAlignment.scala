package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GradientAlignment extends StObject
@JSGlobal("__esri.CIM.GradientAlignment")
@js.native
object GradientAlignment extends StObject {
  
  /**
    * Along line - Distributes the color ramp linearly along the line, following the curvature of the line.
    */
  @js.native
  sealed trait AlongLine extends GradientAlignment
  
  /**
    * Buffered - Distributes the color ramp along the line's geometry from the outside in (similar to the effect of creating a buffer of the line, then using the "buffer" fill type).
    */
  @js.native
  sealed trait Buffered extends GradientAlignment
  
  /**
    * Left - Progresses the color ramp from the line's centerline to the outside edge on the left. The gradient will follow any curvature in the line's geometry.
    */
  @js.native
  sealed trait Left extends GradientAlignment
  
  /**
    * Right - Progresses the color ramp from the line's centerline to the outside edge on the right. The gradient will follow any curvature in the line's geometry.
    */
  @js.native
  sealed trait Right extends GradientAlignment
}
