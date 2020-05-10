package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.VertexBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizes extends js.Object {
  var data: StringDictionary[js.typedarray.Float32Array] = js.native
  var sizes: StringDictionary[Double] = js.native
  var strides: StringDictionary[Double] = js.native
  var vertexBuffers: StringDictionary[Nullable[VertexBuffer]] = js.native
}

object AnonSizes {
  @scala.inline
  def apply(
    data: StringDictionary[js.typedarray.Float32Array],
    sizes: StringDictionary[Double],
    strides: StringDictionary[Double],
    vertexBuffers: StringDictionary[Nullable[VertexBuffer]]
  ): AnonSizes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any], vertexBuffers = vertexBuffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizes]
  }
  @scala.inline
  implicit class AnonSizesOps[Self <: AnonSizes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: StringDictionary[js.typedarray.Float32Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrides(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexBuffers(value: StringDictionary[Nullable[VertexBuffer]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexBuffers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

