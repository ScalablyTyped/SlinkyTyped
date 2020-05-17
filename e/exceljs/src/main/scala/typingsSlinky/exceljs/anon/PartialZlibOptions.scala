package typingsSlinky.exceljs.anon

import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.ZlibOptions> */
@js.native
trait PartialZlibOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var dictionary: js.UndefOr[js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView] = js.native
  var finishFlush: js.UndefOr[Double] = js.native
  var flush: js.UndefOr[Double] = js.native
  var level: js.UndefOr[Double] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var strategy: js.UndefOr[Double] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object PartialZlibOptions {
  @scala.inline
  def apply(): PartialZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialZlibOptions]
  }
  @scala.inline
  implicit class PartialZlibOptionsOps[Self <: PartialZlibOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionaryUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryDataView(value: js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionary(value: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionaryInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withFlush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMemLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowBits")(js.undefined)
        ret
    }
  }
  
}

