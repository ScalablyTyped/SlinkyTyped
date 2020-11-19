package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapabilitiesProvider extends DataProvider {
  
  def getServerCapabilities(client: DataProtocolClientCapabilities): Thenable[DataProtocolServerCapabilities] = js.native
}
object CapabilitiesProvider {
  
  @scala.inline
  def apply(
    getServerCapabilities: DataProtocolClientCapabilities => Thenable[DataProtocolServerCapabilities],
    providerId: String
  ): CapabilitiesProvider = {
    val __obj = js.Dynamic.literal(getServerCapabilities = js.Any.fromFunction1(getServerCapabilities), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesProvider]
  }
  
  @scala.inline
  implicit class CapabilitiesProviderOps[Self <: CapabilitiesProvider] (val x: Self) extends AnyVal {
    
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
    def setGetServerCapabilities(value: DataProtocolClientCapabilities => Thenable[DataProtocolServerCapabilities]): Self = this.set("getServerCapabilities", js.Any.fromFunction1(value))
  }
}
