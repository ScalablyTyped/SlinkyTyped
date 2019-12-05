package typingsSlinky.jpm.FFAddonSDK

import typingsSlinky.jpm.Anon_ContentScriptContentScriptFile
import typingsSlinky.jpm.jpmStrings.activate
import typingsSlinky.jpm.jpmStrings.close
import typingsSlinky.jpm.jpmStrings.complete
import typingsSlinky.jpm.jpmStrings.deactivate
import typingsSlinky.jpm.jpmStrings.interactive
import typingsSlinky.jpm.jpmStrings.load
import typingsSlinky.jpm.jpmStrings.loading
import typingsSlinky.jpm.jpmStrings.pageshow
import typingsSlinky.jpm.jpmStrings.ready
import typingsSlinky.jpm.jpmStrings.uninitialized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  var contentType: String = js.native
  var favicon: String = js.native
  var id: String = js.native
  var index: Double = js.native
  var isPinned: Boolean = js.native
  var readyState: uninitialized | loading | interactive | complete = js.native
  var title: String = js.native
  var url: String = js.native
  var window: BrowserWindow = js.native
  def activate(): Unit = js.native
  def attach(options: Anon_ContentScriptContentScriptFile): ContentWorker = js.native
  def close(): Unit = js.native
  def close(afterClose: js.Function0[_]): Unit = js.native
  def getThumbnail(): String = js.native
  @JSName("on")
  def on_activate(event: activate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_close(event: close, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_deactivate(event: deactivate, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_load(event: load, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_pageshow(event: pageshow, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function1[/* tab */ this.type, _]): Unit = js.native
  def pin(): Unit = js.native
  def reload(): Unit = js.native
  def unpin(): Unit = js.native
}

