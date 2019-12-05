package typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Clockwise
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction
  
  //string
  @js.native
  sealed trait CounterClockwise
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction
  
  /* 0 */ val Clockwise: typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction.Clockwise with Double = js.native
  /* 1 */ val CounterClockwise: typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction.CounterClockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.ejDotWebDotAll.ej.datavisualization.LinearGauge.Direction with Double
  ] = js.native
}

