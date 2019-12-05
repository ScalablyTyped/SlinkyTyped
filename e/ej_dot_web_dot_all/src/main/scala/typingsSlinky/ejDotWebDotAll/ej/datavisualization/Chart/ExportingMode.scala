package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ExportingMode")
@js.native
object ExportingMode extends js.Object {
  //string
  @js.native
  sealed trait ClientSide extends ExportingMode
  
  //string
  @js.native
  sealed trait ServerSide extends ExportingMode
  
  /* 1 */ val ClientSide: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.ExportingMode.ClientSide with Double = js.native
  /* 0 */ val ServerSide: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Chart.ExportingMode.ServerSide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingMode with Double] = js.native
}

