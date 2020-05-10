package typingsSlinky.scBroker.scbrokerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCBrokerOptions
  extends /* additionalOptions */ StringDictionary[js.Any] {
  // An ID to associate with this specific instance of SC
  // this may be useful if you are running an SC app on multiple
  // hosts - You can access the instanceId from the Broker object
  // (inside brokerController) - If you don't provide an instanceId,
  // SC will generate a random one (UUID v4)
  var instanceId: js.UndefOr[String] = js.native
  // In milliseconds, the timeout for calling res(err, data) when
  // your sendToWorker, sendToBroker or sendToMaster (IPC) call
  // expects an ACK response from the other process
  // (when callback is provided)
  var ipcAckTimeout: js.UndefOr[Double] = js.native
  // A key which various SC processes will use to interact with
  // scBroker broker processes securely, defaults to a 256 bits
  // cryptographically random hex string
  var secretKey: js.UndefOr[String] = js.native
}

object SCBrokerOptions {
  @scala.inline
  def apply(): SCBrokerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SCBrokerOptions]
  }
  @scala.inline
  implicit class SCBrokerOptionsOps[Self <: SCBrokerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpcAckTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcAckTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpcAckTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipcAckTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
  }
  
}

