package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInTransit extends js.Object {
  /**
    * 
    Indicates the encryption setting for data in transit between clients and brokers. The following are the possible values.
    
    TLS means that client-broker communication is enabled with TLS only.
    
    TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext data.
    
    PLAINTEXT means that client-broker communication is enabled in plaintext only.
    The default value is TLS_PLAINTEXT.
    
    */
  var ClientBroker: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.ClientBroker] = js.native
  /**
    * 
    When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When set to false, the communication happens in plaintext.
    The default value is true.
    
    */
  var InCluster: js.UndefOr[boolean] = js.native
}

object EncryptionInTransit {
  @scala.inline
  def apply(): EncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInTransit]
  }
  @scala.inline
  implicit class EncryptionInTransitOps[Self <: EncryptionInTransit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientBroker(value: ClientBroker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientBroker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientBroker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientBroker")(js.undefined)
        ret
    }
    @scala.inline
    def withInCluster(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InCluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InCluster")(js.undefined)
        ret
    }
  }
  
}

