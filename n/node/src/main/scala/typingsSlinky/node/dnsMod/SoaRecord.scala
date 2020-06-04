package typingsSlinky.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoaRecord extends js.Object {
  var expire: Double
  var hostmaster: String
  var minttl: Double
  var nsname: String
  var refresh: Double
  var retry: Double
  var serial: Double
}

object SoaRecord {
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): SoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoaRecord]
  }
  @scala.inline
  implicit class SoaRecordOps[Self <: SoaRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostmaster(value: String): Self = this.set("hostmaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinttl(value: Double): Self = this.set("minttl", value.asInstanceOf[js.Any])
    @scala.inline
    def setNsname(value: String): Self = this.set("nsname", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: Double): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: Double): Self = this.set("serial", value.asInstanceOf[js.Any])
  }
  
}

