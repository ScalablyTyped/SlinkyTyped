package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBuffer extends js.Object {
  var buffer: js.typedarray.Uint8Array = js.native
  var position: Double = js.native
  def get(index: Double): Double = js.native
  def getInt(index: Double): Double = js.native
  def getShort(index: Double): Double = js.native
  def getString(index: Double): String = js.native
  def put(b: Double): Unit = js.native
  def putInt(num: Double): Unit = js.native
  def putShort(num: Double): Unit = js.native
  def putString(str: String): Unit = js.native
  def readInt(): Double = js.native
  def reallocate(): Unit = js.native
  def shrink(): js.typedarray.Uint8Array = js.native
  def size(): Double = js.native
}

object ByteBuffer {
  @scala.inline
  def apply(
    buffer: js.typedarray.Uint8Array,
    get: Double => Double,
    getInt: Double => Double,
    getShort: Double => Double,
    getString: Double => String,
    position: Double,
    put: Double => Unit,
    putInt: Double => Unit,
    putShort: Double => Unit,
    putString: String => Unit,
    readInt: () => Double,
    reallocate: () => Unit,
    shrink: () => js.typedarray.Uint8Array,
    size: () => Double
  ): ByteBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getInt = js.Any.fromFunction1(getInt), getShort = js.Any.fromFunction1(getShort), getString = js.Any.fromFunction1(getString), position = position.asInstanceOf[js.Any], put = js.Any.fromFunction1(put), putInt = js.Any.fromFunction1(putInt), putShort = js.Any.fromFunction1(putShort), putString = js.Any.fromFunction1(putString), readInt = js.Any.fromFunction0(readInt), reallocate = js.Any.fromFunction0(reallocate), shrink = js.Any.fromFunction0(shrink), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ByteBuffer]
  }
  @scala.inline
  implicit class ByteBufferOps[Self <: ByteBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetInt(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetShort(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPut(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutInt(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putInt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutShort(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putShort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutString(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadInt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReallocate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reallocate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShrink(value: () => js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

