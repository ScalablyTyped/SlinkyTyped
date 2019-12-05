package typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendShape extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendShape")
@js.native
object LegendShape extends js.Object {
  //string
  @js.native
  sealed trait Circle extends LegendShape
  
  //string
  @js.native
  sealed trait Diamond extends LegendShape
  
  //string
  @js.native
  sealed trait Ellipse extends LegendShape
  
  //string
  @js.native
  sealed trait Line extends LegendShape
  
  //string
  @js.native
  sealed trait Pentagon extends LegendShape
  
  //string
  @js.native
  sealed trait Rectangle extends LegendShape
  
  //string
  @js.native
  sealed trait Slider extends LegendShape
  
  //string
  @js.native
  sealed trait Trapezoid extends LegendShape
  
  //string
  @js.native
  sealed trait Triangle extends LegendShape
  
  /* 1 */ val Circle: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Circle with Double = js.native
  /* 4 */ val Diamond: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Diamond with Double = js.native
  /* 3 */ val Ellipse: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Ellipse with Double = js.native
  /* 8 */ val Line: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Line with Double = js.native
  /* 5 */ val Pentagon: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Pentagon with Double = js.native
  /* 0 */ val Rectangle: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Rectangle with Double = js.native
  /* 6 */ val Slider: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Slider with Double = js.native
  /* 7 */ val Trapezoid: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Trapezoid with Double = js.native
  /* 2 */ val Triangle: typingsSlinky.ejDotWebDotAll.ej.datavisualization.CircularGauge.LegendShape.Triangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendShape with Double] = js.native
}

