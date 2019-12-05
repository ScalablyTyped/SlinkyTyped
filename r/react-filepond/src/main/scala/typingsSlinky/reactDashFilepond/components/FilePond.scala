package typingsSlinky.reactDashFilepond.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFilepond.Anon_Fetch
import typingsSlinky.reactDashFilepond.reactDashFilepondMod.FilePondErrorDescription
import typingsSlinky.reactDashFilepond.reactDashFilepondMod.FilePondProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilePond
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashFilepond.reactDashFilepondMod.FilePond] {
  @JSImport("react-filepond", "FilePond")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, name, required */
  def apply(
    acceptedFileTypes: js.Array[String] = null,
    allowBrowse: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    allowPaste: js.UndefOr[Boolean] = js.undefined,
    allowReplace: js.UndefOr[Boolean] = js.undefined,
    allowRevert: js.UndefOr[Boolean] = js.undefined,
    beforeRemoveFile: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Boolean = null,
    captureMethod: js.Any = null,
    dropOnElement: js.UndefOr[Boolean] = js.undefined,
    dropOnPage: js.UndefOr[Boolean] = js.undefined,
    dropValidation: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[typingsSlinky.reactDashFilepond.reactDashFilepondMod.File] = null,
    iconProcess: String = null,
    iconRemove: String = null,
    iconRetry: String = null,
    iconUndo: String = null,
    ignoredFiles: js.Array[String] = null,
    instantUpload: js.UndefOr[Boolean] = js.undefined,
    labelButtonAbortItemLoad: String = null,
    labelButtonAbortItemProcessing: String = null,
    labelButtonProcessItem: String = null,
    labelButtonRemoveItem: String = null,
    labelButtonRetryItemLoad: String = null,
    labelButtonRetryItemProcessing: String = null,
    labelButtonUndoItemProcessing: String = null,
    labelDecimalSeparator: String = null,
    labelFileLoadError: String = null,
    labelFileLoading: String = null,
    labelFileProcessing: String = null,
    labelFileProcessingAborted: String = null,
    labelFileProcessingComplete: String = null,
    labelFileProcessingError: String = null,
    labelFileSizeNotAvailable: String = null,
    labelFileWaitingForSize: String = null,
    labelIdle: String = null,
    labelTapToCancel: String = null,
    labelTapToRetry: String = null,
    labelTapToUndo: String = null,
    labelThousandsSeparator: String = null,
    maxFiles: Int | Double = null,
    maxParallelUploads: Int | Double = null,
    metadata: StringDictionary[js.Any] = null,
    onaddfile: (/* error */ FilePondErrorDescription, /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File) => Unit = null,
    onaddfileprogress: (/* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File, /* progress */ Double) => Unit = null,
    onaddfilestart: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Unit = null,
    onerror: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[typingsSlinky.reactDashFilepond.reactDashFilepondMod.File], /* status */ js.UndefOr[js.Any]) => Unit = null,
    oninit: () => Unit = null,
    onpreparefile: (/* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File, /* output */ js.Any) => Unit = null,
    onprocessfile: (/* error */ FilePondErrorDescription, /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File) => Unit = null,
    onprocessfileabort: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Unit = null,
    onprocessfileprogress: (/* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File, /* progress */ Double) => Unit = null,
    onprocessfilestart: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Unit = null,
    onprocessfileundo: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Unit = null,
    onremovefile: /* file */ typingsSlinky.reactDashFilepond.reactDashFilepondMod.File => Unit = null,
    onupdatefiles: /* fileItems */ js.Array[typingsSlinky.reactDashFilepond.reactDashFilepondMod.File] => Unit = null,
    onwarning: (/* error */ js.Any, /* file */ js.UndefOr[typingsSlinky.reactDashFilepond.reactDashFilepondMod.File], /* status */ js.UndefOr[js.Any]) => Unit = null,
    server: String | Anon_Fetch = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashFilepond.reactDashFilepondMod.FilePond] = {
    val __obj = js.Dynamic.literal()
    if (acceptedFileTypes != null) __obj.updateDynamic("acceptedFileTypes")(acceptedFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBrowse)) __obj.updateDynamic("allowBrowse")(allowBrowse.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPaste)) __obj.updateDynamic("allowPaste")(allowPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReplace)) __obj.updateDynamic("allowReplace")(allowReplace.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRevert)) __obj.updateDynamic("allowRevert")(allowRevert.asInstanceOf[js.Any])
    if (beforeRemoveFile != null) __obj.updateDynamic("beforeRemoveFile")(js.Any.fromFunction1(beforeRemoveFile))
    if (captureMethod != null) __obj.updateDynamic("captureMethod")(captureMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnElement)) __obj.updateDynamic("dropOnElement")(dropOnElement.asInstanceOf[js.Any])
    if (!js.isUndefined(dropOnPage)) __obj.updateDynamic("dropOnPage")(dropOnPage.asInstanceOf[js.Any])
    if (!js.isUndefined(dropValidation)) __obj.updateDynamic("dropValidation")(dropValidation.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (iconProcess != null) __obj.updateDynamic("iconProcess")(iconProcess.asInstanceOf[js.Any])
    if (iconRemove != null) __obj.updateDynamic("iconRemove")(iconRemove.asInstanceOf[js.Any])
    if (iconRetry != null) __obj.updateDynamic("iconRetry")(iconRetry.asInstanceOf[js.Any])
    if (iconUndo != null) __obj.updateDynamic("iconUndo")(iconUndo.asInstanceOf[js.Any])
    if (ignoredFiles != null) __obj.updateDynamic("ignoredFiles")(ignoredFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(instantUpload)) __obj.updateDynamic("instantUpload")(instantUpload.asInstanceOf[js.Any])
    if (labelButtonAbortItemLoad != null) __obj.updateDynamic("labelButtonAbortItemLoad")(labelButtonAbortItemLoad.asInstanceOf[js.Any])
    if (labelButtonAbortItemProcessing != null) __obj.updateDynamic("labelButtonAbortItemProcessing")(labelButtonAbortItemProcessing.asInstanceOf[js.Any])
    if (labelButtonProcessItem != null) __obj.updateDynamic("labelButtonProcessItem")(labelButtonProcessItem.asInstanceOf[js.Any])
    if (labelButtonRemoveItem != null) __obj.updateDynamic("labelButtonRemoveItem")(labelButtonRemoveItem.asInstanceOf[js.Any])
    if (labelButtonRetryItemLoad != null) __obj.updateDynamic("labelButtonRetryItemLoad")(labelButtonRetryItemLoad.asInstanceOf[js.Any])
    if (labelButtonRetryItemProcessing != null) __obj.updateDynamic("labelButtonRetryItemProcessing")(labelButtonRetryItemProcessing.asInstanceOf[js.Any])
    if (labelButtonUndoItemProcessing != null) __obj.updateDynamic("labelButtonUndoItemProcessing")(labelButtonUndoItemProcessing.asInstanceOf[js.Any])
    if (labelDecimalSeparator != null) __obj.updateDynamic("labelDecimalSeparator")(labelDecimalSeparator.asInstanceOf[js.Any])
    if (labelFileLoadError != null) __obj.updateDynamic("labelFileLoadError")(labelFileLoadError.asInstanceOf[js.Any])
    if (labelFileLoading != null) __obj.updateDynamic("labelFileLoading")(labelFileLoading.asInstanceOf[js.Any])
    if (labelFileProcessing != null) __obj.updateDynamic("labelFileProcessing")(labelFileProcessing.asInstanceOf[js.Any])
    if (labelFileProcessingAborted != null) __obj.updateDynamic("labelFileProcessingAborted")(labelFileProcessingAborted.asInstanceOf[js.Any])
    if (labelFileProcessingComplete != null) __obj.updateDynamic("labelFileProcessingComplete")(labelFileProcessingComplete.asInstanceOf[js.Any])
    if (labelFileProcessingError != null) __obj.updateDynamic("labelFileProcessingError")(labelFileProcessingError.asInstanceOf[js.Any])
    if (labelFileSizeNotAvailable != null) __obj.updateDynamic("labelFileSizeNotAvailable")(labelFileSizeNotAvailable.asInstanceOf[js.Any])
    if (labelFileWaitingForSize != null) __obj.updateDynamic("labelFileWaitingForSize")(labelFileWaitingForSize.asInstanceOf[js.Any])
    if (labelIdle != null) __obj.updateDynamic("labelIdle")(labelIdle.asInstanceOf[js.Any])
    if (labelTapToCancel != null) __obj.updateDynamic("labelTapToCancel")(labelTapToCancel.asInstanceOf[js.Any])
    if (labelTapToRetry != null) __obj.updateDynamic("labelTapToRetry")(labelTapToRetry.asInstanceOf[js.Any])
    if (labelTapToUndo != null) __obj.updateDynamic("labelTapToUndo")(labelTapToUndo.asInstanceOf[js.Any])
    if (labelThousandsSeparator != null) __obj.updateDynamic("labelThousandsSeparator")(labelThousandsSeparator.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxParallelUploads != null) __obj.updateDynamic("maxParallelUploads")(maxParallelUploads.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (onaddfile != null) __obj.updateDynamic("onaddfile")(js.Any.fromFunction2(onaddfile))
    if (onaddfileprogress != null) __obj.updateDynamic("onaddfileprogress")(js.Any.fromFunction2(onaddfileprogress))
    if (onaddfilestart != null) __obj.updateDynamic("onaddfilestart")(js.Any.fromFunction1(onaddfilestart))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction3(onerror))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (onpreparefile != null) __obj.updateDynamic("onpreparefile")(js.Any.fromFunction2(onpreparefile))
    if (onprocessfile != null) __obj.updateDynamic("onprocessfile")(js.Any.fromFunction2(onprocessfile))
    if (onprocessfileabort != null) __obj.updateDynamic("onprocessfileabort")(js.Any.fromFunction1(onprocessfileabort))
    if (onprocessfileprogress != null) __obj.updateDynamic("onprocessfileprogress")(js.Any.fromFunction2(onprocessfileprogress))
    if (onprocessfilestart != null) __obj.updateDynamic("onprocessfilestart")(js.Any.fromFunction1(onprocessfilestart))
    if (onprocessfileundo != null) __obj.updateDynamic("onprocessfileundo")(js.Any.fromFunction1(onprocessfileundo))
    if (onremovefile != null) __obj.updateDynamic("onremovefile")(js.Any.fromFunction1(onremovefile))
    if (onupdatefiles != null) __obj.updateDynamic("onupdatefiles")(js.Any.fromFunction1(onupdatefiles))
    if (onwarning != null) __obj.updateDynamic("onwarning")(js.Any.fromFunction3(onwarning))
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FilePondProps
}

