package typingsSlinky.pulumiAws.inputMod.msk

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionInfoEncryptionInTransit extends js.Object {
  /**
    * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS_PLAINTEXT` when `encryptionInTransit` block defined, but `TLS` when `encryptionInTransit` block omitted.
    */
  var clientBroker: js.UndefOr[Input[String]] = js.native
  /**
    * Whether data communication among broker nodes is encrypted. Default value: `true`.
    */
  var inCluster: js.UndefOr[Input[Boolean]] = js.native
}

object ClusterEncryptionInfoEncryptionInTransit {
  @scala.inline
  def apply(): ClusterEncryptionInfoEncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfoEncryptionInTransit]
  }
  @scala.inline
  implicit class ClusterEncryptionInfoEncryptionInTransitOps[Self <: ClusterEncryptionInfoEncryptionInTransit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientBroker(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBroker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientBroker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientBroker")(js.undefined)
        ret
    }
    @scala.inline
    def withInCluster(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inCluster")(js.undefined)
        ret
    }
  }
  
}

