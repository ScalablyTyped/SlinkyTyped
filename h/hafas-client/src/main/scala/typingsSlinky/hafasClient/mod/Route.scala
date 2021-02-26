package typingsSlinky.hafasClient.mod

import typingsSlinky.hafasClient.hafasClientStrings.aircraft
import typingsSlinky.hafasClient.hafasClientStrings.bicycle
import typingsSlinky.hafasClient.hafasClientStrings.bus
import typingsSlinky.hafasClient.hafasClientStrings.car
import typingsSlinky.hafasClient.hafasClientStrings.gondola
import typingsSlinky.hafasClient.hafasClientStrings.route
import typingsSlinky.hafasClient.hafasClientStrings.taxi
import typingsSlinky.hafasClient.hafasClientStrings.train
import typingsSlinky.hafasClient.hafasClientStrings.walking
import typingsSlinky.hafasClient.hafasClientStrings.watercraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A route represents a single set of stations, of a single line.
  */
@js.native
trait Route extends StObject {
  
  var id: String = js.native
  
  var line: String = js.native
  
  var mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking = js.native
  
  /** stop ids */
  var stops: js.Array[String] = js.native
  
  var `type`: route = js.native
}
object Route {
  
  @scala.inline
  def apply(
    id: String,
    line: String,
    mode: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking,
    stops: js.Array[String],
    `type`: route
  ): Route = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: train | bus | watercraft | taxi | gondola | aircraft | car | bicycle | walking): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStops(value: js.Array[String]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsVarargs(value: String*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setType(value: route): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
