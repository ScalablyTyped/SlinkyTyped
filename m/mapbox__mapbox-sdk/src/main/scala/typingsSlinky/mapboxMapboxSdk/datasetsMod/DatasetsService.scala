package typingsSlinky.mapboxMapboxSdk.datasetsMod

import typingsSlinky.mapboxMapboxSdk.AnonDatasetId
import typingsSlinky.mapboxMapboxSdk.AnonDatasetIdString
import typingsSlinky.mapboxMapboxSdk.AnonDescription
import typingsSlinky.mapboxMapboxSdk.AnonFeature
import typingsSlinky.mapboxMapboxSdk.AnonFeatureId
import typingsSlinky.mapboxMapboxSdk.AnonLimit
import typingsSlinky.mapboxMapboxSdk.AnonName
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: AnonDescription): MapiRequest = js.native
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: AnonDatasetIdString): MapiRequest = js.native
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: AnonFeatureId): js.Any = js.native
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: AnonFeatureId): js.Any = js.native
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: AnonDatasetId): MapiRequest = js.native
  /**
    * List datasets in your account.
    */
  def listDatasets(): MapiRequest = js.native
  /**
    * List features in a dataset.
    * This endpoint supports pagination. Use MapiRequest#eachPage or manually specify the limit and start options.
    * @param config
    */
  // implicit any
  def listFeatures(config: AnonLimit): js.Any = js.native
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: AnonFeature): MapiRequest = js.native
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: AnonName): MapiRequest = js.native
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: AnonDescription => MapiRequest,
    deleteDataset: AnonDatasetIdString => MapiRequest,
    deleteFeature: AnonFeatureId => js.Any,
    getFeature: AnonFeatureId => js.Any,
    getMetadata: AnonDatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: AnonLimit => js.Any,
    putFeature: AnonFeature => MapiRequest,
    updateMetadata: AnonName => MapiRequest
  ): DatasetsService = {
    val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
    __obj.asInstanceOf[DatasetsService]
  }
  @scala.inline
  implicit class DatasetsServiceOps[Self <: DatasetsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDataset(value: AnonDescription => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDataset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteDataset(value: AnonDatasetIdString => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDataset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteFeature(value: AnonFeatureId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFeature(value: AnonFeatureId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: AnonDatasetId => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDatasets(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDatasets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListFeatures(value: AnonLimit => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFeatures")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutFeature(value: AnonFeature => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMetadata(value: AnonName => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadata")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

