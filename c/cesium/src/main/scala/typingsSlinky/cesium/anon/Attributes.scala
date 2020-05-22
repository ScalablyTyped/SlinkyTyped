package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GeometryAttributes
import typingsSlinky.cesium.mod.PrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var attributes: GeometryAttributes
  var boundingSphere: js.UndefOr[typingsSlinky.cesium.mod.BoundingSphere] = js.undefined
  var indices: js.UndefOr[js.typedarray.Uint16Array | js.typedarray.Uint32Array] = js.undefined
  var primitiveType: js.UndefOr[PrimitiveType] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    attributes: GeometryAttributes,
    boundingSphere: typingsSlinky.cesium.mod.BoundingSphere = null,
    indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array = null,
    primitiveType: PrimitiveType = null
  ): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    if (boundingSphere != null) __obj.updateDynamic("boundingSphere")(boundingSphere.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

