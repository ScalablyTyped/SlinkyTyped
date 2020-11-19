package typingsSlinky.nprogress.mod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.nprogress.anon.PartialNProgressOptions
import typingsSlinky.nprogress.nprogressStrings.margin
import typingsSlinky.nprogress.nprogressStrings.translate
import typingsSlinky.nprogress.nprogressStrings.translate3d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NProgress extends js.Object {
  
  def configure(options: PartialNProgressOptions): NProgress = js.native
  
  def done(): NProgress = js.native
  def done(force: Boolean): NProgress = js.native
  
  def getPositioningCSS(): translate3d | translate | margin = js.native
  
  def inc(): NProgress = js.native
  def inc(amount: Double): NProgress = js.native
  
  def isRendered(): Boolean = js.native
  
  def isStarted(): Boolean = js.native
  
  def remove(): Unit = js.native
  
  /* Internal */
  def render(): HTMLDivElement = js.native
  def render(fromStart: Boolean): HTMLDivElement = js.native
  
  def set(number: Double): NProgress = js.native
  
  var settings: NProgressOptions = js.native
  
  def start(): NProgress = js.native
  
  var status: Double | Null = js.native
  
  def trickle(): NProgress = js.native
  
  var version: String = js.native
}
