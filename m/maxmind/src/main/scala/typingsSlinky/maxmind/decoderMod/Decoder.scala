package typingsSlinky.maxmind.decoderMod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decoder extends js.Object {
  var baseOffset: js.Any = js.native
  var cache: js.Any = js.native
  var db: js.Any = js.native
  var telemetry: Record[String, _] = js.native
  def decode(offset: Double): js.Any = js.native
  def decodeArray(size: Double, offset: Double): Cursor = js.native
  def decodeBigUint(offset: Double, size: Double): String = js.native
  def decodeBoolean(size: Double): Boolean = js.native
  def decodeByType(`type`: String, offset: Double, size: Double): Cursor = js.native
  def decodeBytes(offset: Double, size: Double): Buffer = js.native
  def decodeDouble(offset: Double): Double = js.native
  def decodeFast(offset: Double): js.Any = js.native
  def decodeFloat(offset: Double): Double = js.native
  def decodeInt32(offset: Double, size: Double): Double = js.native
  def decodeMap(size: Double, offset: Double): Cursor = js.native
  def decodePointer(ctrlByte: Double, offset: Double): Cursor = js.native
  def decodeString(offset: Double, size: Double): js.Any = js.native
  def decodeUint(offset: Double, size: Double): String | Double = js.native
  def sizeFromCtrlByte(ctrlByte: Double, offset: Double): Cursor = js.native
}

object Decoder {
  @scala.inline
  def apply(
    baseOffset: js.Any,
    cache: js.Any,
    db: js.Any,
    decode: Double => js.Any,
    decodeArray: (Double, Double) => Cursor,
    decodeBigUint: (Double, Double) => String,
    decodeBoolean: Double => Boolean,
    decodeByType: (String, Double, Double) => Cursor,
    decodeBytes: (Double, Double) => Buffer,
    decodeDouble: Double => Double,
    decodeFast: Double => js.Any,
    decodeFloat: Double => Double,
    decodeInt32: (Double, Double) => Double,
    decodeMap: (Double, Double) => Cursor,
    decodePointer: (Double, Double) => Cursor,
    decodeString: (Double, Double) => js.Any,
    decodeUint: (Double, Double) => String | Double,
    sizeFromCtrlByte: (Double, Double) => Cursor,
    telemetry: Record[String, _]
  ): Decoder = {
    val __obj = js.Dynamic.literal(baseOffset = baseOffset.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), decodeArray = js.Any.fromFunction2(decodeArray), decodeBigUint = js.Any.fromFunction2(decodeBigUint), decodeBoolean = js.Any.fromFunction1(decodeBoolean), decodeByType = js.Any.fromFunction3(decodeByType), decodeBytes = js.Any.fromFunction2(decodeBytes), decodeDouble = js.Any.fromFunction1(decodeDouble), decodeFast = js.Any.fromFunction1(decodeFast), decodeFloat = js.Any.fromFunction1(decodeFloat), decodeInt32 = js.Any.fromFunction2(decodeInt32), decodeMap = js.Any.fromFunction2(decodeMap), decodePointer = js.Any.fromFunction2(decodePointer), decodeString = js.Any.fromFunction2(decodeString), decodeUint = js.Any.fromFunction2(decodeUint), sizeFromCtrlByte = js.Any.fromFunction2(sizeFromCtrlByte), telemetry = telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decoder]
  }
  @scala.inline
  implicit class DecoderOps[Self <: Decoder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecode(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeArray(value: (Double, Double) => Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeArray")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeBigUint(value: (Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeBigUint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeBoolean(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeBoolean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeByType(value: (String, Double, Double) => Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeByType")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDecodeBytes(value: (Double, Double) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeBytes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeDouble(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeFast(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeFloat(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeFloat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeInt32(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeInt32")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeMap(value: (Double, Double) => Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeMap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodePointer(value: (Double, Double) => Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePointer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeString(value: (Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeString")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDecodeUint(value: (Double, Double) => String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeUint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSizeFromCtrlByte(value: (Double, Double) => Cursor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeFromCtrlByte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTelemetry(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

