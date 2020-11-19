package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelPlacement extends js.Object
@JSGlobal("ej.datavisualization.Chart.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  
  //string
  @js.native
  sealed trait BetweenTicks extends LabelPlacement
  
  //string
  @js.native
  sealed trait OnTicks extends LabelPlacement
}
