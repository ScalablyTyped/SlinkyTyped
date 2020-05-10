package typingsSlinky.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoolCount extends js.Object {
  var boolCount: Double = js.native
  var dataSize: Double = js.native
  var headerSize: Double = js.native
  var lastStrTableOffset: Double = js.native
  var numCount: Double = js.native
  var strCount: Double = js.native
  var strTableSize: Double = js.native
}

object AnonBoolCount {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    headerSize: Double,
    lastStrTableOffset: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): AnonBoolCount = {
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], lastStrTableOffset = lastStrTableOffset.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolCount]
  }
  @scala.inline
  implicit class AnonBoolCountOps[Self <: AnonBoolCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastStrTableOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastStrTableOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrTableSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strTableSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

