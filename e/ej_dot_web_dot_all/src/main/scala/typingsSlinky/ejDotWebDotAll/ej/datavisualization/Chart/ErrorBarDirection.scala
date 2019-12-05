package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarDirection extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarDirection")
@js.native
object ErrorBarDirection extends js.Object {
  //string
  @js.native
  sealed trait Both extends ErrorBarDirection
  
  //string
  @js.native
  sealed trait Minus extends ErrorBarDirection
  
  //string
  @js.native
  sealed trait Plus extends ErrorBarDirection
  
  /* 0 */ val Both: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Both with Double = js.native
  /* 2 */ val Minus: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Minus with Double = js.native
  /* 1 */ val Plus: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.ErrorBarDirection.Plus with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarDirection with Double] = js.native
}

