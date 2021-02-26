package typingsSlinky.firebaseStorageTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Storage
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseStorageTypes.anon.PartialObserverUploadTask
import typingsSlinky.firebaseUtil.subscribeMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/storage-types", "FirebaseStorage")
  @js.native
  class FirebaseStorage protected () extends StObject {
    
    var app: FirebaseApp = js.native
    
    var maxOperationRetryTime: Double = js.native
    
    var maxUploadRetryTime: Double = js.native
    
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    
    def refFromURL(url: String): Reference = js.native
    
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    
    def setMaxUploadRetryTime(time: Double): Unit = js.native
  }
  
  @js.native
  trait FullMetadata extends UploadMetadata {
    
    var bucket: String = js.native
    
    var fullPath: String = js.native
    
    var generation: String = js.native
    
    var metageneration: String = js.native
    
    var name: String = js.native
    
    var size: Double = js.native
    
    var timeCreated: String = js.native
    
    var updated: String = js.native
  }
  object FullMetadata {
    
    @scala.inline
    def apply(
      bucket: String,
      fullPath: String,
      generation: String,
      metageneration: String,
      name: String,
      size: Double,
      timeCreated: String,
      updated: String
    ): FullMetadata = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], generation = generation.asInstanceOf[js.Any], metageneration = metageneration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullMetadata]
    }
    
    @scala.inline
    implicit class FullMetadataMutableBuilder[Self <: FullMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListOptions extends StObject {
    
    var maxResults: js.UndefOr[Double | Null] = js.native
    
    var pageToken: js.UndefOr[String | Null] = js.native
  }
  object ListOptions {
    
    @scala.inline
    def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  @js.native
  trait ListResult extends StObject {
    
    var items: js.Array[Reference] = js.native
    
    var nextPageToken: String | Null = js.native
    
    var prefixes: js.Array[Reference] = js.native
  }
  object ListResult {
    
    @scala.inline
    def apply(items: js.Array[Reference], prefixes: js.Array[Reference]): ListResult = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListResult]
    }
    
    @scala.inline
    implicit class ListResultMutableBuilder[Self <: ListResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Reference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Reference*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
      
      @scala.inline
      def setPrefixes(value: js.Array[Reference]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesVarargs(value: Reference*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Reference extends StObject {
    
    var bucket: String = js.native
    
    def child(path: String): Reference = js.native
    
    def delete(): js.Promise[Unit] = js.native
    
    var fullPath: String = js.native
    
    def getDownloadURL(): js.Promise[String] = js.native
    
    def getMetadata(): js.Promise[FullMetadata] = js.native
    
    def list(): js.Promise[ListResult] = js.native
    def list(options: ListOptions): js.Promise[ListResult] = js.native
    
    def listAll(): js.Promise[ListResult] = js.native
    
    var name: String = js.native
    
    var parent: Reference | Null = js.native
    
    def put(data: js.typedarray.ArrayBuffer): UploadTask = js.native
    def put(data: js.typedarray.ArrayBuffer, metadata: UploadMetadata): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array): UploadTask = js.native
    def put(data: js.typedarray.Uint8Array, metadata: UploadMetadata): UploadTask = js.native
    def put(data: Blob): UploadTask = js.native
    def put(data: Blob, metadata: UploadMetadata): UploadTask = js.native
    
    def putString(data: String): UploadTask = js.native
    def putString(data: String, format: js.UndefOr[scala.Nothing], metadata: UploadMetadata): UploadTask = js.native
    def putString(data: String, format: StringFormat): UploadTask = js.native
    def putString(data: String, format: StringFormat, metadata: UploadMetadata): UploadTask = js.native
    
    var root: Reference = js.native
    
    var storage: Storage = js.native
    
    def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
  }
  
  @js.native
  trait SettableMetadata extends StObject {
    
    var cacheControl: js.UndefOr[String | Null] = js.native
    
    var contentDisposition: js.UndefOr[String | Null] = js.native
    
    var contentEncoding: js.UndefOr[String | Null] = js.native
    
    var contentLanguage: js.UndefOr[String | Null] = js.native
    
    var contentType: js.UndefOr[String | Null] = js.native
    
    var customMetadata: js.UndefOr[StringDictionary[String] | Null] = js.native
  }
  object SettableMetadata {
    
    @scala.inline
    def apply(): SettableMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettableMetadata]
    }
    
    @scala.inline
    implicit class SettableMetadataMutableBuilder[Self <: SettableMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlNull: Self = StObject.set(x, "cacheControl", null)
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDispositionNull: Self = StObject.set(x, "contentDisposition", null)
      
      @scala.inline
      def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      @scala.inline
      def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEncodingNull: Self = StObject.set(x, "contentEncoding", null)
      
      @scala.inline
      def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
      
      @scala.inline
      def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
      
      @scala.inline
      def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCustomMetadata(value: StringDictionary[String]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMetadataNull: Self = StObject.set(x, "customMetadata", null)
      
      @scala.inline
      def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  type StringFormat = String
  
  type TaskEvent = String
  
  type TaskState = String
  
  @js.native
  trait UploadMetadata extends SettableMetadata {
    
    var md5Hash: js.UndefOr[String | Null] = js.native
  }
  object UploadMetadata {
    
    @scala.inline
    def apply(): UploadMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadMetadata]
    }
    
    @scala.inline
    implicit class UploadMetadataMutableBuilder[Self <: UploadMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
      
      @scala.inline
      def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    }
  }
  
  @js.native
  trait UploadTask extends StObject {
    
    def cancel(): Boolean = js.native
    
    def `catch`(onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
    
    def on(event: TaskEvent): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.UndefOr[scala.Nothing],
      error: js.Function1[/* a */ js.Error, _]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.UndefOr[scala.Nothing],
      error: js.Function1[/* a */ js.Error, _],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: js.UndefOr[scala.Nothing], error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: js.UndefOr[scala.Nothing],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: js.Function1[/* a */ js.Error, _]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: js.Function1[/* a */ js.Error, _],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: js.Function1[/* a */ UploadTaskSnapshot, _],
      error: Null,
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: js.UndefOr[scala.Nothing], complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: js.Function1[/* a */ js.Error, _]): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: Null,
      error: js.Function1[/* a */ js.Error, _],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: Null, error: Null, complete: Unsubscribe): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: PartialObserverUploadTask): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: PartialObserverUploadTask,
      error: js.UndefOr[scala.Nothing],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: PartialObserverUploadTask,
      error: js.Function1[/* a */ js.Error, _]
    ): js.Function = js.native
    def on(
      event: TaskEvent,
      nextOrObserver: PartialObserverUploadTask,
      error: js.Function1[/* a */ js.Error, _],
      complete: Unsubscribe
    ): js.Function = js.native
    def on(event: TaskEvent, nextOrObserver: PartialObserverUploadTask, error: Null, complete: Unsubscribe): js.Function = js.native
    
    def pause(): Boolean = js.native
    
    def resume(): Boolean = js.native
    
    var snapshot: UploadTaskSnapshot = js.native
    
    def `then`(): js.Promise[_] = js.native
    def `then`(onFulfilled: js.UndefOr[scala.Nothing], onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
    def `then`(onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _]): js.Promise[_] = js.native
    def `then`(
      onFulfilled: js.Function1[/* a */ UploadTaskSnapshot, _],
      onRejected: js.Function1[/* a */ js.Error, _]
    ): js.Promise[_] = js.native
    def `then`(onFulfilled: Null, onRejected: js.Function1[/* a */ js.Error, _]): js.Promise[_] = js.native
  }
  
  @js.native
  trait UploadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double = js.native
    
    var metadata: FullMetadata = js.native
    
    var ref: Reference = js.native
    
    var state: TaskState = js.native
    
    var task: UploadTask = js.native
    
    var totalBytes: Double = js.native
  }
  object UploadTaskSnapshot {
    
    @scala.inline
    def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: Reference,
      state: TaskState,
      task: UploadTask,
      totalBytes: Double
    ): UploadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadTaskSnapshot]
    }
    
    @scala.inline
    implicit class UploadTaskSnapshotMutableBuilder[Self <: UploadTaskSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: UploadTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var storage: FirebaseStorage = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(storage: FirebaseStorage): NameServiceMapping = {
        val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStorage(value: FirebaseStorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      }
    }
  }
}
