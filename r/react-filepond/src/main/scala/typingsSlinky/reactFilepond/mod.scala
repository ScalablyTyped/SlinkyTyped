package typingsSlinky.reactFilepond

import typingsSlinky.filepond.mod.FilePondOptions
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof filepond.filepond.FilePond, react-filepond.react-filepond.FilteredMethods> ]: filepond.filepond.FilePond[P]} */ @JSImport("react-filepond", "FilePond")
  @js.native
  class FilePond protected ()
    extends Component[FilePondProps, js.Object, js.Any] {
    def this(props: FilePondProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FilePondProps, context: js.Any) = this()
  }
  
  @JSImport("react-filepond", "FileStatus")
  @js.native
  object FileStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.filepond.mod.FileStatus with Double] = js.native
    
    /* 2 */ val IDLE: typingsSlinky.filepond.mod.FileStatus.IDLE with Double = js.native
    
    /* 1 */ val INIT: typingsSlinky.filepond.mod.FileStatus.INIT with Double = js.native
    
    /* 7 */ val LOADING: typingsSlinky.filepond.mod.FileStatus.LOADING with Double = js.native
    
    /* 8 */ val LOAD_ERROR: typingsSlinky.filepond.mod.FileStatus.LOAD_ERROR with Double = js.native
    
    /* 3 */ val PROCESSING: typingsSlinky.filepond.mod.FileStatus.PROCESSING with Double = js.native
    
    /* 5 */ val PROCESSING_COMPLETE: typingsSlinky.filepond.mod.FileStatus.PROCESSING_COMPLETE with Double = js.native
    
    /* 6 */ val PROCESSING_ERROR: typingsSlinky.filepond.mod.FileStatus.PROCESSING_ERROR with Double = js.native
    
    /* 9 */ val PROCESSING_QUEUED: typingsSlinky.filepond.mod.FileStatus.PROCESSING_QUEUED with Double = js.native
    
    /* 10 */ val PROCESSING_REVERT_ERROR: typingsSlinky.filepond.mod.FileStatus.PROCESSING_REVERT_ERROR with Double = js.native
  }
  
  @JSImport("react-filepond", "registerPlugin")
  @js.native
  def registerPlugin(plugins: js.Any*): Unit = js.native
  
  @js.native
  trait FilePondProps extends FilePondOptions {
    
    // (Temporarily) changed to old definition, see discussion at <https://github.com/pqina/react-filepond/pull/151>
    // acceptedFileTypes?: React.InputHTMLAttributes<any>['accept'];
    var acceptedFileTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object FilePondProps {
    
    @scala.inline
    def apply(): FilePondProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePondProps]
    }
    
    @scala.inline
    implicit class FilePondPropsMutableBuilder[Self <: FilePondProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptedFileTypes(value: js.Array[String]): Self = StObject.set(x, "acceptedFileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptedFileTypesUndefined: Self = StObject.set(x, "acceptedFileTypes", js.undefined)
      
      @scala.inline
      def setAcceptedFileTypesVarargs(value: String*): Self = StObject.set(x, "acceptedFileTypes", js.Array(value :_*))
    }
  }
  
  /*
  According to react-filepond implementation, every FilePond instance key is cloned except some from an array, see
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L13> and
  <https://github.com/pqina/react-filepond/blob/7deaee287dd24614706f2401dcf39df6207ef5ef/lib/index.js#L56-L61>.
  Exluded keys as of 2020-08-27:
  */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFilepond.reactFilepondStrings.setOptions
    - typingsSlinky.reactFilepond.reactFilepondStrings.on
    - typingsSlinky.reactFilepond.reactFilepondStrings.off
    - typingsSlinky.reactFilepond.reactFilepondStrings.onOnce
    - typingsSlinky.reactFilepond.reactFilepondStrings.appendTo
    - typingsSlinky.reactFilepond.reactFilepondStrings.insertAfter
    - typingsSlinky.reactFilepond.reactFilepondStrings.insertBefore
    - typingsSlinky.reactFilepond.reactFilepondStrings.isAttachedTo
    - typingsSlinky.reactFilepond.reactFilepondStrings.replaceElement
    - typingsSlinky.reactFilepond.reactFilepondStrings.restoreElement
    - typingsSlinky.reactFilepond.reactFilepondStrings.destroy
    - typingsSlinky.reactFilepond.reactFilepondStrings.dropOnPage
    - typingsSlinky.reactFilepond.reactFilepondStrings.dropOnElement
    - typingsSlinky.reactFilepond.reactFilepondStrings.dropValidation
    - typingsSlinky.reactFilepond.reactFilepondStrings.ignoredFiles
    - typingsSlinky.reactFilepond.reactFilepondStrings.instantUpload
    - typingsSlinky.reactFilepond.reactFilepondStrings.maxParallelUploads
    - typingsSlinky.reactFilepond.reactFilepondStrings.server
    - typingsSlinky.reactFilepond.reactFilepondStrings.chunkUploads
    - typingsSlinky.reactFilepond.reactFilepondStrings.chunkForce
    - typingsSlinky.reactFilepond.reactFilepondStrings.chunkSize
    - typingsSlinky.reactFilepond.reactFilepondStrings.chunkRetryDelays
    - typingsSlinky.reactFilepond.reactFilepondStrings.files
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelDecimalSeparator
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelThousandsSeparator
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelIdle
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelInvalidField
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileWaitingForSize
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileSizeNotAvailable
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileCountSingular
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileCountPlural
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileLoading
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileAdded
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileLoadError
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileRemoved
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileRemoveError
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileProcessing
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileProcessingComplete
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileProcessingAborted
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileProcessingError
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelFileProcessingRevertError
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelTapToCancel
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelTapToRetry
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelTapToUndo
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonRemoveItem
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonAbortItemLoad
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonRetryItemLoad
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonAbortItemProcessing
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonUndoItemProcessing
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonRetryItemProcessing
    - typingsSlinky.reactFilepond.reactFilepondStrings.labelButtonProcessItem
    - typingsSlinky.reactFilepond.reactFilepondStrings.iconRemove
    - typingsSlinky.reactFilepond.reactFilepondStrings.iconProcess
    - typingsSlinky.reactFilepond.reactFilepondStrings.iconRetry
    - typingsSlinky.reactFilepond.reactFilepondStrings.iconUndo
    - typingsSlinky.reactFilepond.reactFilepondStrings.iconDone
    - typingsSlinky.reactFilepond.reactFilepondStrings.oninit
    - typingsSlinky.reactFilepond.reactFilepondStrings.onwarning
    - typingsSlinky.reactFilepond.reactFilepondStrings.onerror
    - typingsSlinky.reactFilepond.reactFilepondStrings.onaddfilestart
    - typingsSlinky.reactFilepond.reactFilepondStrings.onaddfileprogress
    - typingsSlinky.reactFilepond.reactFilepondStrings.onaddfile
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfilestart
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfileprogress
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfileabort
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfilerevert
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfile
    - typingsSlinky.reactFilepond.reactFilepondStrings.onprocessfiles
    - typingsSlinky.reactFilepond.reactFilepondStrings.onremovefile
    - typingsSlinky.reactFilepond.reactFilepondStrings.onpreparefile
    - typingsSlinky.reactFilepond.reactFilepondStrings.onupdatefiles
    - typingsSlinky.reactFilepond.reactFilepondStrings.onactivatefile
    - typingsSlinky.reactFilepond.reactFilepondStrings.onreorderfiles
    - typingsSlinky.reactFilepond.reactFilepondStrings.beforeDropFile
    - typingsSlinky.reactFilepond.reactFilepondStrings.beforeAddFile
    - typingsSlinky.reactFilepond.reactFilepondStrings.beforeRemoveFile
    - typingsSlinky.reactFilepond.reactFilepondStrings.stylePanelLayout
    - typingsSlinky.reactFilepond.reactFilepondStrings.stylePanelAspectRatio
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleItemPanelAspectRatio
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleButtonRemoveItemPosition
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleButtonProcessItemPosition
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleLoadIndicatorPosition
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleProgressIndicatorPosition
    - typingsSlinky.reactFilepond.reactFilepondStrings.styleButtonRemoveItemAlign
    - typingsSlinky.reactFilepond.reactFilepondStrings.id
    - typingsSlinky.reactFilepond.reactFilepondStrings.name
    - typingsSlinky.reactFilepond.reactFilepondStrings.className
    - typingsSlinky.reactFilepond.reactFilepondStrings.required
    - typingsSlinky.reactFilepond.reactFilepondStrings.disabled
    - typingsSlinky.reactFilepond.reactFilepondStrings.captureMethod
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowSyncAcceptAttribute
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowDrop
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowBrowse
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowPaste
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowMultiple
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowReplace
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowRevert
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowProcess
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowReorder
    - typingsSlinky.reactFilepond.reactFilepondStrings.allowDirectoriesOnly
    - typingsSlinky.reactFilepond.reactFilepondStrings.forceRevert
    - typingsSlinky.reactFilepond.reactFilepondStrings.maxFiles
    - typingsSlinky.reactFilepond.reactFilepondStrings.checkValidity
    - typingsSlinky.reactFilepond.reactFilepondStrings.itemInsertLocationFreedom
    - typingsSlinky.reactFilepond.reactFilepondStrings.itemInsertLocation
    - typingsSlinky.reactFilepond.reactFilepondStrings.itemInsertInterval
  */
  trait FilteredMethods extends StObject
  
  // Copy of Omit to retain TypeScript 3.4 compatibility (Omit is a built-in since TS 3.5)
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
