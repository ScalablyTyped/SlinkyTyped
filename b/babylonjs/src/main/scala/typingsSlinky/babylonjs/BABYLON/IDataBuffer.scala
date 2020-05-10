package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBuffer extends js.Object {
  /**
    * The byte length of the buffer.
    */
  val byteLength: Double = js.native
  /**
    * Reads bytes from the data buffer.
    * @param byteOffset The byte offset to read
    * @param byteLength The byte length to read
    * @returns A promise that resolves when the bytes are read
    */
  def readAsync(byteOffset: Double, byteLength: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
}

object IDataBuffer {
  @scala.inline
  def apply(byteLength: Double, readAsync: (Double, Double) => js.Promise[js.typedarray.ArrayBufferView]): IDataBuffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], readAsync = js.Any.fromFunction2(readAsync))
    __obj.asInstanceOf[IDataBuffer]
  }
  @scala.inline
  implicit class IDataBufferOps[Self <: IDataBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAsync(value: (Double, Double) => js.Promise[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

