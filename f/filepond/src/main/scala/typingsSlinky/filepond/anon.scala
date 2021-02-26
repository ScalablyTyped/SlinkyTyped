package typingsSlinky.filepond

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Element
import typingsSlinky.filepond.filepondStrings.after
import typingsSlinky.filepond.filepondStrings.before
import typingsSlinky.filepond.filepondStrings.circle
import typingsSlinky.filepond.filepondStrings.compact
import typingsSlinky.filepond.filepondStrings.input
import typingsSlinky.filepond.filepondStrings.integrated
import typingsSlinky.filepond.filepondStrings.limbo
import typingsSlinky.filepond.filepondStrings.local
import typingsSlinky.filepond.mod.ActualFileObject
import typingsSlinky.filepond.mod.CaptureAttribute
import typingsSlinky.filepond.mod.FetchServerConfigFunction
import typingsSlinky.filepond.mod.FilePondErrorDescription
import typingsSlinky.filepond.mod.FilePondEvent
import typingsSlinky.filepond.mod.FilePondEventPrefixed
import typingsSlinky.filepond.mod.FilePondFile
import typingsSlinky.filepond.mod.FilePondInitialFile
import typingsSlinky.filepond.mod.FilePondOptions
import typingsSlinky.filepond.mod.LoadServerConfigFunction
import typingsSlinky.filepond.mod.ProcessServerConfigFunction
import typingsSlinky.filepond.mod.ProgressServerConfigFunction
import typingsSlinky.filepond.mod.RemoveFileOptions
import typingsSlinky.filepond.mod.RemoveServerConfigFunction
import typingsSlinky.filepond.mod.RestoreServerConfigFunction
import typingsSlinky.filepond.mod.RevertServerConfigFunction
import typingsSlinky.filepond.mod.ServerUrl
import typingsSlinky.filepond.mod.Status
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fetch extends StObject {
    
    var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction | Null] = js.native
    
    var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
    
    var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction | Null] = js.native
    
    var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction | Null] = js.native
    
    var remove: js.UndefOr[RemoveServerConfigFunction | Null] = js.native
    
    var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction | Null] = js.native
    
    var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction | Null] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Fetch {
    
    @scala.inline
    def apply(): Fetch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fetch]
    }
    
    @scala.inline
    implicit class FetchMutableBuilder[Self <: Fetch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: String | ServerUrl | FetchServerConfigFunction): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchFunction6(
        value: (/* url */ String, /* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "fetch", js.Any.fromFunction6(value))
      
      @scala.inline
      def setFetchNull: Self = StObject.set(x, "fetch", null)
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLoad(value: String | ServerUrl | LoadServerConfigFunction): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadFunction6(
        value: (/* source */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject | Blob, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "load", js.Any.fromFunction6(value))
      
      @scala.inline
      def setLoadNull: Self = StObject.set(x, "load", null)
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setProcess(value: String | ServerUrl | ProcessServerConfigFunction): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessFunction7(
        value: (/* fieldName */ String, /* file */ ActualFileObject, /* metadata */ StringDictionary[js.Any], /* load */ js.Function1[/* p */ String | StringDictionary[js.Any], Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "process", js.Any.fromFunction7(value))
      
      @scala.inline
      def setProcessNull: Self = StObject.set(x, "process", null)
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setRemove(
        value: (/* source */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveNull: Self = StObject.set(x, "remove", null)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setRestore(value: String | ServerUrl | RestoreServerConfigFunction): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestoreFunction6(
        value: (/* uniqueFileId */ js.Any, /* load */ js.Function1[/* file */ ActualFileObject, Unit], /* error */ js.Function1[/* errorText */ String, Unit], /* progress */ ProgressServerConfigFunction, /* abort */ js.Function0[Unit], /* headers */ js.Function1[/* headersString */ String, Unit]) => Unit
      ): Self = StObject.set(x, "restore", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRestoreNull: Self = StObject.set(x, "restore", null)
      
      @scala.inline
      def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      @scala.inline
      def setRevert(value: String | ServerUrl | RevertServerConfigFunction): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertFunction3(
        value: (/* uniqueFieldId */ js.Any, /* load */ js.Function0[Unit], /* error */ js.Function1[/* errorText */ String, Unit]) => Unit
      ): Self = StObject.set(x, "revert", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRevertNull: Self = StObject.set(x, "revert", null)
      
      @scala.inline
      def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait File extends StObject {
    
    /** Mock file information. */
    var file: js.UndefOr[Name] = js.native
    
    /** File initial metadata. */
    var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /** Origin of file being added. */
    var `type`: input | limbo | local = js.native
  }
  object File {
    
    @scala.inline
    def apply(`type`: input | limbo | local): File = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Name): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setType(value: input | limbo | local): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined filepond.filepond.FilePond */
  @js.native
  trait FilePond extends StObject {
    
    /**
      * Adds an event listener to the given event.
      * @param event Name of the event, prefixed with `Filepond:`
      * @param fn Event handler
      */
    def addEventListener(event: FilePondEventPrefixed, fn: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
    
    def addFile(source: String): js.Promise[FilePondFile] = js.native
    def addFile(source: String, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
    def addFile(source: Blob): js.Promise[FilePondFile] = js.native
    def addFile(source: Blob, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
    /**
      * Adds a file.
      * @param options.index The index that the file should be added at.
      */
    def addFile(source: ActualFileObject): js.Promise[FilePondFile] = js.native
    def addFile(source: ActualFileObject, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
    
    /**
      * Adds multiple files.
      * @param options.index The index that the files should be added at.
      */
    def addFiles(source: js.Array[ActualFileObject | Blob | String]): js.Promise[js.Array[FilePondFile]] = js.native
    def addFiles(source: js.Array[ActualFileObject | Blob | String], options: IndexNumber): js.Promise[js.Array[FilePondFile]] = js.native
    
    var allowBrowse: Boolean = js.native
    
    var allowDirectoriesOnly: Boolean = js.native
    
    var allowDrop: Boolean = js.native
    
    var allowMultiple: Boolean = js.native
    
    var allowPaste: Boolean = js.native
    
    var allowProcess: Boolean = js.native
    
    var allowReorder: Boolean = js.native
    
    var allowReplace: Boolean = js.native
    
    var allowRevert: Boolean = js.native
    
    var allowSyncAcceptAttribute: Boolean = js.native
    
    /** Appends FilePond to the given element.  */
    def appendTo(element: Element): Unit = js.native
    
    def beforeAddFile(item: FilePondFile): Boolean | js.Promise[Boolean] = js.native
    @JSName("beforeAddFile")
    var beforeAddFile_Original: js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]] = js.native
    
    def beforeDropFile(file: String): Boolean = js.native
    def beforeDropFile(file: FilePondFile): Boolean = js.native
    @JSName("beforeDropFile")
    var beforeDropFile_Original: js.Function1[/* file */ FilePondFile | String, Boolean] = js.native
    
    def beforeRemoveFile(item: FilePondFile): Boolean | js.Promise[Boolean] = js.native
    @JSName("beforeRemoveFile")
    var beforeRemoveFile_Original: js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]] = js.native
    
    /**
      * Manually trigger the browse files panel.
      *
      * Only works if the call originates from the user.
      */
    def browse(): Unit = js.native
    
    var captureMethod: CaptureAttribute = js.native
    
    var checkValidity: Boolean = js.native
    
    var chunkForce: Boolean = js.native
    
    var chunkRetryDelays: js.Array[Double] = js.native
    
    var chunkSize: Double = js.native
    
    var chunkUploads: Boolean = js.native
    
    var className: String = js.native
    
    /** Destroys this FilePond instance. */
    def destroy(): Unit = js.native
    
    var disabled: Boolean = js.native
    
    var dropOnElement: Boolean = js.native
    
    var dropOnPage: Boolean = js.native
    
    var dropValidation: Boolean = js.native
    
    /**
      * The root element of the Filepond instance.
      */
    val element: Element | Null = js.native
    
    var files: js.Array[FilePondInitialFile | ActualFileObject | Blob | String] = js.native
    
    var forceRevert: Boolean = js.native
    
    /**
      * Returns a file. If no parameter is provided, returns the first file in the list.
      * @param query The file id, or index
      */
    def getFile(): FilePondFile = js.native
    def getFile(query: String): FilePondFile = js.native
    def getFile(query: Double): FilePondFile = js.native
    
    /** Returns all files. */
    def getFiles(): js.Array[FilePondFile] = js.native
    
    var iconDone: String = js.native
    
    var iconProcess: String = js.native
    
    var iconRemove: String = js.native
    
    var iconRetry: String = js.native
    
    var iconUndo: String = js.native
    
    var id: String = js.native
    
    var ignoredFiles: js.Array[String] = js.native
    
    /** Inserts the FilePond instance after the supplied element. */
    def insertAfter(element: Element): Unit = js.native
    
    /** Inserts the FilePond instance before the supplied element. */
    def insertBefore(element: Element): Unit = js.native
    
    var instantUpload: Boolean = js.native
    
    /** Returns true if the current instance is attached to the supplied element. */
    def isAttachedTo(element: Element): Unit = js.native
    
    var itemInsertInterval: Double = js.native
    
    var itemInsertLocation: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double]) = js.native
    
    var itemInsertLocationFreedom: Boolean = js.native
    
    var labelButtonAbortItemLoad: String = js.native
    
    var labelButtonAbortItemProcessing: String = js.native
    
    var labelButtonProcessItem: String = js.native
    
    var labelButtonRemoveItem: String = js.native
    
    var labelButtonRetryItemLoad: String = js.native
    
    var labelButtonRetryItemProcessing: String = js.native
    
    var labelButtonUndoItemProcessing: String = js.native
    
    var labelDecimalSeparator: String = js.native
    
    var labelFileAdded: String = js.native
    
    var labelFileCountPlural: String = js.native
    
    var labelFileCountSingular: String = js.native
    
    var labelFileLoadError: (js.Function1[/* error */ js.Any, String]) | String = js.native
    
    var labelFileLoading: String = js.native
    
    var labelFileProcessing: String = js.native
    
    var labelFileProcessingAborted: String = js.native
    
    var labelFileProcessingComplete: String = js.native
    
    var labelFileProcessingError: (js.Function1[/* error */ js.Any, String]) | String = js.native
    
    var labelFileProcessingRevertError: (js.Function1[/* error */ js.Any, String]) | String = js.native
    
    var labelFileRemoveError: (js.Function1[/* error */ js.Any, String]) | String = js.native
    
    var labelFileRemoved: String = js.native
    
    var labelFileSizeNotAvailable: String = js.native
    
    var labelFileWaitingForSize: String = js.native
    
    var labelIdle: String = js.native
    
    var labelInvalidField: String = js.native
    
    var labelTapToCancel: String = js.native
    
    var labelTapToRetry: String = js.native
    
    var labelTapToUndo: String = js.native
    
    var labelThousandsSeparator: String = js.native
    
    var maxFiles: Double = js.native
    
    var maxParallelUploads: Double = js.native
    
    def moveFile(query: String, index: Double): Unit = js.native
    def moveFile(query: Double, index: Double): Unit = js.native
    /**
      * Moves a file. Select file with query and supply target index.
      * @param query The file reference, id, or index.
      * @param index The index to move the file to.
      */
    def moveFile(query: FilePondFile, index: Double): Unit = js.native
    
    var name: String = js.native
    
    /**
      * Stop listening to an event.
      * @param event Name of the event
      * @param fn Event handler, signature is identical to the callback method
      */
    def off(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    /**
      * Listen to an event.
      * @param event Name of the event
      * @param fn Event handler, signature is identical to the callback method
      */
    def on(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    /**
      * Listen to an event once and remove the handler.
      * @param event Name of the event
      * @param fn Event handler, signature is identical to the callback method
      */
    def onOnce(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    def onactivatefile(file: FilePondFile): Unit = js.native
    @JSName("onactivatefile")
    var onactivatefile_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
    
    def onaddfile(error: Null, file: FilePondFile): Unit = js.native
    def onaddfile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
    @JSName("onaddfile")
    var onaddfile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
    
    def onaddfileprogress(file: FilePondFile, progress: Double): Unit = js.native
    @JSName("onaddfileprogress")
    var onaddfileprogress_Original: js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit] = js.native
    
    def onaddfilestart(file: FilePondFile): Unit = js.native
    @JSName("onaddfilestart")
    var onaddfilestart_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
    
    def onerror(error: FilePondErrorDescription): Unit = js.native
    def onerror(error: FilePondErrorDescription, file: js.UndefOr[scala.Nothing], status: js.Any): Unit = js.native
    def onerror(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
    def onerror(error: FilePondErrorDescription, file: FilePondFile, status: js.Any): Unit = js.native
    @JSName("onerror")
    var onerror_Original: js.Function3[
        /* error */ FilePondErrorDescription, 
        /* file */ js.UndefOr[FilePondFile], 
        /* status */ js.UndefOr[js.Any], 
        Unit
      ] = js.native
    
    def oninit(): Unit = js.native
    @JSName("oninit")
    var oninit_Original: js.Function0[Unit] = js.native
    
    def onpreparefile(file: FilePondFile, output: js.Any): Unit = js.native
    @JSName("onpreparefile")
    var onpreparefile_Original: js.Function2[/* file */ FilePondFile, /* output */ js.Any, Unit] = js.native
    
    def onprocessfile(error: Null, file: FilePondFile): Unit = js.native
    def onprocessfile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
    @JSName("onprocessfile")
    var onprocessfile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
    
    def onprocessfileabort(file: FilePondFile): Unit = js.native
    @JSName("onprocessfileabort")
    var onprocessfileabort_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
    
    def onprocessfileprogress(file: FilePondFile, progress: Double): Unit = js.native
    @JSName("onprocessfileprogress")
    var onprocessfileprogress_Original: js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit] = js.native
    
    def onprocessfilerevert(file: FilePondFile): Unit = js.native
    @JSName("onprocessfilerevert")
    var onprocessfilerevert_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
    
    def onprocessfiles(): Unit = js.native
    @JSName("onprocessfiles")
    var onprocessfiles_Original: js.Function0[Unit] = js.native
    
    def onprocessfilestart(file: FilePondFile): Unit = js.native
    @JSName("onprocessfilestart")
    var onprocessfilestart_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
    
    def onremovefile(error: Null, file: FilePondFile): Unit = js.native
    def onremovefile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
    @JSName("onremovefile")
    var onremovefile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
    
    def onreorderfiles(files: js.Array[FilePondFile]): Unit = js.native
    @JSName("onreorderfiles")
    var onreorderfiles_Original: js.Function1[/* files */ js.Array[FilePondFile], Unit] = js.native
    
    def onupdatefiles(files: js.Array[FilePondFile]): Unit = js.native
    @JSName("onupdatefiles")
    var onupdatefiles_Original: js.Function1[/* files */ js.Array[FilePondFile], Unit] = js.native
    
    def onwarning(error: js.Any): Unit = js.native
    def onwarning(error: js.Any, file: js.UndefOr[scala.Nothing], status: js.Any): Unit = js.native
    def onwarning(error: js.Any, file: FilePondFile): Unit = js.native
    def onwarning(error: js.Any, file: FilePondFile, status: js.Any): Unit = js.native
    @JSName("onwarning")
    var onwarning_Original: js.Function3[
        /* error */ js.Any, 
        /* file */ js.UndefOr[FilePondFile], 
        /* status */ js.UndefOr[js.Any], 
        Unit
      ] = js.native
    
    /**
      * Starts preparing the file matching the given query, returns a Promise, the Promise is resolved with the file item and the output file { file, output }
      * @param query The file reference, id, or index
      */
    def prepareFile(): js.Promise[Output] = js.native
    def prepareFile(query: String): js.Promise[Output] = js.native
    def prepareFile(query: Double): js.Promise[Output] = js.native
    def prepareFile(query: FilePondFile): js.Promise[Output] = js.native
    
    /**
      * Processes multiple files. If no parameter is provided, processes all files.
      * @param query Array containing file reference(s), id(s), or index(es)
      */
    def prepareFiles(): js.Promise[js.Array[Output]] = js.native
    def prepareFiles(query: js.Array[Double | FilePondFile | String]): js.Promise[js.Array[Output]] = js.native
    
    /**
      * Processes a file. If no parameter is provided, processes the first file in the list.
      * @param query The file reference, id, or index
      */
    def processFile(): js.Promise[FilePondFile] = js.native
    def processFile(query: String): js.Promise[FilePondFile] = js.native
    def processFile(query: Double): js.Promise[FilePondFile] = js.native
    def processFile(query: FilePondFile): js.Promise[FilePondFile] = js.native
    
    /**
      * Processes multiple files. If no parameter is provided, processes all files.
      * @param query The file reference(s), id(s), or index(es)
      */
    def processFiles(): js.Promise[js.Array[FilePondFile]] = js.native
    def processFiles(query: js.Array[Double | FilePondFile | String]): js.Promise[js.Array[FilePondFile]] = js.native
    
    /**
      * Removes a file.
      * @param query The file reference, id, or index. If no query is provided, removes the first file in the list.
      * @param options Options for removal
      */
    def removeFile(): Unit = js.native
    /**
      * Removes the first file in the list.
      * @param options Options for removal
      */
    def removeFile(options: RemoveFileOptions): Unit = js.native
    def removeFile(query: js.UndefOr[scala.Nothing], options: RemoveFileOptions): Unit = js.native
    def removeFile(query: String): Unit = js.native
    def removeFile(query: String, options: RemoveFileOptions): Unit = js.native
    def removeFile(query: Double): Unit = js.native
    def removeFile(query: Double, options: RemoveFileOptions): Unit = js.native
    def removeFile(query: FilePondFile): Unit = js.native
    def removeFile(query: FilePondFile, options: RemoveFileOptions): Unit = js.native
    
    /**
      * Removes files matching the query.
      * @param query Array containing file references, ids, and/or indexes. If no array is provided, all files are removed
      * @param options Options for removal
      */
    def removeFiles(): Unit = js.native
    /**
      * Removes all files.
      * @param options Options for removal
      */
    def removeFiles(options: RemoveFileOptions): Unit = js.native
    def removeFiles(query: js.UndefOr[scala.Nothing], options: RemoveFileOptions): Unit = js.native
    def removeFiles(query: js.Array[FilePondFile | String | Double]): Unit = js.native
    def removeFiles(query: js.Array[FilePondFile | String | Double], options: RemoveFileOptions): Unit = js.native
    
    /** Replaces the supplied element with FilePond. */
    def replaceElement(element: Element): Unit = js.native
    
    var required: Boolean = js.native
    
    /** If FilePond replaced the original element, this restores the original element to its original glory. */
    def restoreElement(element: Element): Unit = js.native
    
    var server: String | Fetch = js.native
    
    /** Override multiple options at once. */
    def setOptions(options: FilePondOptions): Unit = js.native
    
    /**
      * Sort the items in the files list.
      * @param compare The comparison function
      */
    def sort(compare: js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double]): Unit = js.native
    
    /**
      * Returns the current status of the FilePond instance.
      * @default Status.EMPTY
      */
    val status: Status = js.native
    
    var styleButtonProcessItemPosition: String = js.native
    
    var styleButtonRemoveItemAlign: Boolean = js.native
    
    var styleButtonRemoveItemPosition: String = js.native
    
    var styleItemPanelAspectRatio: String = js.native
    
    var styleLoadIndicatorPosition: String = js.native
    
    var stylePanelAspectRatio: String = js.native
    
    var stylePanelLayout: integrated | compact | circle = js.native
    
    var styleProgressIndicatorPosition: String = js.native
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: js.UndefOr[Double] = js.native
  }
  object Index {
    
    @scala.inline
    def apply(): Index = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  @js.native
  trait IndexNumber extends StObject {
    
    var index: Double = js.native
  }
  object IndexNumber {
    
    @scala.inline
    def apply(index: Double): IndexNumber = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexNumber]
    }
    
    @scala.inline
    implicit class IndexNumberMutableBuilder[Self <: IndexNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    var file: FilePondFile = js.native
    
    var output: js.Any = js.native
  }
  object Output {
    
    @scala.inline
    def apply(file: FilePondFile, output: js.Any): Output = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: FilePondFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
