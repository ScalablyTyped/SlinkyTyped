package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SplineType extends js.Object
@JSGlobal("ej.datavisualization.Chart.SplineType")
@js.native
object SplineType extends js.Object {
  
  //string
  @js.native
  sealed trait Cardinal extends SplineType
  
  //string
  @js.native
  sealed trait Clamped extends SplineType
  
  //string
  @js.native
  sealed trait Monotonic extends SplineType
  
  //string
  @js.native
  sealed trait Natural extends SplineType
}
