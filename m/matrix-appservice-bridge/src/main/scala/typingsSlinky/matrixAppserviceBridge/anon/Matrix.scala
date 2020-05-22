package typingsSlinky.matrixAppserviceBridge.anon

import typingsSlinky.matrixAppserviceBridge.mod.MatrixUser
import typingsSlinky.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matrix extends js.Object {
  var matrix: MatrixUser
  var remote: Null | RemoteUser
  var remotes: js.Array[RemoteUser]
}

object Matrix {
  @scala.inline
  def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser], remote: RemoteUser = null): Matrix = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix]
  }
}

