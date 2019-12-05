package typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  //string
  @js.native
  sealed trait Line
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  //string
  @js.native
  sealed trait Spline
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  //string
  @js.native
  sealed trait SplineArea
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  //string
  @js.native
  sealed trait StepArea
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  //string
  @js.native
  sealed trait StepLine
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type
  
  /* 0 */ val Area: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.Area with Double = js.native
  /* 1 */ val Line: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.Line with Double = js.native
  /* 2 */ val Spline: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.Spline with Double = js.native
  /* 4 */ val SplineArea: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.SplineArea with Double = js.native
  /* 3 */ val StepArea: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.StepArea with Double = js.native
  /* 5 */ val StepLine: typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type.StepLine with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.ejDotWebDotAll.ej.datavisualization.RangeNavigator.Type with Double
  ] = js.native
}

