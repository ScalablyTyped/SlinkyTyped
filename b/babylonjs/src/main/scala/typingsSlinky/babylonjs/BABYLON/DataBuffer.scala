package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataBuffer extends js.Object {
  /** Gets or sets the size of the underlying buffer */
  var capacity: Double = js.native
  /**
    * Gets or sets a boolean indicating if the buffer contains 32bits indices
    */
  var is32Bits: Boolean = js.native
  /**
    * Gets or sets the number of objects referencing this buffer
    */
  var references: Double = js.native
  /**
    * Gets the underlying buffer
    */
  def underlyingResource: js.Any = js.native
}

object DataBuffer {
  @scala.inline
  def apply(capacity: Double, is32Bits: Boolean, references: Double, underlyingResource: () => js.Any): DataBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    __obj.asInstanceOf[DataBuffer]
  }
  @scala.inline
  implicit class DataBufferOps[Self <: DataBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs32Bits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is32Bits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlyingResource(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlyingResource")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

