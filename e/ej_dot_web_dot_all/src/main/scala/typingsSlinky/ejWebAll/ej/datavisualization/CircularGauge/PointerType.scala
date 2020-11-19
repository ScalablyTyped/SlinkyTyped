package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerType extends js.Object
@JSGlobal("ej.datavisualization.CircularGauge.PointerType")
@js.native
object PointerType extends js.Object {
  
  //string
  @js.native
  sealed trait Marker extends PointerType
  
  //string
  @js.native
  sealed trait Needle extends PointerType
}
