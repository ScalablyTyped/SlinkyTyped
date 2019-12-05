package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Column
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Line
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  /* 0 */ val Area: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Area with Double = js.native
  /* 2 */ val Column: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Column with Double = js.native
  /* 1 */ val Line: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Line with Double = js.native
  /* 3 */ val Pie: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Pie with Double = js.native
  /* 4 */ val WinLoss: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.WinLoss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.ejDotWebDotAll.ej.datavisualization.Sparkline.Type with Double] = js.native
}

