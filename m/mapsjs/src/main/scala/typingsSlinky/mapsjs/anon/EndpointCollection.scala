package typingsSlinky.mapsjs.anon

import typingsSlinky.mapsjs.mod.tile.quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointCollection extends js.Object {
  var endpointCollection: js.Array[String] = js.native
  var idxMinX: Double = js.native
  var idxMinY: Double = js.native
  var quadCollection: js.Array[quad] = js.native
  var ulX: Double = js.native
  var ulY: Double = js.native
}

object EndpointCollection {
  @scala.inline
  def apply(
    endpointCollection: js.Array[String],
    idxMinX: Double,
    idxMinY: Double,
    quadCollection: js.Array[quad],
    ulX: Double,
    ulY: Double
  ): EndpointCollection = {
    val __obj = js.Dynamic.literal(endpointCollection = endpointCollection.asInstanceOf[js.Any], idxMinX = idxMinX.asInstanceOf[js.Any], idxMinY = idxMinY.asInstanceOf[js.Any], quadCollection = quadCollection.asInstanceOf[js.Any], ulX = ulX.asInstanceOf[js.Any], ulY = ulY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointCollection]
  }
  @scala.inline
  implicit class EndpointCollectionOps[Self <: EndpointCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointCollection(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdxMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idxMinX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdxMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idxMinY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuadCollection(value: js.Array[quad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUlX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUlY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ulY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

