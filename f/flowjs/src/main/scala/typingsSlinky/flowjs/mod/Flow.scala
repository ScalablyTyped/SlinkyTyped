package typingsSlinky.flowjs.mod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.flowjs.flowjsStrings.catchAll
import typingsSlinky.flowjs.flowjsStrings.complete
import typingsSlinky.flowjs.flowjsStrings.error
import typingsSlinky.flowjs.flowjsStrings.fileAdded
import typingsSlinky.flowjs.flowjsStrings.fileError
import typingsSlinky.flowjs.flowjsStrings.fileProgress
import typingsSlinky.flowjs.flowjsStrings.fileRemoved
import typingsSlinky.flowjs.flowjsStrings.fileRetry
import typingsSlinky.flowjs.flowjsStrings.fileSuccess
import typingsSlinky.flowjs.flowjsStrings.filesAdded
import typingsSlinky.flowjs.flowjsStrings.filesSubmitted
import typingsSlinky.flowjs.flowjsStrings.progress
import typingsSlinky.flowjs.flowjsStrings.uploadStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends js.Object {
  
  def addFile(file: File): Unit = js.native
  
  def assignBrowse(domNodes: js.Array[HTMLElement]): Unit = js.native
  def assignBrowse(
    domNodes: js.Array[HTMLElement],
    isDirectory: js.UndefOr[scala.Nothing],
    singleFile: js.UndefOr[scala.Nothing],
    attributes: js.Object
  ): Unit = js.native
  def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: js.UndefOr[scala.Nothing], singleFile: Boolean): Unit = js.native
  def assignBrowse(
    domNodes: js.Array[HTMLElement],
    isDirectory: js.UndefOr[scala.Nothing],
    singleFile: Boolean,
    attributes: js.Object
  ): Unit = js.native
  def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean): Unit = js.native
  def assignBrowse(
    domNodes: js.Array[HTMLElement],
    isDirectory: Boolean,
    singleFile: js.UndefOr[scala.Nothing],
    attributes: js.Object
  ): Unit = js.native
  def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean): Unit = js.native
  def assignBrowse(domNodes: js.Array[HTMLElement], isDirectory: Boolean, singleFile: Boolean, attributes: js.Object): Unit = js.native
  
  def assignDrop(node: js.Array[HTMLElement]): Unit = js.native
  def assignDrop(node: HTMLElement): Unit = js.native
  
  def cancel(): Unit = js.native
  
  var files: js.Array[FlowFile] = js.native
  
  def getFromUniqueIdentifier(uniqueIdentifier: String): FlowFile = js.native
  
  def getSize(): Double = js.native
  
  def isUploading(): Boolean = js.native
  
  def off(): Unit = js.native
  def off(event: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def off(event: EventName): Unit = js.native
  def off(event: EventName, callback: js.Function0[Unit]): Unit = js.native
  
  @JSName("on")
  def on_catchAll(event: catchAll, callback: js.Function1[/* args */ CatchAllCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_complete(event: complete, callback: js.Function1[/* args */ CompleteCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* args */ ErrorCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileAdded(event: fileAdded, callback: js.Function1[/* args */ FileAddedCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileError(event: fileError, callback: js.Function1[/* args */ FileErrorCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileProgress(event: fileProgress, callback: js.Function1[/* args */ FileProgressCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileRemoved(event: fileRemoved, callback: js.Function1[/* args */ FileRemovedCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileRetry(event: fileRetry, callback: js.Function1[/* args */ FileRetryCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_fileSuccess(event: fileSuccess, callback: js.Function1[/* args */ FileSuccessCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_filesAdded(event: filesAdded, callback: js.Function1[/* args */ FilesAddedCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_filesSubmitted(event: filesSubmitted, callback: js.Function1[/* args */ FilesSubmittedCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_progress(event: progress, callback: js.Function1[/* args */ ProgressCallbackArguments, Unit]): Unit = js.native
  @JSName("on")
  def on_uploadStart(event: uploadStart, callback: js.Function1[/* args */ UploadStartCallbackArguments, Unit]): Unit = js.native
  
  var opts: FlowOptions = js.native
  
  def pause(): Unit = js.native
  
  def progress(): Double = js.native
  
  def removeFile(file: FlowFile): Unit = js.native
  
  def resume(): Unit = js.native
  
  def sizeUploaded(): Double = js.native
  
  var support: Boolean = js.native
  
  var supportDirectory: Boolean = js.native
  
  def timeRemaining(): Double = js.native
  
  def unAssignDrop(node: js.Array[HTMLElement]): Unit = js.native
  def unAssignDrop(node: HTMLElement): Unit = js.native
  
  def upload(): Unit = js.native
}
