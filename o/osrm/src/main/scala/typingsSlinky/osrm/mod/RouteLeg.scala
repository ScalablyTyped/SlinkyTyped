package typingsSlinky.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a route between two waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#routeleg-object
  */
@js.native
trait RouteLeg extends StObject {
  
  /**
    * Additional details about each coordinate along the route geometry:
    * - true: An Annotation object containing node ids, durations distances and
    * - false: weights undefined
    */
  var annotation: Annotation = js.native
  
  /**
    * The distance traveled by this route leg, in float meters.
    */
  var distance: Double = js.native
  
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double = js.native
  
  /**
    * Depends on the steps parameter.
    * - true: array of RouteStep objects describing the turn-by-turn instructions
    * - false: empty array
    */
  var steps: js.Array[RouteStep] = js.native
  
  /**
    * Summary of the route taken as string. Depends on the summary parameter:
    * - true: Names of the two major roads used. Can be empty if route is too short.
    * - false: empty string
    */
  var summary: String = js.native
  
  /**
    * The calculated weight of the route leg.
    */
  var weight: Double = js.native
}
object RouteLeg {
  
  @scala.inline
  def apply(
    annotation: Annotation,
    distance: Double,
    duration: Double,
    steps: js.Array[RouteStep],
    summary: String,
    weight: Double
  ): RouteLeg = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLeg]
  }
  
  @scala.inline
  implicit class RouteLegMutableBuilder[Self <: RouteLeg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[RouteStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: RouteStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
