package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionInfo extends js.Object {
  /**
    * 
    The data-volume encryption details.
    
    */
  var EncryptionAtRest: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EncryptionAtRest] = js.native
  /**
    * 
    The details for encryption in transit.
    
    */
  var EncryptionInTransit: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.EncryptionInTransit] = js.native
}

object EncryptionInfo {
  @scala.inline
  def apply(): EncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionInfo]
  }
  @scala.inline
  implicit class EncryptionInfoOps[Self <: EncryptionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionAtRest(value: EncryptionAtRest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionAtRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionAtRest")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInTransit(value: EncryptionInTransit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInTransit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionInTransit")(js.undefined)
        ret
    }
  }
  
}

