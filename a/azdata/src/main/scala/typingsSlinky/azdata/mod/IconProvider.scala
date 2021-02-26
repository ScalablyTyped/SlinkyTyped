package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconProvider extends DataProvider {
  
  def getConnectionIconId(connection: IConnectionProfile, serverInfo: ServerInfo): Thenable[String] = js.native
}
object IconProvider {
  
  @scala.inline
  def apply(getConnectionIconId: (IConnectionProfile, ServerInfo) => Thenable[String], providerId: String): IconProvider = {
    val __obj = js.Dynamic.literal(getConnectionIconId = js.Any.fromFunction2(getConnectionIconId), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProvider]
  }
  
  @scala.inline
  implicit class IconProviderMutableBuilder[Self <: IconProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetConnectionIconId(value: (IConnectionProfile, ServerInfo) => Thenable[String]): Self = StObject.set(x, "getConnectionIconId", js.Any.fromFunction2(value))
  }
}
