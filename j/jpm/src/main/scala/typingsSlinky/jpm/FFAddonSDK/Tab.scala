package typingsSlinky.jpm.FFAddonSDK

import typingsSlinky.jpm.anon.ContentScriptOptions
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tab extends js.Object {
  
  def activate(): Unit = js.native
  
  def attach(options: ContentScriptOptions): ContentWorker = js.native
  
  def close(): Unit = js.native
  def close(afterClose: js.Function0[_]): Unit = js.native
  
  var contentType: String = js.native
  
  var favicon: String = js.native
  
  def getThumbnail(): String = js.native
  
  var id: String = js.native
  
  var index: Double = js.native
  
  var isPinned: Boolean = js.native
  
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
  
  var readyState: uninitialized | loading | interactive | complete = js.native
  
  def reload(): Unit = js.native
  
  var title: String = js.native
  
  def unpin(): Unit = js.native
  
  var url: String = js.native
  
  var window: BrowserWindow = js.native
}
