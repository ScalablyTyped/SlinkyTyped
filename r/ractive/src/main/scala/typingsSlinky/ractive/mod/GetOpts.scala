package typingsSlinky.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpts extends StObject {
  
  /**
  	 * Whether or not to unwrap the value if it happens to be wrapped, returning the original value. Defaults to true.
  	 */
  var unwrap: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Whether or not to include links and computations in the output. This creates a deep copy of the data, so changing any of it directly will have no effect on the data in Ractive's models. Defaults to true for root data and false everywhere else.
  	 */
  var virtual: js.UndefOr[Boolean] = js.native
}
object GetOpts {
  
  @scala.inline
  def apply(): GetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpts]
  }
  
  @scala.inline
  implicit class GetOptsMutableBuilder[Self <: GetOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnwrap(value: Boolean): Self = StObject.set(x, "unwrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnwrapUndefined: Self = StObject.set(x, "unwrap", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
