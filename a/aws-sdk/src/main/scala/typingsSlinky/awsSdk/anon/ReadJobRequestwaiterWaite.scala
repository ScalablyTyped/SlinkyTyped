package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.elastictranscoderMod.Id
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elastictranscoder.ReadJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait ReadJobRequestwaiterWaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: typingsSlinky.awsSdk.elastictranscoderMod.Id = js.native
}

object ReadJobRequestwaiterWaite {
  @scala.inline
  def apply(Id: Id, $waiter: WaiterConfiguration = null): ReadJobRequestwaiterWaite = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobRequestwaiterWaite]
  }
}

