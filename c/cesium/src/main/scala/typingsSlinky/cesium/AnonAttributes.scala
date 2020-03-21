package typingsSlinky.cesium

import typingsSlinky.cesium.mod.BoundingSphere
import typingsSlinky.cesium.mod.GeometryAttributes
import typingsSlinky.cesium.mod.PrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: GeometryAttributes
  var boundingSphere: js.UndefOr[BoundingSphere] = js.undefined
  var indices: js.UndefOr[
    scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array
  ] = js.undefined
  var primitiveType: js.UndefOr[PrimitiveType] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(
    attributes: GeometryAttributes,
    boundingSphere: BoundingSphere = null,
    indices: scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array = null,
    primitiveType: PrimitiveType = null
  ): AnonAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    if (boundingSphere != null) __obj.updateDynamic("boundingSphere")(boundingSphere.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (primitiveType != null) __obj.updateDynamic("primitiveType")(primitiveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

