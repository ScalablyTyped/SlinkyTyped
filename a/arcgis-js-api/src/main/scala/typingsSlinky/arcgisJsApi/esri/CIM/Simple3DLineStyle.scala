package typingsSlinky.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Simple3DLineStyle extends js.Object
@JSGlobal("__esri.CIM.Simple3DLineStyle")
@js.native
object Simple3DLineStyle extends js.Object {
  
  /**
    * Stroke draws flat upon the surface.
    */
  @js.native
  sealed trait Strip extends Simple3DLineStyle
  
  /**
    * Stroke draws as a tube where the width determines the diameter of the tube.
    */
  @js.native
  sealed trait Tube extends Simple3DLineStyle
  
  /**
    * Stroke is vertically oriented where Width determines the height of the wall.
    */
  @js.native
  sealed trait Wall extends Simple3DLineStyle
}
