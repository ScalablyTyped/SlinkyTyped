package typingsSlinky.babylonjs.abstractMeshMod

import typingsSlinky.babylonjs.anon.Ind
import typingsSlinky.babylonjs.anon.X
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.IndicesArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@js.native
trait FacetDataStorage extends js.Object {
  var bbSize: Vector3 = js.native
  var depthSortedFacets: js.Array[Ind] = js.native
  var depthSortedIndices: IndicesArray = js.native
  var facetDataEnabled: Boolean = js.native
  var facetDepthSort: Boolean = js.native
  var facetDepthSortEnabled: Boolean = js.native
  var facetDepthSortFrom: Vector3 = js.native
  var facetDepthSortOrigin: Vector3 = js.native
  var facetNb: Double = js.native
  var facetNormals: js.Array[Vector3] = js.native
  var facetParameters: js.Any = js.native
  var facetPartitioning: js.Array[js.Array[Double]] = js.native
  var facetPositions: js.Array[Vector3] = js.native
  var invertedMatrix: Matrix = js.native
  var partitioningBBoxRatio: Double = js.native
  var partitioningSubdivisions: Double = js.native
  var subDiv: X = js.native
  def facetDepthSortFunction(f1: Ind, f2: Ind): Double = js.native
}

object FacetDataStorage {
  @scala.inline
  def apply(
    bbSize: Vector3,
    depthSortedFacets: js.Array[Ind],
    depthSortedIndices: IndicesArray,
    facetDataEnabled: Boolean,
    facetDepthSort: Boolean,
    facetDepthSortEnabled: Boolean,
    facetDepthSortFrom: Vector3,
    facetDepthSortFunction: (Ind, Ind) => Double,
    facetDepthSortOrigin: Vector3,
    facetNb: Double,
    facetNormals: js.Array[Vector3],
    facetParameters: js.Any,
    facetPartitioning: js.Array[js.Array[Double]],
    facetPositions: js.Array[Vector3],
    invertedMatrix: Matrix,
    partitioningBBoxRatio: Double,
    partitioningSubdivisions: Double,
    subDiv: X
  ): FacetDataStorage = {
    val __obj = js.Dynamic.literal(bbSize = bbSize.asInstanceOf[js.Any], depthSortedFacets = depthSortedFacets.asInstanceOf[js.Any], depthSortedIndices = depthSortedIndices.asInstanceOf[js.Any], facetDataEnabled = facetDataEnabled.asInstanceOf[js.Any], facetDepthSort = facetDepthSort.asInstanceOf[js.Any], facetDepthSortEnabled = facetDepthSortEnabled.asInstanceOf[js.Any], facetDepthSortFrom = facetDepthSortFrom.asInstanceOf[js.Any], facetDepthSortFunction = js.Any.fromFunction2(facetDepthSortFunction), facetDepthSortOrigin = facetDepthSortOrigin.asInstanceOf[js.Any], facetNb = facetNb.asInstanceOf[js.Any], facetNormals = facetNormals.asInstanceOf[js.Any], facetParameters = facetParameters.asInstanceOf[js.Any], facetPartitioning = facetPartitioning.asInstanceOf[js.Any], facetPositions = facetPositions.asInstanceOf[js.Any], invertedMatrix = invertedMatrix.asInstanceOf[js.Any], partitioningBBoxRatio = partitioningBBoxRatio.asInstanceOf[js.Any], partitioningSubdivisions = partitioningSubdivisions.asInstanceOf[js.Any], subDiv = subDiv.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetDataStorage]
  }
  @scala.inline
  implicit class FacetDataStorageOps[Self <: FacetDataStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBbSize(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bbSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthSortedFacets(value: js.Array[Ind]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedFacets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthSortedIndicesInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthSortedIndicesUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthSortedIndicesUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepthSortedIndices(value: IndicesArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthSortedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetDataEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDataEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetDepthSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDepthSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetDepthSortEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDepthSortEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetDepthSortFrom(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDepthSortFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetDepthSortFunction(value: (Ind, Ind) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDepthSortFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFacetDepthSortOrigin(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetDepthSortOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetNb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetNb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetNormals(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetPartitioning(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPartitioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacetPositions(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvertedMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertedMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitioningBBoxRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioningBBoxRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitioningSubdivisions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioningSubdivisions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubDiv(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subDiv")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

