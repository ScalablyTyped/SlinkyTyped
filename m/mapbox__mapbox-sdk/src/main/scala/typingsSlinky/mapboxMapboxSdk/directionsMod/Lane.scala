package typingsSlinky.mapboxMapboxSdk.directionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lane extends StObject {
  
  /**
    * Array of signs for each turn lane. There can be multiple signs. For example, a turning lane can have a sign with an arrow pointing left and another sign with an arrow pointing straight.
    */
  var indications: js.Array[String] = js.native
  
  /**
    * Boolean value for whether this lane can be taken to complete the maneuver. For instance, if the lane array has four objects and the
    * first two are marked as valid, then the driver can take either of the left lanes and stay on the route.
    */
  var valid: Boolean = js.native
}
object Lane {
  
  @scala.inline
  def apply(indications: js.Array[String], valid: Boolean): Lane = {
    val __obj = js.Dynamic.literal(indications = indications.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  
  @scala.inline
  implicit class LaneMutableBuilder[Self <: Lane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndications(value: js.Array[String]): Self = StObject.set(x, "indications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicationsVarargs(value: String*): Self = StObject.set(x, "indications", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
