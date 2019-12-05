package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttributes extends Object {
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[scala.scalajs.js.typedarray.Float32Array] = js.undefined
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: scala.scalajs.js.typedarray.Float64Array
}

object VertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: scala.scalajs.js.typedarray.Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean,
    normal: scala.scalajs.js.typedarray.Float32Array = null
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttributes]
  }
}

