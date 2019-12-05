package typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontStyle
  
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Normal extends FontStyle
  
  /* 1 */ val Bold: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Bold with Double = js.native
  /* 2 */ val Italic: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Italic with Double = js.native
  /* 0 */ val Normal: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

