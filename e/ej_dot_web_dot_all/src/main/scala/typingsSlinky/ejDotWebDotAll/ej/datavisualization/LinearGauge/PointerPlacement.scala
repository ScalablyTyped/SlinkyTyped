package typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
@js.native
object PointerPlacement extends js.Object {
  //string
  @js.native
  sealed trait Center extends PointerPlacement
  
  //string
  @js.native
  sealed trait Far extends PointerPlacement
  
  //string
  @js.native
  sealed trait Near extends PointerPlacement
  
  /* 2 */ val Center: typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.PointerPlacement.Center with Double = js.native
  /* 1 */ val Far: typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.PointerPlacement.Far with Double = js.native
  /* 0 */ val Near: typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.PointerPlacement.Near with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerPlacement with Double] = js.native
}

