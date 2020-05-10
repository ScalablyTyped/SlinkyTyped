package typingsSlinky.babylonjs.engineOcclusionQueryMod.babylonjsMeshesAbstractMeshAugmentingMod

import typingsSlinky.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractMesh extends js.Object {
  /**
    * Backing filed
    * @hidden
    */
  var __occlusionDataStorage: OcclusionDataStorage = js.native
  /**
    * Access property
    * @hidden
    */
  var _occlusionDataStorage: OcclusionDataStorage = js.native
  /**
    * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var isOccluded: Boolean = js.native
  /**
    * Flag to check the progress status of the query
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var isOcclusionQueryInProgress: Boolean = js.native
  /**
    * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionQueryAlgorithmType: Double = js.native
  /**
    * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
    * The default value is -1 which means don't break the query and wait till the result
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionRetryCount: Double = js.native
  /**
    * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
    * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
    * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
    * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionType: Double = js.native
}

object AbstractMesh {
  @scala.inline
  def apply(
    __occlusionDataStorage: OcclusionDataStorage,
    _occlusionDataStorage: OcclusionDataStorage,
    isOccluded: Boolean,
    isOcclusionQueryInProgress: Boolean,
    occlusionQueryAlgorithmType: Double,
    occlusionRetryCount: Double,
    occlusionType: Double
  ): AbstractMesh = {
    val __obj = js.Dynamic.literal(__occlusionDataStorage = __occlusionDataStorage.asInstanceOf[js.Any], _occlusionDataStorage = _occlusionDataStorage.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMesh]
  }
  @scala.inline
  implicit class AbstractMeshOps[Self <: AbstractMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__occlusionDataStorage(value: OcclusionDataStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__occlusionDataStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_occlusionDataStorage(value: OcclusionDataStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occlusionDataStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOccluded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOccluded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOcclusionQueryInProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOcclusionQueryInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionQueryAlgorithmType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionQueryAlgorithmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionRetryCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionRetryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcclusionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occlusionType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

