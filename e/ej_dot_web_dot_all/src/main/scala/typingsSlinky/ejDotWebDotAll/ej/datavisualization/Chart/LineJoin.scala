package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineJoin extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineJoin")
@js.native
object LineJoin extends js.Object {
  //string
  @js.native
  sealed trait Bevel extends LineJoin
  
  //string
  @js.native
  sealed trait Miter extends LineJoin
  
  //string
  @js.native
  sealed trait Round extends LineJoin
  
  /* 1 */ val Bevel: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.LineJoin.Bevel with Double = js.native
  /* 2 */ val Miter: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.LineJoin.Miter with Double = js.native
  /* 0 */ val Round: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.LineJoin.Round with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineJoin with Double] = js.native
}

