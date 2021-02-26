package typingsSlinky.amazonConnectStreams.connect

import typingsSlinky.amazonConnectStreams.anon.ChatAutoAccept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatMediaInfo extends StObject {
  
  val contactId: String = js.native
  
  def getConnectionToken(): js.Promise[ConnectionToken] = js.native
  @JSName("getConnectionToken")
  var getConnectionToken_Original: js.Function0[js.Promise[ConnectionToken]] = js.native
  
  val initialContactId: String = js.native
  
  val originalInfo: ChatAutoAccept = js.native
  
  val participantId: String = js.native
  
  val participantToken: String = js.native
}
