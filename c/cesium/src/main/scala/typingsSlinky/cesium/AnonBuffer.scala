package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuffer extends js.Object {
  var buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
  var childTileMask: js.UndefOr[Double] = js.native
  var createdByUpsampling: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var structure: js.UndefOr[js.Any] = js.native
  var structureelementMultiplier: js.UndefOr[Double] = js.native
  var structureelementsPerHeight: js.UndefOr[Double] = js.native
  var structureheightOffset: js.UndefOr[Double] = js.native
  var structureheightScale: js.UndefOr[Double] = js.native
  var structureisBigEndian: js.UndefOr[Boolean] = js.native
  var structurestride: js.UndefOr[Double] = js.native
  var width: Double = js.native
}

object AnonBuffer {
  @scala.inline
  def apply(
    buffer: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array,
    height: Double,
    width: Double
  ): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
  @scala.inline
  implicit class AnonBufferOps[Self <: AnonBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(
      value: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Float32Array | js.typedarray.Float64Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildTileMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildTileMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTileMask")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByUpsampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByUpsampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUpsampling")(js.undefined)
        ret
    }
    @scala.inline
    def withStructure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureelementMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureelementMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureelementsPerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementsPerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureelementsPerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureelementsPerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureheightOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureheightOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureheightScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureheightScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureheightScale")(js.undefined)
        ret
    }
    @scala.inline
    def withStructureisBigEndian(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureisBigEndian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructureisBigEndian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureisBigEndian")(js.undefined)
        ret
    }
    @scala.inline
    def withStructurestride(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structurestride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructurestride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structurestride")(js.undefined)
        ret
    }
  }
  
}

