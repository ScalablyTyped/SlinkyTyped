package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveRoute extends StObject {
  
  var distance: Double = js.native
  
  var policy: String = js.native
  
  var steps: js.Array[DriveStep] = js.native
  
  var time: Double = js.native
  
  var tolls: Double = js.native
  
  var tolls_distance: Double = js.native
}
object DriveRoute {
  
  @scala.inline
  def apply(
    distance: Double,
    policy: String,
    steps: js.Array[DriveStep],
    time: Double,
    tolls: Double,
    tolls_distance: Double
  ): DriveRoute = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tolls = tolls.asInstanceOf[js.Any], tolls_distance = tolls_distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveRoute]
  }
  
  @scala.inline
  implicit class DriveRouteMutableBuilder[Self <: DriveRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[DriveStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: DriveStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls(value: Double): Self = StObject.set(x, "tolls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTolls_distance(value: Double): Self = StObject.set(x, "tolls_distance", value.asInstanceOf[js.Any])
  }
}
