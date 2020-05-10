package typingsSlinky.ol.bufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLArrayBuffer extends js.Object {
  def fromArray(array: js.Array[Double]): Unit = js.native
  def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
  def getArray(): js.typedarray.Float32Array | js.typedarray.Uint32Array = js.native
  def getSize(): Double = js.native
  def getType(): Double = js.native
  def getUsage(): Double = js.native
  def ofSize(size: Double): Unit = js.native
}

object WebGLArrayBuffer {
  @scala.inline
  def apply(
    fromArray: js.Array[Double] => Unit,
    fromArrayBuffer: js.typedarray.ArrayBuffer => Unit,
    getArray: () => js.typedarray.Float32Array | js.typedarray.Uint32Array,
    getSize: () => Double,
    getType: () => Double,
    getUsage: () => Double,
    ofSize: Double => Unit
  ): WebGLArrayBuffer = {
    val __obj = js.Dynamic.literal(fromArray = js.Any.fromFunction1(fromArray), fromArrayBuffer = js.Any.fromFunction1(fromArrayBuffer), getArray = js.Any.fromFunction0(getArray), getSize = js.Any.fromFunction0(getSize), getType = js.Any.fromFunction0(getType), getUsage = js.Any.fromFunction0(getUsage), ofSize = js.Any.fromFunction1(ofSize))
    __obj.asInstanceOf[WebGLArrayBuffer]
  }
  @scala.inline
  implicit class WebGLArrayBufferOps[Self <: WebGLArrayBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromArray(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromArray")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromArrayBuffer(value: js.typedarray.ArrayBuffer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromArrayBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetArray(value: () => js.typedarray.Float32Array | js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetType(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUsage(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOfSize(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ofSize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

