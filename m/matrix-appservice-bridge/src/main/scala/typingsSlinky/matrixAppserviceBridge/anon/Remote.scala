package typingsSlinky.matrixAppserviceBridge.anon

import typingsSlinky.matrixAppserviceBridge.mod.MatrixUser
import typingsSlinky.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends js.Object {
  var matrix: Null | MatrixUser
  var remote: Null | RemoteUser
  var remotes: js.Array[RemoteUser]
}

object Remote {
  @scala.inline
  def apply(remotes: js.Array[RemoteUser], matrix: MatrixUser = null, remote: RemoteUser = null): Remote = {
    val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
}

