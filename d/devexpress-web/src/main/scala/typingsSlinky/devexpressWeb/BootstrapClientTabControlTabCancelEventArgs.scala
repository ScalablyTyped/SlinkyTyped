package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events related to manipulations on tabs.
  */
@js.native
trait BootstrapClientTabControlTabCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets or sets a value specifying whether a callback should be sent to the server to reload the content of the page being activated.
    */
  var reloadContentOnCallback: Boolean = js.native
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: BootstrapClientTab = js.native
}
object BootstrapClientTabControlTabCancelEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    processOnServer: Boolean,
    reloadContentOnCallback: Boolean,
    tab: BootstrapClientTab
  ): BootstrapClientTabControlTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], reloadContentOnCallback = reloadContentOnCallback.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTabControlTabCancelEventArgs]
  }
  
  @scala.inline
  implicit class BootstrapClientTabControlTabCancelEventArgsMutableBuilder[Self <: BootstrapClientTabControlTabCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReloadContentOnCallback(value: Boolean): Self = StObject.set(x, "reloadContentOnCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: BootstrapClientTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
