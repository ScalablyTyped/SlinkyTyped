package typingsSlinky.ejDotWebDotAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Column
    extends typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Line
    extends typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type
  
  /* 0 */ val Area: typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type.Area with Double = js.native
  /* 2 */ val Column: typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type.Column with Double = js.native
  /* 1 */ val Line: typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type.Line with Double = js.native
  /* 3 */ val Pie: typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type.Pie with Double = js.native
  /* 4 */ val WinLoss: typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type.WinLoss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.ejDotWebDotAll.ej.Sparkline.Type with Double] = js.native
}

