package typingsSlinky.rsocketDashTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.CLOSED
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.CONNECTED
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.CONNECTING
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.ERROR
import typingsSlinky.rsocketDashTypes.rsocketDashTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketDashTypes.Anon_Kind
  - typings.rsocketDashTypes.Anon_CONNECTING
  - typings.rsocketDashTypes.Anon_CONNECTED
  - typings.rsocketDashTypes.Anon_CLOSED
  - typings.rsocketDashTypes.Anon_ERROR
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def Anon_CLOSED(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_ERROR(error: js.Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_Kind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_CONNECTED(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon_CONNECTING(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionStatus]
  }
}

