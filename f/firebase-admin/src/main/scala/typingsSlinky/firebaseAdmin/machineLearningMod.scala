package typingsSlinky.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseAdmin.anon.AutomlModel
import typingsSlinky.firebaseAdmin.anon.GcsTfliteUri
import typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineLearningMod {
  
  object machineLearning {
    
    @JSImport("firebase-admin/lib/machine-learning", "machineLearning")
    @js.native
    def apply(): MachineLearning = js.native
    @JSImport("firebase-admin/lib/machine-learning", "machineLearning")
    @js.native
    def apply(app: App): MachineLearning = js.native
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.ModelOptions because Already inherited */ @js.native
    trait AutoMLTfliteModelOptions extends ModelOptionsBase {
      
      var tfliteModel: AutomlModel = js.native
    }
    object AutoMLTfliteModelOptions {
      
      @scala.inline
      def apply(tfliteModel: AutomlModel): AutoMLTfliteModelOptions = {
        val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[AutoMLTfliteModelOptions]
      }
      
      @scala.inline
      implicit class AutoMLTfliteModelOptionsMutableBuilder[Self <: AutoMLTfliteModelOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTfliteModel(value: AutomlModel): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.ModelOptions because Already inherited */ @js.native
    trait GcsTfliteModelOptions extends ModelOptionsBase {
      
      var tfliteModel: GcsTfliteUri = js.native
    }
    object GcsTfliteModelOptions {
      
      @scala.inline
      def apply(tfliteModel: GcsTfliteUri): GcsTfliteModelOptions = {
        val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[GcsTfliteModelOptions]
      }
      
      @scala.inline
      implicit class GcsTfliteModelOptionsMutableBuilder[Self <: GcsTfliteModelOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTfliteModel(value: GcsTfliteUri): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interface representing options for listing Models.
      */
    @js.native
    trait ListModelsOptions extends StObject {
      
      /**
        * An expression that specifies how to filter the results.
        *
        * Examples:
        *
        * ```
        * display_name = your_model
        * display_name : experimental_*
        * tags: face_detector AND tags: experimental
        * state.published = true
        * ```
        *
        * See https://firebase.google.com/docs/ml/manage-hosted-models#list_your_projects_models
        */
      var filter: js.UndefOr[String] = js.native
      
      /** The number of results to return in each page. */
      var pageSize: js.UndefOr[Double] = js.native
      
      /** A token that specifies the result page to return. */
      var pageToken: js.UndefOr[String] = js.native
    }
    object ListModelsOptions {
      
      @scala.inline
      def apply(): ListModelsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListModelsOptions]
      }
      
      @scala.inline
      implicit class ListModelsOptionsMutableBuilder[Self <: ListModelsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    /** Response object for a listModels operation. */
    @js.native
    trait ListModelsResult extends StObject {
      
      /** A list of models in your project. */
      val models: js.Array[Model] = js.native
      
      /**
        * A token you can use to retrieve the next page of results. If null, the
        * current page is the final page.
        */
      val pageToken: js.UndefOr[String] = js.native
    }
    object ListModelsResult {
      
      @scala.inline
      def apply(models: js.Array[Model]): ListModelsResult = {
        val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
        __obj.asInstanceOf[ListModelsResult]
      }
      
      @scala.inline
      implicit class ListModelsResultMutableBuilder[Self <: ListModelsResult] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value :_*))
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    /**
      * The Firebase `MachineLearning` service interface.
      *
      * Do not call this constructor directly. Instead, use
      * [`admin.machineLearning()`](admin.machineLearning#machineLearning).
      */
    @js.native
    trait MachineLearning extends StObject {
      
      /**
        *  The {@link app.App} associated with the current `MachineLearning`
        *  service instance.
        */
      var app: App = js.native
      
      /**
        * Creates a model in the current Firebase project.
        *
        * @param {ModelOptions} model The model to create.
        *
        * @return {Promise<Model>} A Promise fulfilled with the created model.
        */
      def createModel(model: ModelOptions): js.Promise[Model] = js.native
      
      /**
        * Deletes a model from the current project.
        *
        * @param {string} modelId The ID of the model to delete.
        */
      def deleteModel(modelId: String): js.Promise[Unit] = js.native
      
      /**
        * Gets the model specified by the given ID.
        *
        * @param {string} modelId The ID of the model to get.
        *
        * @return {Promise<Model>} A Promise fulfilled with the model object.
        */
      def getModel(modelId: String): js.Promise[Model] = js.native
      
      /**
        * Lists the current project's models.
        *
        * @param {ListModelsOptions} options The listing options.
        *
        * @return {Promise<ListModelsResult>} A promise that
        *     resolves with the current (filtered) list of models and the next page
        *     token. For the last page, an empty list of models and no page token
        *     are returned.
        */
      def listModels(): js.Promise[ListModelsResult] = js.native
      def listModels(options: ListModelsOptions): js.Promise[ListModelsResult] = js.native
      
      /**
        * Publishes a Firebase ML model.
        *
        * A published model can be downloaded to client apps.
        *
        * @param {string} modelId The ID of the model to publish.
        *
        * @return {Promise<Model>} A Promise fulfilled with the published model.
        */
      def publishModel(modelId: String): js.Promise[Model] = js.native
      
      /**
        * Unpublishes a Firebase ML model.
        *
        * @param {string} modelId The ID of the model to unpublish.
        *
        * @return {Promise<Model>} A Promise fulfilled with the unpublished model.
        */
      def unpublishModel(modelId: String): js.Promise[Model] = js.native
      
      /**
        * Updates a model's metadata or model file.
        *
        * @param {string} modelId The ID of the model to update.
        * @param {ModelOptions} model The model fields to update.
        *
        * @return {Promise<Model>} A Promise fulfilled with the updated model.
        */
      def updateModel(modelId: String, model: ModelOptions): js.Promise[Model] = js.native
    }
    
    /**
      * A Firebase ML Model output object
      */
    @js.native
    trait Model extends StObject {
      
      /** The timestamp of the model's creation. */
      val createTime: String = js.native
      
      /**
        * The model's name. This is the name you use from your app to load the
        * model.
        */
      val displayName: String = js.native
      
      /**
        * The ETag identifier of the current version of the model. This value
        * changes whenever you update any of the model's properties.
        */
      val etag: String = js.native
      
      /**
        * True if the model is locked by a server-side operation. You can't make
        * changes to a locked model. See {@link waitForUnlocked `waitForUnlocked()`}.
        */
      val locked: Boolean = js.native
      
      /**
        * The hash of the model's `tflite` file. This value changes only when
        * you upload a new TensorFlow Lite model.
        */
      val modelHash: js.UndefOr[String] = js.native
      
      /** The ID of the model. */
      val modelId: String = js.native
      
      /** True if the model is published. */
      val published: Boolean = js.native
      
      /**
        * The model's tags, which can be used to group or filter models in list
        * operations.
        */
      val tags: js.UndefOr[js.Array[String]] = js.native
      
      /** Metadata about the model's TensorFlow Lite model file. */
      val tfliteModel: js.UndefOr[TFLiteModel] = js.native
      
      /**
        * Return the model as a JSON object.
        */
      def toJSON(): StringDictionary[js.Any] = js.native
      
      /** The timestamp of the model's most recent update. */
      val updateTime: String = js.native
      
      /** Error message when model validation fails. */
      val validationError: js.UndefOr[String] = js.native
      
      /**
        * Wait for the model to be unlocked.
        *
        * @param {number} maxTimeMillis The maximum time in milliseconds to wait.
        *     If not specified, a default maximum of 2 minutes is used.
        *
        * @return {Promise<void>} A promise that resolves when the model is unlocked
        *   or the maximum wait time has passed.
        */
      def waitForUnlocked(): js.Promise[Unit] = js.native
      def waitForUnlocked(maxTimeMillis: Double): js.Promise[Unit] = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.ModelOptionsBase
      - typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.GcsTfliteModelOptions
      - typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.AutoMLTfliteModelOptions
    */
    trait ModelOptions extends StObject
    object ModelOptions {
      
      @scala.inline
      def AutoMLTfliteModelOptions(tfliteModel: AutomlModel): typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.AutoMLTfliteModelOptions = {
        val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.AutoMLTfliteModelOptions]
      }
      
      @scala.inline
      def GcsTfliteModelOptions(tfliteModel: GcsTfliteUri): typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.GcsTfliteModelOptions = {
        val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.GcsTfliteModelOptions]
      }
      
      @scala.inline
      def ModelOptionsBase(): typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.ModelOptionsBase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.firebaseAdmin.machineLearningMod.machineLearning.ModelOptionsBase]
      }
    }
    
    /**
      * Firebase ML Model input objects
      */
    @js.native
    trait ModelOptionsBase extends ModelOptions {
      
      var displayName: js.UndefOr[String] = js.native
      
      var tags: js.UndefOr[js.Array[String]] = js.native
    }
    object ModelOptionsBase {
      
      @scala.inline
      def apply(): ModelOptionsBase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelOptionsBase]
      }
      
      @scala.inline
      implicit class ModelOptionsBaseMutableBuilder[Self <: ModelOptionsBase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        @scala.inline
        def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      }
    }
    
    /**
      * A TensorFlow Lite Model output object
      *
      * One of either the `gcsTfliteUri` or `automlModel` properties will be
      * defined.
      */
    @js.native
    trait TFLiteModel extends StObject {
      
      /**
        * The AutoML model reference from which the model was originally provided
        * to Firebase.
        */
      val automlModel: js.UndefOr[String] = js.native
      
      /** The URI from which the model was originally provided to Firebase. */
      val gcsTfliteUri: js.UndefOr[String] = js.native
      
      /** The size of the model. */
      val sizeBytes: Double = js.native
    }
    object TFLiteModel {
      
      @scala.inline
      def apply(sizeBytes: Double): TFLiteModel = {
        val __obj = js.Dynamic.literal(sizeBytes = sizeBytes.asInstanceOf[js.Any])
        __obj.asInstanceOf[TFLiteModel]
      }
      
      @scala.inline
      implicit class TFLiteModelMutableBuilder[Self <: TFLiteModel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutomlModelUndefined: Self = StObject.set(x, "automlModel", js.undefined)
        
        @scala.inline
        def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGcsTfliteUriUndefined: Self = StObject.set(x, "gcsTfliteUri", js.undefined)
        
        @scala.inline
        def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
      }
    }
  }
}
