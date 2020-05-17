package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BbSize extends js.Object {
  var bInfo: js.UndefOr[js.Any] = js.native
  var bbSize: js.UndefOr[Vector3] = js.native
  var depthSort: js.UndefOr[Boolean] = js.native
  var depthSortedFacets: js.UndefOr[js.Any] = js.native
  var distanceTo: js.UndefOr[Vector3] = js.native
  var facetNormals: js.UndefOr[js.Any] = js.native
  var facetPartitioning: js.UndefOr[js.Any] = js.native
  var facetPositions: js.UndefOr[js.Any] = js.native
  var ratio: js.UndefOr[Double] = js.native
  var subDiv: js.UndefOr[js.Any] = js.native
  var useRightHandedSystem: js.UndefOr[Boolean] = js.native
}

object BbSize {
  @scala.inline
  def apply(): BbSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BbSize]
  }
  @scala.inline
  implicit class BbSizeOps[Self <: BbSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withBbSize(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBbSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthSortedFacets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthSortedFacets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedFacets")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceTo(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceTo")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetNormals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetNormals")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetPartitioning(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetPartitioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPartitioning")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetPositions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDiv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDiv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDiv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDiv")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRightHandedSystem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRightHandedSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRightHandedSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRightHandedSystem")(js.undefined)
        ret
    }
  }
  
}

