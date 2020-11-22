package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "DataFeedApi")
@js.native
class DataFeedApi protected () extends js.Object {
  def this(apiClient: ApiClient) = this()
  
  def getDataFeedElement(accountId: String, dataFeedElementId: String): js.Promise[Unit] = js.native
  def getDataFeedElement(accountId: String, dataFeedElementId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
}
