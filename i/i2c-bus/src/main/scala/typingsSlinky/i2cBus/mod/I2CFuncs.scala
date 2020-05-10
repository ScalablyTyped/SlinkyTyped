package typingsSlinky.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I2CFuncs extends js.Object {
  var i2c: Boolean = js.native
  var protocolMangling: Boolean = js.native
  var smbusBlockProcCall: Boolean = js.native
  var smbusPec: Boolean = js.native
  var smbusProcCall: Boolean = js.native
  var smbusQuick: Boolean = js.native
  var smbusReadBlock: Boolean = js.native
  var smbusReadByte: Boolean = js.native
  var smbusReadI2cBlock: Boolean = js.native
  var smbusReadWord: Boolean = js.native
  var smbusReceiveByte: Boolean = js.native
  var smbusSendByte: Boolean = js.native
  var smbusWriteBlock: Boolean = js.native
  var smbusWriteByte: Boolean = js.native
  var smbusWriteI2cBlock: Boolean = js.native
  var smbusWriteWord: Boolean = js.native
  var tenBitAddr: Boolean = js.native
}

object I2CFuncs {
  @scala.inline
  def apply(
    i2c: Boolean,
    protocolMangling: Boolean,
    smbusBlockProcCall: Boolean,
    smbusPec: Boolean,
    smbusProcCall: Boolean,
    smbusQuick: Boolean,
    smbusReadBlock: Boolean,
    smbusReadByte: Boolean,
    smbusReadI2cBlock: Boolean,
    smbusReadWord: Boolean,
    smbusReceiveByte: Boolean,
    smbusSendByte: Boolean,
    smbusWriteBlock: Boolean,
    smbusWriteByte: Boolean,
    smbusWriteI2cBlock: Boolean,
    smbusWriteWord: Boolean,
    tenBitAddr: Boolean
  ): I2CFuncs = {
    val __obj = js.Dynamic.literal(i2c = i2c.asInstanceOf[js.Any], protocolMangling = protocolMangling.asInstanceOf[js.Any], smbusBlockProcCall = smbusBlockProcCall.asInstanceOf[js.Any], smbusPec = smbusPec.asInstanceOf[js.Any], smbusProcCall = smbusProcCall.asInstanceOf[js.Any], smbusQuick = smbusQuick.asInstanceOf[js.Any], smbusReadBlock = smbusReadBlock.asInstanceOf[js.Any], smbusReadByte = smbusReadByte.asInstanceOf[js.Any], smbusReadI2cBlock = smbusReadI2cBlock.asInstanceOf[js.Any], smbusReadWord = smbusReadWord.asInstanceOf[js.Any], smbusReceiveByte = smbusReceiveByte.asInstanceOf[js.Any], smbusSendByte = smbusSendByte.asInstanceOf[js.Any], smbusWriteBlock = smbusWriteBlock.asInstanceOf[js.Any], smbusWriteByte = smbusWriteByte.asInstanceOf[js.Any], smbusWriteI2cBlock = smbusWriteI2cBlock.asInstanceOf[js.Any], smbusWriteWord = smbusWriteWord.asInstanceOf[js.Any], tenBitAddr = tenBitAddr.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CFuncs]
  }
  @scala.inline
  implicit class I2CFuncsOps[Self <: I2CFuncs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI2c(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i2c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolMangling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolMangling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusBlockProcCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusBlockProcCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusPec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusPec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusProcCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusProcCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusQuick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusQuick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusReadBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusReadBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusReadByte(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusReadByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusReadI2cBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusReadI2cBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusReadWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusReadWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusReceiveByte(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusReceiveByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusSendByte(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusSendByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusWriteBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusWriteBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusWriteByte(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusWriteByte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusWriteI2cBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusWriteI2cBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmbusWriteWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smbusWriteWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenBitAddr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenBitAddr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

