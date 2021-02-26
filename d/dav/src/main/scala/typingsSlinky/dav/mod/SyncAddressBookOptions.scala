package typingsSlinky.dav.mod

import typingsSlinky.dav.davStrings.basic
import typingsSlinky.dav.davStrings.webdav
import typingsSlinky.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncAddressBookOptions extends StObject {
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  
  /**
    * either 'basic' or 'webdav'.If unspecified, will try to do webdav sync
    * and failover to basic sync if rfc 6578 is not supported by the server.
    */
  var syncMethod: js.UndefOr[basic | webdav] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object SyncAddressBookOptions {
  
  @scala.inline
  def apply(): SyncAddressBookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncAddressBookOptions]
  }
  
  @scala.inline
  implicit class SyncAddressBookOptionsMutableBuilder[Self <: SyncAddressBookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setSyncMethod(value: basic | webdav): Self = StObject.set(x, "syncMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncMethodUndefined: Self = StObject.set(x, "syncMethod", js.undefined)
    
    @scala.inline
    def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
