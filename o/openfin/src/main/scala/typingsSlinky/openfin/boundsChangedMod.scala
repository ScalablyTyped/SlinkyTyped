package typingsSlinky.openfin

import typingsSlinky.openfin.baseMod.Reply
import typingsSlinky.openfin.openfinNumbers.`0`
import typingsSlinky.openfin.openfinNumbers.`1`
import typingsSlinky.openfin.openfinNumbers.`2`
import typingsSlinky.openfin.openfinStrings.`bounds-changed`
import typingsSlinky.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundsChangedMod {
  
  @JSImport("openfin/_v2/api/window/bounds-changed", JSImport.Default)
  @js.native
  class default () extends BoundsChangedReply
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.openfinNumbers.`0`
    - typingsSlinky.openfin.openfinNumbers.`1`
    - typingsSlinky.openfin.openfinNumbers.`2`
  */
  trait BoundsChangeType extends StObject
  object BoundsChangeType {
    
    @scala.inline
    def POSITION: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def POSITION_AND_SIZE: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def SIZE: `1` = 1.asInstanceOf[`1`]
  }
  
  @js.native
  trait BoundsChangedReply extends Reply[window, `bounds-changed`] {
    
    var changeType: BoundsChangeType = js.native
    
    var deferred: Boolean = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
}
