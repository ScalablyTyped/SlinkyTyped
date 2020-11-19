package typingsSlinky.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToBuilder extends js.Object {
  
  /** Create a concat-stream and pipe output from markdown-pdf to it. The callback function cb will be invoked when the buffer has been created. */
  def buffer(opts: js.Any): Unit = js.native
  def buffer(opts: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Create a writeable stream to path and pipe output from markdown-pdf to it.
    * path can be a single path, or array of output paths if you specified an array of inputs.
    * The callback function cb will be invoked when data has finished being written.
    */
  def path(path: String): Unit = js.native
  def path(path: String, callback: js.Function0[Unit]): Unit = js.native
  
  /** Create a concat-stream and pipe output from markdown-pdf to it. The callback function cb will be invoked when the string has been created. */
  def string(opts: js.Any): Unit = js.native
  def string(opts: js.Any, callback: js.Function0[Unit]): Unit = js.native
}
