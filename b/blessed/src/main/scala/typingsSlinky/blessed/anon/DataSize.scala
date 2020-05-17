package typingsSlinky.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSize extends js.Object {
  var boolCount: Double = js.native
  var dataSize: Double = js.native
  var extended: BoolCount = js.native
  var headerSize: Double = js.native
  var magicNumber: Boolean = js.native
  var namesSize: Double = js.native
  var numCount: Double = js.native
  var strCount: Double = js.native
  var strTableSize: Double = js.native
}

object DataSize {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    extended: BoolCount,
    headerSize: Double,
    magicNumber: Boolean,
    namesSize: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): DataSize = {
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], magicNumber = magicNumber.asInstanceOf[js.Any], namesSize = namesSize.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSize]
  }
  @scala.inline
  implicit class DataSizeOps[Self <: DataSize] (val x: Self) extends AnyVal {
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
    def withExtended(value: BoolCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagicNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magicNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamesSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namesSize")(value.asInstanceOf[js.Any])
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

