package typingsSlinky.cesium

import typingsSlinky.cesium.mod.BoundingSphere
import typingsSlinky.cesium.mod.GeometryAttributes
import typingsSlinky.cesium.mod.PrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttributes extends js.Object {
  var attributes: GeometryAttributes = js.native
  var boundingSphere: js.UndefOr[BoundingSphere] = js.native
  var indices: js.UndefOr[js.typedarray.Uint16Array | js.typedarray.Uint32Array] = js.native
  var primitiveType: js.UndefOr[PrimitiveType] = js.native
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: GeometryAttributes): AnonAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
  @scala.inline
  implicit class AnonAttributesOps[Self <: AnonAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: GeometryAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingSphere(value: BoundingSphere): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingSphere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingSphere")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicesUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimitiveType(value: PrimitiveType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimitiveType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveType")(js.undefined)
        ret
    }
  }
  
}

