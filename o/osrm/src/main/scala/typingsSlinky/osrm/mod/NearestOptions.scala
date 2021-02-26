package typingsSlinky.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Snaps a coordinate to the street network and returns the nearest n matches.
  *
  * Note: coordinates in the general options only supports a single {longitude},{latitude} entry.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#nearest
  */
@js.native
trait NearestOptions extends Options {
  
  /**
    * Number of nearest segments that should be returned. Must be an integer greater than or equal to 1. (optional, default 1)
    */
  var number: js.UndefOr[Double] = js.native
}
object NearestOptions {
  
  @scala.inline
  def apply(): NearestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestOptions]
  }
  
  @scala.inline
  implicit class NearestOptionsMutableBuilder[Self <: NearestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
