package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ControlCoordinates class.
  */
@js.native
trait ASPxClientControlCoordinates extends StObject {
  
  /**
    * Gets the point's pane.
    */
  var pane: ASPxClientXYDiagramPane = js.native
  
  /**
    * Gets the point's visibility state.
    */
  var visibility: String = js.native
  
  /**
    * Gets the point's X-coordinate, in pixels.
    */
  var x: Double = js.native
  
  /**
    * Gets the point's Y-coordinate, in pixels.
    */
  var y: Double = js.native
}
object ASPxClientControlCoordinates {
  
  @scala.inline
  def apply(pane: ASPxClientXYDiagramPane, visibility: String, x: Double, y: Double): ASPxClientControlCoordinates = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCoordinates]
  }
  
  @scala.inline
  implicit class ASPxClientControlCoordinatesMutableBuilder[Self <: ASPxClientControlCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPane(value: ASPxClientXYDiagramPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
