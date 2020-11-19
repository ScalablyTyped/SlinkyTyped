package typingsSlinky.cordovaPluginFile

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides methods to monitor the asynchronous writing of blobs
  * to disk using progress events and event handler attributes.
  */
@js.native
trait FileSaver extends EventTarget {
  
  /** Terminate file operation */
  def abort(): Unit = js.native
  
  /** The last error that occurred on the FileSaver. */
  var error: js.Error = js.native
  
  /** Handler for abort events. */
  def onabort(event: ProgressEvent): Unit = js.native
  
  /** Handler for error events. */
  def onerror(event: ProgressEvent): Unit = js.native
  
  /** Handler for progress events. */
  def onprogress(event: ProgressEvent): Unit = js.native
  
  /** Handler for write events. */
  def onwrite(event: ProgressEvent): Unit = js.native
  
  /** Handler for writeend events. */
  def onwriteend(event: ProgressEvent): Unit = js.native
  
  /** Handler for writestart events. */
  def onwritestart(event: ProgressEvent): Unit = js.native
  
  /**
    * The FileSaver object can be in one of 3 states. The readyState attribute, on getting,
    * must return the current state, which must be one of the following values:
    *     INIT
    *     WRITING
    *     DONE
    */
  var readyState: Double = js.native
}
