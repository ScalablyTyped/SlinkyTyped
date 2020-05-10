package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import typingsSlinky.rsocketTypes.rsocketTypesStrings.CLOSED
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CONNECTED
import typingsSlinky.rsocketTypes.rsocketTypesStrings.CONNECTING
import typingsSlinky.rsocketTypes.rsocketTypesStrings.ERROR
import typingsSlinky.rsocketTypes.rsocketTypesStrings.NOT_CONNECTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketTypes.AnonKind
  - typingsSlinky.rsocketTypes.Anon0
  - typingsSlinky.rsocketTypes.Anon1
  - typingsSlinky.rsocketTypes.Anon2
  - typingsSlinky.rsocketTypes.AnonError
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def Anon0(kind: CONNECTING): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon1(kind: CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def Anon2(kind: CLOSED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonError(error: js.Error, kind: ERROR): ConnectionStatus = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
  @scala.inline
  def AnonKind(kind: NOT_CONNECTED): ConnectionStatus = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStatus]
  }
}

