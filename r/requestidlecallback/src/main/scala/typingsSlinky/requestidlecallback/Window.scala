package typingsSlinky.requestidlecallback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  def requestIdleCallback(callback: IdleRequestCallback): IdleCallbackHandle = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): IdleCallbackHandle = js.native
}
