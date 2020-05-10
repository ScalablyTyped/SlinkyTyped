package typingsSlinky.reactFilepond.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFilepond.AnonFetch
import typingsSlinky.reactFilepond.mod.FilePondErrorDescription
import typingsSlinky.reactFilepond.mod.FilePondProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilePond {
  @JSImport("react-filepond", "FilePond")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFilepond.mod.FilePond] {
    @scala.inline
    def acceptedFileTypes(value: js.Array[String]): this.type = set("acceptedFileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def allowBrowse(value: Boolean): this.type = set("allowBrowse", value.asInstanceOf[js.Any])
    @scala.inline
    def allowDrop(value: Boolean): this.type = set("allowDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def allowMultiple(value: Boolean): this.type = set("allowMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def allowPaste(value: Boolean): this.type = set("allowPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def allowReplace(value: Boolean): this.type = set("allowReplace", value.asInstanceOf[js.Any])
    @scala.inline
    def allowRevert(value: Boolean): this.type = set("allowRevert", value.asInstanceOf[js.Any])
    @scala.inline
    def beforeRemoveFile(value: /* file */ typingsSlinky.reactFilepond.mod.File => Boolean): this.type = set("beforeRemoveFile", js.Any.fromFunction1(value))
    @scala.inline
    def captureMethod(value: js.Any): this.type = set("captureMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def dropOnElement(value: Boolean): this.type = set("dropOnElement", value.asInstanceOf[js.Any])
    @scala.inline
    def dropOnPage(value: Boolean): this.type = set("dropOnPage", value.asInstanceOf[js.Any])
    @scala.inline
    def dropValidation(value: Boolean): this.type = set("dropValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def files(value: js.Array[typingsSlinky.reactFilepond.mod.File]): this.type = set("files", value.asInstanceOf[js.Any])
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
    def ignoredFiles(value: js.Array[String]): this.type = set("ignoredFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def instantUpload(value: Boolean): this.type = set("instantUpload", value.asInstanceOf[js.Any])
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
    def labelFileLoadError(value: String): this.type = set("labelFileLoadError", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileLoading(value: String): this.type = set("labelFileLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileProcessing(value: String): this.type = set("labelFileProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileProcessingAborted(value: String): this.type = set("labelFileProcessingAborted", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileProcessingComplete(value: String): this.type = set("labelFileProcessingComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileProcessingError(value: String): this.type = set("labelFileProcessingError", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileSizeNotAvailable(value: String): this.type = set("labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFileWaitingForSize(value: String): this.type = set("labelFileWaitingForSize", value.asInstanceOf[js.Any])
    @scala.inline
    def labelIdle(value: String): this.type = set("labelIdle", value.asInstanceOf[js.Any])
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
    def maxParallelUploads(value: Double): this.type = set("maxParallelUploads", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def onaddfile(
      value: (/* error */ FilePondErrorDescription, /* file */ typingsSlinky.reactFilepond.mod.File) => Unit
    ): this.type = set("onaddfile", js.Any.fromFunction2(value))
    @scala.inline
    def onaddfileprogress(value: (/* file */ typingsSlinky.reactFilepond.mod.File, /* progress */ Double) => Unit): this.type = set("onaddfileprogress", js.Any.fromFunction2(value))
    @scala.inline
    def onaddfilestart(value: /* file */ typingsSlinky.reactFilepond.mod.File => Unit): this.type = set("onaddfilestart", js.Any.fromFunction1(value))
    @scala.inline
    def onerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[typingsSlinky.reactFilepond.mod.File], /* status */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onerror", js.Any.fromFunction3(value))
    @scala.inline
    def oninit(value: () => Unit): this.type = set("oninit", js.Any.fromFunction0(value))
    @scala.inline
    def onpreparefile(value: (/* file */ typingsSlinky.reactFilepond.mod.File, /* output */ js.Any) => Unit): this.type = set("onpreparefile", js.Any.fromFunction2(value))
    @scala.inline
    def onprocessfile(
      value: (/* error */ FilePondErrorDescription, /* file */ typingsSlinky.reactFilepond.mod.File) => Unit
    ): this.type = set("onprocessfile", js.Any.fromFunction2(value))
    @scala.inline
    def onprocessfileabort(value: /* file */ typingsSlinky.reactFilepond.mod.File => Unit): this.type = set("onprocessfileabort", js.Any.fromFunction1(value))
    @scala.inline
    def onprocessfileprogress(value: (/* file */ typingsSlinky.reactFilepond.mod.File, /* progress */ Double) => Unit): this.type = set("onprocessfileprogress", js.Any.fromFunction2(value))
    @scala.inline
    def onprocessfilestart(value: /* file */ typingsSlinky.reactFilepond.mod.File => Unit): this.type = set("onprocessfilestart", js.Any.fromFunction1(value))
    @scala.inline
    def onprocessfileundo(value: /* file */ typingsSlinky.reactFilepond.mod.File => Unit): this.type = set("onprocessfileundo", js.Any.fromFunction1(value))
    @scala.inline
    def onremovefile(value: /* file */ typingsSlinky.reactFilepond.mod.File => Unit): this.type = set("onremovefile", js.Any.fromFunction1(value))
    @scala.inline
    def onupdatefiles(value: /* fileItems */ js.Array[typingsSlinky.reactFilepond.mod.File] => Unit): this.type = set("onupdatefiles", js.Any.fromFunction1(value))
    @scala.inline
    def onwarning(
      value: (/* error */ js.Any, /* file */ js.UndefOr[typingsSlinky.reactFilepond.mod.File], /* status */ js.UndefOr[js.Any]) => Unit
    ): this.type = set("onwarning", js.Any.fromFunction3(value))
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def server(value: String | AnonFetch): this.type = set("server", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FilePondProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FilePond.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

