package typingsSlinky.mapboxMapboxSdk

import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.geojson.mod.GeometryCollection
import typingsSlinky.geojson.mod.LineString
import typingsSlinky.geojson.mod.MultiLineString
import typingsSlinky.geojson.mod.MultiPoint
import typingsSlinky.geojson.mod.MultiPolygon
import typingsSlinky.geojson.mod.Point
import typingsSlinky.geojson.mod.Polygon
import typingsSlinky.mapboxMapboxSdk.anon.DatasetId
import typingsSlinky.mapboxMapboxSdk.anon.Description
import typingsSlinky.mapboxMapboxSdk.anon.FeatureId
import typingsSlinky.mapboxMapboxSdk.anon.Limit
import typingsSlinky.mapboxMapboxSdk.anon.Name
import typingsSlinky.mapboxMapboxSdk.anon.`0`
import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typingsSlinky.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/datasets", JSImport.Default)
  @js.native
  def default(config: SdkConfig): DatasetsService = js.native
  @JSImport("@mapbox/mapbox-sdk/services/datasets", JSImport.Default)
  @js.native
  def default(config: typingsSlinky.mapboxMapboxSdk.mod.default): DatasetsService = js.native
  
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | (Feature[Geometry, GeoJsonProperties])
  
  @js.native
  trait Dataset extends StObject {
    
    /**
      * The extent of features in the dataset as an array of west, south, east, north coordinates
      */
    var bounds: js.Array[Double] = js.native
    
    /*
      * Date and time the dataset was created
      */
    var created: String = js.native
    
    /**
      * The description of the dataset
      */
    var description: String = js.native
    
    /**
      * The number of features in the dataset
      */
    var features: Double = js.native
    
    /**
      * Id for an existing dataset
      */
    var id: String = js.native
    
    /*
      * Date and time the dataset was last modified
      */
    var modified: String = js.native
    
    /**
      * The name of the dataset
      */
    var name: String = js.native
    
    /**
      * The username of the dataset owner
      */
    var owner: String = js.native
    
    /**
      * The size of the dataset in bytes
      */
    var size: Double = js.native
  }
  object Dataset {
    
    @scala.inline
    def apply(
      bounds: js.Array[Double],
      created: String,
      description: String,
      features: Double,
      id: String,
      modified: String,
      name: String,
      owner: String,
      size: Double
    ): Dataset = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dataset]
    }
    
    @scala.inline
    implicit class DatasetMutableBuilder[Self <: Dataset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatures(value: Double): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DatasetsService extends StObject {
    
    /**
      *  Create a new, empty dataset.
      * @param config Object
      */
    def createDataset(config: Description): MapiRequest = js.native
    
    /**
      * Delete a dataset, including all features it contains.
      * @param config
      */
    def deleteDataset(config: `0`): MapiRequest = js.native
    
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
    def putFeature(config: typingsSlinky.mapboxMapboxSdk.anon.Feature): MapiRequest = js.native
    
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
      deleteDataset: `0` => MapiRequest,
      deleteFeature: FeatureId => js.Any,
      getFeature: FeatureId => js.Any,
      getMetadata: DatasetId => MapiRequest,
      listDatasets: () => MapiRequest,
      listFeatures: Limit => js.Any,
      putFeature: typingsSlinky.mapboxMapboxSdk.anon.Feature => MapiRequest,
      updateMetadata: Name => MapiRequest
    ): DatasetsService = {
      val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
      __obj.asInstanceOf[DatasetsService]
    }
    
    @scala.inline
    implicit class DatasetsServiceMutableBuilder[Self <: DatasetsService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDataset(value: Description => MapiRequest): Self = StObject.set(x, "createDataset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteDataset(value: `0` => MapiRequest): Self = StObject.set(x, "deleteDataset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteFeature(value: FeatureId => js.Any): Self = StObject.set(x, "deleteFeature", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFeature(value: FeatureId => js.Any): Self = StObject.set(x, "getFeature", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMetadata(value: DatasetId => MapiRequest): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListDatasets(value: () => MapiRequest): Self = StObject.set(x, "listDatasets", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListFeatures(value: Limit => js.Any): Self = StObject.set(x, "listFeatures", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutFeature(value: typingsSlinky.mapboxMapboxSdk.anon.Feature => MapiRequest): Self = StObject.set(x, "putFeature", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateMetadata(value: Name => MapiRequest): Self = StObject.set(x, "updateMetadata", js.Any.fromFunction1(value))
    }
  }
}
