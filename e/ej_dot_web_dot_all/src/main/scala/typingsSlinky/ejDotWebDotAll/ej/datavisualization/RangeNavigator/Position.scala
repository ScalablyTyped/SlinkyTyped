package typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.Position")
@js.native
object Position extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends Position
  
  //string
  @js.native
  sealed trait Top extends Position
  
  /* 1 */ val Bottom: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Position.Bottom with Double = js.native
  /* 0 */ val Top: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Position.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

