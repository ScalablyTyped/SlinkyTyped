package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.reactNativeFirebase.anon.CACHESDIRECTORYPATH
import typingsSlinky.reactNativeFirebase.anon.Complete
import typingsSlinky.reactNativeFirebase.mod.App
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  /**
    * The Firebase Storage service interface.
    *
    * An instance can be accessed using `firebase.storage()`.
    */
  @JSImport("react-native-firebase", "RNFirebase.storage.Storage")
  @js.native
  class Storage () extends StObject {
    
    /**
      * The app associated with the Storage service instance.
      */
    var app: App = js.native
    
    /**
      * Returns a reference for the given path in the default bucket.
      *
      * @param path A relative path to initialize the reference with, for
      *        example path/to/image.jpg. If not passed, the returned
      *        reference points to the bucket root.
      */
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    
    /**
      * Returns a reference for the given absolute URL.
      *
      * @param url URL must be in the form of either
      *        -   a Cloud Storage URL, for example gs://bucket/files/image.png; or
      *        -   download URL taken from object metadata.
      */
    def refFromURL(url: String): Reference = js.native
    
    /**
      * @param time The new maximum download retry time in milliseconds.
      */
    def setMaxDownloadRetryTime(time: Double): Unit = js.native
    
    /**
      * @param time The new maximum operation retry time in milliseconds.
      */
    def setMaxOperationRetryTime(time: Double): Unit = js.native
    
    /**
      * @param time The new maximum upload retry time in milliseconds.
      */
    def setMaxUploadRetryTime(time: Double): Unit = js.native
  }
  
  @js.native
  sealed trait TaskEvent extends StObject
  @JSImport("react-native-firebase", "RNFirebase.storage.TaskEvent")
  @js.native
  object TaskEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TaskEvent with String] = js.native
    
    @js.native
    sealed trait STATE_CHANGED extends TaskEvent
    /* "state_changed" */ val STATE_CHANGED: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent.STATE_CHANGED with String = js.native
  }
  
  @js.native
  sealed trait TaskState extends StObject
  @JSImport("react-native-firebase", "RNFirebase.storage.TaskState")
  @js.native
  object TaskState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TaskState with String] = js.native
    
    @js.native
    sealed trait CANCELLED extends TaskState
    /* "cancelled" */ val CANCELLED: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState.CANCELLED with String = js.native
    
    @js.native
    sealed trait ERROR extends TaskState
    /* "error" */ val ERROR: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState.ERROR with String = js.native
    
    @js.native
    sealed trait PAUSED extends TaskState
    /* "paused" */ val PAUSED: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState.PAUSED with String = js.native
    
    @js.native
    sealed trait RUNNING extends TaskState
    /* "running" */ val RUNNING: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState.RUNNING with String = js.native
    
    @js.native
    sealed trait SUCCESS extends TaskState
    /* "success" */ val SUCCESS: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState.SUCCESS with String = js.native
  }
  
  @js.native
  trait DownloadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double = js.native
    
    var ref: Reference = js.native
    
    var state: TaskState = js.native
    
    var totalBytes: Double = js.native
  }
  object DownloadTaskSnapshot {
    
    @scala.inline
    def apply(bytesTransferred: Double, ref: Reference, state: TaskState, totalBytes: Double): DownloadTaskSnapshot = {
      val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTaskSnapshot]
    }
    
    @scala.inline
    implicit class DownloadTaskSnapshotMutableBuilder[Self <: DownloadTaskSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesTransferred(value: Double): Self = StObject.set(x, "bytesTransferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullMetadata extends SettableMetadata {
    
    var bucket: String = js.native
    
    var fullPath: String = js.native
    
    var generation: String = js.native
    
    var md5Hash: js.UndefOr[String | Null] = js.native
    
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
      def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
      
      @scala.inline
      def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
      
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
  
  /**
    * A reference represents a reference to a Google Cloud Storage object.
    *
    * You can upload, download, and delete objects, as well as get/set object
    * metadata for a file via this reference.
    */
  @js.native
  trait Reference extends StObject {
    
    /**
      * Returns a reference to a relative path from this reference.
      *
      * @param path The relative path
      */
    def child(path: String): Reference = js.native
    
    /**
      * Deletes the object at this reference's location.
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Downloads the storage object for this reference to the device file
      * path specified.
      *
      * @param filePath The destination path of the downloaded file.
      */
    def downloadFile(filePath: String): StorageTask[DownloadTaskSnapshot] = js.native
    
    var fullPath: String = js.native
    
    /**
      * Fetches a long lived download URL for this object.
      */
    def getDownloadURL(): js.Promise[String] = js.native
    
    /**
      * Fetches metadata for the object at this location, if one exists.
      *
      * @returns A promise that is resolved with the metadata; or rejected on
      *          failure, including if the object does not exist.
      */
    def getMetadata(): js.Promise[FullMetadata] = js.native
    
    /**
      * Uploads the file path specified from the device into a storage object
      * for this reference.
      *
      * @param filePath The path to the file on the device. It must be a full
      *        file path.
      * @param metadata The metadata to associate with this file.
      */
    def putFile(filePath: String): StorageTask[UploadTaskSnapshot] = js.native
    def putFile(filePath: String, metadata: SettableMetadata): StorageTask[UploadTaskSnapshot] = js.native
    
    /**
      * Updates the metadata for the object at this location, if one exists.
      *
      * @param metadata
      */
    def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
  }
  
  @js.native
  trait SettableMetadata extends StObject {
    
    var cacheControl: js.UndefOr[String | Null] = js.native
    
    var contentDisposition: js.UndefOr[String | Null] = js.native
    
    var contentEncoding: js.UndefOr[String | Null] = js.native
    
    var contentLanguage: js.UndefOr[String | Null] = js.native
    
    var contentType: js.UndefOr[String | Null] = js.native
    
    var customMetadata: js.UndefOr[Partial[Record[String, String]]] = js.native
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
      def setCustomMetadata(value: Partial[Record[String, String]]): Self = StObject.set(x, "customMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMetadataUndefined: Self = StObject.set(x, "customMetadata", js.undefined)
    }
  }
  
  @js.native
  trait StorageStatics extends StObject {
    
    var Native: js.UndefOr[CACHESDIRECTORYPATH] = js.native
    
    var TaskEvent: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent = js.native
    
    var TaskState: typingsSlinky.reactNativeFirebase.mod.RNFirebase.storage.TaskState = js.native
  }
  object StorageStatics {
    
    @scala.inline
    def apply(TaskEvent: TaskEvent, TaskState: TaskState): StorageStatics = {
      val __obj = js.Dynamic.literal(TaskEvent = TaskEvent.asInstanceOf[js.Any], TaskState = TaskState.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageStatics]
    }
    
    @scala.inline
    implicit class StorageStaticsMutableBuilder[Self <: StorageStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNative(value: CACHESDIRECTORYPATH): Self = StObject.set(x, "Native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "Native", js.undefined)
      
      @scala.inline
      def setTaskEvent(value: TaskEvent): Self = StObject.set(x, "TaskEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskState(value: TaskState): Self = StObject.set(x, "TaskState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorageTask[T]
    extends js.Promise[T] {
    
    /**
      * Not supported by react-native-firebase
      */
    def cancel(): Unit = js.native
    
    def on(event: TaskEvent, next: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: js.UndefOr[scala.Nothing], complete: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: ErrorHandler): js.Function0[Unit] = js.native
    def on(event: TaskEvent, next: Handler[T], error: ErrorHandler, complete: Handler[T]): js.Function0[Unit] = js.native
    def on(event: TaskEvent, observer: Complete[T]): js.Function0[Unit] = js.native
    
    /**
      * Not supported by react-native-firebase
      */
    def pause(): Unit = js.native
    
    /**
      * Not supported by react-native-firebase
      */
    def resume(): Unit = js.native
  }
  
  @js.native
  trait UploadTaskSnapshot extends StObject {
    
    var bytesTransferred: Double = js.native
    
    var downloadURL: String | Null = js.native
    
    var metadata: FullMetadata = js.native
    
    var ref: Reference = js.native
    
    var state: TaskState = js.native
    
    var task: StorageTask[UploadTaskSnapshot] = js.native
    
    var totalBytes: Double = js.native
  }
  object UploadTaskSnapshot {
    
    @scala.inline
    def apply(
      bytesTransferred: Double,
      metadata: FullMetadata,
      ref: Reference,
      state: TaskState,
      task: StorageTask[UploadTaskSnapshot],
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
      def setDownloadURL(value: String): Self = StObject.set(x, "downloadURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadURLNull: Self = StObject.set(x, "downloadURL", null)
      
      @scala.inline
      def setMetadata(value: FullMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTask(value: StorageTask[UploadTaskSnapshot]): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
}
