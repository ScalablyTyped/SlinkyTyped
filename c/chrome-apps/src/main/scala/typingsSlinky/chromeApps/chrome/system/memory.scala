package typingsSlinky.chromeApps.chrome.system

import typingsSlinky.chromeApps.chrome.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////
// System Memory //
///////////////////
/**
  * The chrome.system.memory API.
  * @requires Permissions: 'system.memory'
  * @since Chrome 32.
  */
object memory {
  
  @js.native
  trait MemoryInfo extends StObject {
    
    /** The amount of available capacity, in bytes. */
    var availableCapacity: double = js.native
    
    /** The total amount of physical memory capacity, in bytes. */
    var capacity: double = js.native
  }
  object MemoryInfo {
    
    @scala.inline
    def apply(availableCapacity: double, capacity: double): MemoryInfo = {
      val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryInfo]
    }
    
    @scala.inline
    implicit class MemoryInfoMutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableCapacity(value: double): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacity(value: double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    }
  }
}
