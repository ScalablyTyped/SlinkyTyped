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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setDictionaryInt8Array(value: js.typedarray.Int8Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryFloat32Array(value: js.typedarray.Float32Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryUint32Array(value: js.typedarray.Uint32Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionary(value: js.typedarray.ArrayBuffer | TypedArray | js.typedarray.DataView): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryInt32Array(value: js.typedarray.Int32Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryUint16Array(value: js.typedarray.Uint16Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryUint8Array(value: js.typedarray.Uint8Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryFloat64Array(value: js.typedarray.Float64Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryDataView(value: js.typedarray.DataView): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionaryInt16Array(value: js.typedarray.Int16Array): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    @scala.inline
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishFlush: Self = this.set("finishFlush", js.undefined)
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
  
}

