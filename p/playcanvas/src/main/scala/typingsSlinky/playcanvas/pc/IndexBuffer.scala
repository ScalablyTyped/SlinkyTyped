package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.IndexBuffer
  * @classdesc An index buffer is the mechanism via which the application specifies primitive
  * index data to the graphics hardware.
  * @description Creates a new index buffer.
  * @example
  * // Create an index buffer holding 3 16-bit indices
  * // The buffer is marked as static, hinting that the buffer will never be modified
  * var indexBuffer = new pc.IndexBuffer(graphicsDevice, pc.INDEXFORMAT_UINT16, 3, pc.BUFFER_STATIC);
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this index buffer.
  * @param {number} format - The type of each index to be stored in the index buffer (see pc.INDEXFORMAT_*).
  * @param {number} numIndices - The number of indices to be stored in the index buffer.
  * @param {number} [usage] - The usage type of the vertex buffer (see pc.BUFFER_*).
  * @param {ArrayBuffer} [initialData] - Initial data.
  */
@js.native
trait IndexBuffer extends js.Object {
  /**
    * @function
    * @name pc.IndexBuffer#destroy
    * @description Frees resources associated with this index buffer.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.IndexBuffer#getFormat
    * @description Returns the data format of the specified index buffer.
    * @returns {number} The data format of the specified index buffer (see pc.INDEXFORMAT_*).
    */
  def getFormat(): Double = js.native
  /**
    * @function
    * @name pc.IndexBuffer#getNumIndices
    * @description Returns the number of indices stored in the specified index buffer.
    * @returns {number} The number of indices stored in the specified index buffer.
    */
  def getNumIndices(): Double = js.native
  /**
    * @function
    * @name pc.IndexBuffer#lock
    * @description Gives access to the block of memory that stores the buffer's indices.
    * @returns {ArrayBuffer} A contiguous block of memory where index data can be written to.
    */
  def lock(): js.typedarray.ArrayBuffer = js.native
  /**
    * @function
    * @name pc.IndexBuffer#unlock
    * @description Signals that the block of memory returned by a call to the lock function is
    * ready to be given to the graphics hardware. Only unlocked index buffers can be set on the
    * currently active device.
    */
  def unlock(): Unit = js.native
}

object IndexBuffer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getFormat: () => Double,
    getNumIndices: () => Double,
    lock: () => js.typedarray.ArrayBuffer,
    unlock: () => Unit
  ): IndexBuffer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getFormat = js.Any.fromFunction0(getFormat), getNumIndices = js.Any.fromFunction0(getNumIndices), lock = js.Any.fromFunction0(lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[IndexBuffer]
  }
  @scala.inline
  implicit class IndexBufferOps[Self <: IndexBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFormat(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumIndices(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumIndices")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLock(value: () => js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

