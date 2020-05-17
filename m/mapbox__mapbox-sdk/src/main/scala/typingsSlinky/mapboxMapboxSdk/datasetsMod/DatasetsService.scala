package typingsSlinky.mapboxMapboxSdk.datasetsMod

import typingsSlinky.mapboxMapboxSdk.anon.DatasetId
import typingsSlinky.mapboxMapboxSdk.anon.DatasetIdString
import typingsSlinky.mapboxMapboxSdk.anon.Description
import typingsSlinky.mapboxMapboxSdk.anon.Feature
import typingsSlinky.mapboxMapboxSdk.anon.FeatureId
import typingsSlinky.mapboxMapboxSdk.anon.Limit
import typingsSlinky.mapboxMapboxSdk.anon.Name
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
  def createDataset(config: Description): MapiRequest = js.native
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: DatasetIdString): MapiRequest = js.native
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: FeatureId): js.Any = js.native
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: FeatureId): js.Any = js.native
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: DatasetId): MapiRequest = js.native
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
  def listFeatures(config: Limit): js.Any = js.native
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: Feature): MapiRequest = js.native
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: Name): MapiRequest = js.native
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: Description => MapiRequest,
    deleteDataset: DatasetIdString => MapiRequest,
    deleteFeature: FeatureId => js.Any,
    getFeature: FeatureId => js.Any,
    getMetadata: DatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: Limit => js.Any,
    putFeature: Feature => MapiRequest,
    updateMetadata: Name => MapiRequest
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
    def withCreateDataset(value: Description => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDataset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteDataset(value: DatasetIdString => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDataset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteFeature(value: FeatureId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFeature(value: FeatureId => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMetadata(value: DatasetId => MapiRequest): Self = {
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
    def withListFeatures(value: Limit => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listFeatures")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPutFeature(value: Feature => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMetadata(value: Name => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadata")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

