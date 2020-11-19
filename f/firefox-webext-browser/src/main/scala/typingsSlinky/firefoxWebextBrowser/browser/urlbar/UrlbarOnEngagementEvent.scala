package typingsSlinky.firefoxWebextBrowser.browser.urlbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlbarOnEngagementEvent[TCallback] extends js.Object {
  
  def addListener(cb: TCallback, providerName: String): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
object UrlbarOnEngagementEvent {
  
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): UrlbarOnEngagementEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[UrlbarOnEngagementEvent[TCallback]]
  }
  
  @scala.inline
  implicit class UrlbarOnEngagementEventOps[Self <: UrlbarOnEngagementEvent[_], TCallback] (val x: Self with UrlbarOnEngagementEvent[TCallback]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddListener(value: (TCallback, String) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasListener(value: TCallback => Boolean): Self = this.set("hasListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveListener(value: TCallback => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
  }
}
