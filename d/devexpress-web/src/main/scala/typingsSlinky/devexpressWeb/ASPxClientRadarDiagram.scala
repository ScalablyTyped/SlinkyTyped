package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the RadarDiagram class.
  */
@js.native
trait ASPxClientRadarDiagram extends ASPxClientXYDiagramBase {
  
  /**
    * Converts the diagram coordinates of a point into screen coordinates. An ASPxClientControlCoordinates object, containing information about the point's X and Y coordinates, its visibility state, and the associated pane.
    * @param argument An object, representing the point's argument.
    * @param value An object, representing the point's value.
    */
  def DiagramToPoint(argument: js.Any, value: js.Any): ASPxClientControlCoordinates = js.native
  
  /**
    * Converts the display coordinates into a diagram coordinates object. An ASPxClientDiagramCoordinates object, containing information about the point's argument and value, their scale types, associated axes and pane.
    * @param x An integer value, representing the X-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    * @param y An integer value, representing the Y-coordinate of a point (measured in pixels relative to the top left corner of a chart).
    */
  def PointToDiagram(x: Double, y: Double): ASPxClientDiagramCoordinates = js.native
}
object ASPxClientRadarDiagram {
  
  @scala.inline
  def apply(
    DiagramToPoint: (js.Any, js.Any) => ASPxClientControlCoordinates,
    PointToDiagram: (Double, Double) => ASPxClientDiagramCoordinates,
    axisX: ASPxClientAxisBase,
    axisY: ASPxClientAxisBase,
    chart: ASPxClientWebChart
  ): ASPxClientRadarDiagram = {
    val __obj = js.Dynamic.literal(DiagramToPoint = js.Any.fromFunction2(DiagramToPoint), PointToDiagram = js.Any.fromFunction2(PointToDiagram), axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRadarDiagram]
  }
  
  @scala.inline
  implicit class ASPxClientRadarDiagramMutableBuilder[Self <: ASPxClientRadarDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagramToPoint(value: (js.Any, js.Any) => ASPxClientControlCoordinates): Self = StObject.set(x, "DiagramToPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointToDiagram(value: (Double, Double) => ASPxClientDiagramCoordinates): Self = StObject.set(x, "PointToDiagram", js.Any.fromFunction2(value))
  }
}
