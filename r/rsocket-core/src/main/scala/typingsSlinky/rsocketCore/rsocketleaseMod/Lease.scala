package typingsSlinky.rsocketCore.rsocketleaseMod

import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.Encodable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/RSocketLease", "Lease")
@js.native
class Lease protected () extends js.Object {
  def this(timeToLiveMillis: Double, allowedRequests: Double) = this()
  def this(timeToLiveMillis: Double, allowedRequests: Double, metadata: Encodable) = this()
  
  var allowedRequests: Double = js.native
  
  def expired(): Boolean = js.native
  
  var expiry: Double = js.native
  
  var metadata: js.UndefOr[Encodable] = js.native
  
  var startingAllowedRequests: Double = js.native
  
  var timeToLiveMillis: Double = js.native
  
  def valid(): Boolean = js.native
}
