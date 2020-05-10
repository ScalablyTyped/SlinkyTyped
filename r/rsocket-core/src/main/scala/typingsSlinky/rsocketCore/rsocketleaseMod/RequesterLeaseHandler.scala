package typingsSlinky.rsocketCore.rsocketleaseMod

import typingsSlinky.rsocketFlowable.mod.Flowable
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketLease", "RequesterLeaseHandler")
@js.native
class RequesterLeaseHandler protected ()
  extends LeaseHandler
     with Disposable {
  def this(leaseReceiver: js.Function1[/* flowable */ Flowable[Lease], Unit]) = this()
  def availability(): Double = js.native
  def receive(frame: LeaseFrame): Unit = js.native
}

