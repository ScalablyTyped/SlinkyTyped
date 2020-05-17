package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for accessors for natively-stored mesh data buffers.
  */
@js.native
trait NativeDataBuffer extends DataBuffer {
  /**
    * Accessor value used to identify/retrieve a natively-stored index buffer.
    */
  var nativeIndexBuffer: js.UndefOr[js.Any] = js.native
  /**
    * Accessor value used to identify/retrieve a natively-stored vertex buffer.
    */
  var nativeVertexBuffer: js.UndefOr[js.Any] = js.native
}

object NativeDataBuffer {
  @scala.inline
  def apply(capacity: Double, is32Bits: Boolean, references: Double, underlyingResource: () => js.Any): NativeDataBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], is32Bits = is32Bits.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], underlyingResource = js.Any.fromFunction0(underlyingResource))
    __obj.asInstanceOf[NativeDataBuffer]
  }
  @scala.inline
  implicit class NativeDataBufferOps[Self <: NativeDataBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeIndexBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeIndexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeIndexBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeIndexBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeVertexBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeVertexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeVertexBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeVertexBuffer")(js.undefined)
        ret
    }
  }
  
}

