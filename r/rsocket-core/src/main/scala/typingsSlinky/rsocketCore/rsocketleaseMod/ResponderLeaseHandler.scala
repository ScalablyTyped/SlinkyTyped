package typingsSlinky.rsocketCore.rsocketleaseMod

import typingsSlinky.rsocketFlowable.mod.Flowable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-core/RSocketLease", "ResponderLeaseHandler")
@js.native
class ResponderLeaseHandler protected () extends LeaseHandler {
  def this(leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]]) = this()
  def this(
    leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
    stats: LeaseStats
  ) = this()
  def this(
    leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
    stats: js.UndefOr[scala.Nothing],
    errorConsumer: js.Function1[/* e */ js.Error, Unit]
  ) = this()
  def this(
    leaseSender: js.Function1[/* leaseStats */ js.UndefOr[LeaseStats], Flowable[Lease]],
    stats: LeaseStats,
    errorConsumer: js.Function1[/* e */ js.Error, Unit]
  ) = this()
  
  def send(send: js.Function1[/* lease */ Lease, Unit]): Disposable = js.native
}
