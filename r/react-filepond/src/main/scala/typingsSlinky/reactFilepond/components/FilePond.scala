package typingsSlinky.reactFilepond.components

import org.scalajs.dom.raw.Blob
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.filepond.anon.Fetch
import typingsSlinky.filepond.filepondStrings.after
import typingsSlinky.filepond.filepondStrings.before
import typingsSlinky.filepond.filepondStrings.circle
import typingsSlinky.filepond.filepondStrings.compact
import typingsSlinky.filepond.filepondStrings.integrated
import typingsSlinky.filepond.mod.ActualFileObject
import typingsSlinky.filepond.mod.CaptureAttribute
import typingsSlinky.filepond.mod.FilePondErrorDescription
import typingsSlinky.filepond.mod.FilePondFile
import typingsSlinky.filepond.mod.FilePondInitialFile
import typingsSlinky.reactFilepond.mod.FilePondProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilePond {
  
  @JSImport("react-filepond", "FilePond")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFilepond.mod.FilePond] {
    
    @scala.inline
    def acceptedFileTypesVarargs(value: String*): this.type = set("acceptedFileTypes", js.Array(value :_*))
    
    @scala.inline
    def acceptedFileTypes(value: js.Array[String]): this.type = set("acceptedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowBrowse(value: Boolean): this.type = set("allowBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowDirectoriesOnly(value: Boolean): this.type = set("allowDirectoriesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowDrop(value: Boolean): this.type = set("allowDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowMultiple(value: Boolean): this.type = set("allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowPaste(value: Boolean): this.type = set("allowPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowProcess(value: Boolean): this.type = set("allowProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowReorder(value: Boolean): this.type = set("allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowReplace(value: Boolean): this.type = set("allowReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowRevert(value: Boolean): this.type = set("allowRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowSyncAcceptAttribute(value: Boolean): this.type = set("allowSyncAcceptAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeAddFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): this.type = set("beforeAddFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def beforeDropFile(value: /* file */ FilePondFile | String => Boolean): this.type = set("beforeDropFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def beforeRemoveFile(value: /* item */ FilePondFile => Boolean | js.Promise[Boolean]): this.type = set("beforeRemoveFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def captureMethod(value: CaptureAttribute): this.type = set("captureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captureMethodNull: this.type = set("captureMethod", null)
    
    @scala.inline
    def checkValidity(value: Boolean): this.type = set("checkValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chunkForce(value: Boolean): this.type = set("chunkForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chunkRetryDelaysVarargs(value: Double*): this.type = set("chunkRetryDelays", js.Array(value :_*))
    
    @scala.inline
    def chunkRetryDelays(value: js.Array[Double]): this.type = set("chunkRetryDelays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chunkSize(value: Double): this.type = set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chunkUploads(value: Boolean): this.type = set("chunkUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNameNull: this.type = set("className", null)
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropOnElement(value: Boolean): this.type = set("dropOnElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropOnPage(value: Boolean): this.type = set("dropOnPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropValidation(value: Boolean): this.type = set("dropValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filesVarargs(value: (FilePondInitialFile | ActualFileObject | Blob | String)*): this.type = set("files", js.Array(value :_*))
    
    @scala.inline
    def files(value: js.Array[FilePondInitialFile | ActualFileObject | Blob | String]): this.type = set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceRevert(value: Boolean): this.type = set("forceRevert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconDone(value: String): this.type = set("iconDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconProcess(value: String): this.type = set("iconProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRemove(value: String): this.type = set("iconRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconRetry(value: String): this.type = set("iconRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconUndo(value: String): this.type = set("iconUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def idNull: this.type = set("id", null)
    
    @scala.inline
    def ignoredFilesVarargs(value: String*): this.type = set("ignoredFiles", js.Array(value :_*))
    
    @scala.inline
    def ignoredFiles(value: js.Array[String]): this.type = set("ignoredFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def instantUpload(value: Boolean): this.type = set("instantUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemInsertInterval(value: Double): this.type = set("itemInsertInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemInsertLocationFunction2(value: (/* a */ FilePondFile, /* b */ FilePondFile) => Double): this.type = set("itemInsertLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def itemInsertLocation(value: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double])): this.type = set("itemInsertLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemInsertLocationFreedom(value: Boolean): this.type = set("itemInsertLocationFreedom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonAbortItemLoad(value: String): this.type = set("labelButtonAbortItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonAbortItemProcessing(value: String): this.type = set("labelButtonAbortItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonProcessItem(value: String): this.type = set("labelButtonProcessItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonRemoveItem(value: String): this.type = set("labelButtonRemoveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonRetryItemLoad(value: String): this.type = set("labelButtonRetryItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonRetryItemProcessing(value: String): this.type = set("labelButtonRetryItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelButtonUndoItemProcessing(value: String): this.type = set("labelButtonUndoItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelDecimalSeparator(value: String): this.type = set("labelDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileAdded(value: String): this.type = set("labelFileAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileCountPlural(value: String): this.type = set("labelFileCountPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileCountSingular(value: String): this.type = set("labelFileCountSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileLoadErrorFunction1(value: /* error */ js.Any => String): this.type = set("labelFileLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelFileLoadError(value: (js.Function1[/* error */ js.Any, String]) | String): this.type = set("labelFileLoadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileLoading(value: String): this.type = set("labelFileLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileProcessing(value: String): this.type = set("labelFileProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileProcessingAborted(value: String): this.type = set("labelFileProcessingAborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileProcessingComplete(value: String): this.type = set("labelFileProcessingComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileProcessingErrorFunction1(value: /* error */ js.Any => String): this.type = set("labelFileProcessingError", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelFileProcessingError(value: (js.Function1[/* error */ js.Any, String]) | String): this.type = set("labelFileProcessingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileProcessingRevertErrorFunction1(value: /* error */ js.Any => String): this.type = set("labelFileProcessingRevertError", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelFileProcessingRevertError(value: (js.Function1[/* error */ js.Any, String]) | String): this.type = set("labelFileProcessingRevertError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileRemoveErrorFunction1(value: /* error */ js.Any => String): this.type = set("labelFileRemoveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelFileRemoveError(value: (js.Function1[/* error */ js.Any, String]) | String): this.type = set("labelFileRemoveError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileRemoved(value: String): this.type = set("labelFileRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileSizeNotAvailable(value: String): this.type = set("labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFileWaitingForSize(value: String): this.type = set("labelFileWaitingForSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelIdle(value: String): this.type = set("labelIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelInvalidField(value: String): this.type = set("labelInvalidField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelTapToCancel(value: String): this.type = set("labelTapToCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelTapToRetry(value: String): this.type = set("labelTapToRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelTapToUndo(value: String): this.type = set("labelTapToUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelThousandsSeparator(value: String): this.type = set("labelThousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFiles(value: Double): this.type = set("maxFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxFilesNull: this.type = set("maxFiles", null)
    
    @scala.inline
    def maxParallelUploads(value: Double): this.type = set("maxParallelUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onactivatefile(value: /* file */ FilePondFile => Unit): this.type = set("onactivatefile", js.Any.fromFunction1(value))
    
    @scala.inline
    def onaddfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): this.type = set("onaddfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def onaddfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Unit): this.type = set("onaddfileprogress", js.Any.fromFunction2(value))
    
    @scala.inline
    def onaddfilestart(value: /* file */ FilePondFile => Unit): this.type = set("onaddfilestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onerror", js.Any.fromFunction3(value))
    
    @scala.inline
    def oninit(value: () => Unit): this.type = set("oninit", js.Any.fromFunction0(value))
    
    @scala.inline
    def onpreparefile(value: (/* file */ FilePondFile, /* output */ js.Any) => Unit): this.type = set("onpreparefile", js.Any.fromFunction2(value))
    
    @scala.inline
    def onprocessfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): this.type = set("onprocessfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def onprocessfileabort(value: /* file */ FilePondFile => Unit): this.type = set("onprocessfileabort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onprocessfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Unit): this.type = set("onprocessfileprogress", js.Any.fromFunction2(value))
    
    @scala.inline
    def onprocessfilerevert(value: /* file */ FilePondFile => Unit): this.type = set("onprocessfilerevert", js.Any.fromFunction1(value))
    
    @scala.inline
    def onprocessfiles(value: () => Unit): this.type = set("onprocessfiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def onprocessfilestart(value: /* file */ FilePondFile => Unit): this.type = set("onprocessfilestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onremovefile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): this.type = set("onremovefile", js.Any.fromFunction2(value))
    
    @scala.inline
    def onreorderfiles(value: /* files */ js.Array[FilePondFile] => Unit): this.type = set("onreorderfiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def onupdatefiles(value: /* files */ js.Array[FilePondFile] => Unit): this.type = set("onupdatefiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def onwarning(
      value: (/* error */ js.Any, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onwarning", js.Any.fromFunction3(value))
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def server(value: String | Fetch): this.type = set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def serverNull: this.type = set("server", null)
    
    @scala.inline
    def styleButtonProcessItemPosition(value: String): this.type = set("styleButtonProcessItemPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleButtonRemoveItemAlign(value: Boolean): this.type = set("styleButtonRemoveItemAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleButtonRemoveItemPosition(value: String): this.type = set("styleButtonRemoveItemPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleItemPanelAspectRatio(value: String): this.type = set("styleItemPanelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleItemPanelAspectRatioNull: this.type = set("styleItemPanelAspectRatio", null)
    
    @scala.inline
    def styleLoadIndicatorPosition(value: String): this.type = set("styleLoadIndicatorPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylePanelAspectRatio(value: String): this.type = set("stylePanelAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylePanelAspectRatioNull: this.type = set("stylePanelAspectRatio", null)
    
    @scala.inline
    def stylePanelLayout(value: integrated | compact | circle): this.type = set("stylePanelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stylePanelLayoutNull: this.type = set("stylePanelLayout", null)
    
    @scala.inline
    def styleProgressIndicatorPosition(value: String): this.type = set("styleProgressIndicatorPosition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FilePondProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FilePond.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
