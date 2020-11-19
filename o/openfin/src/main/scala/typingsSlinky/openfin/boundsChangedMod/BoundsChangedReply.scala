package typingsSlinky.openfin.boundsChangedMod

import typingsSlinky.openfin.baseMod.Reply
import typingsSlinky.openfin.openfinStrings.`bounds-changed`
import typingsSlinky.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundsChangedReply extends Reply[window, `bounds-changed`] {
  
  var changeType: BoundsChangeType = js.native
  
  var deferred: Boolean = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
