package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppserviceBridge.mod.MatrixUser
import typingsSlinky.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatrix extends js.Object {
  var matrix: MatrixUser = js.native
  var remote: Null | RemoteUser = js.native
  var remotes: js.Array[RemoteUser] = js.native
}

object AnonMatrix {
  @scala.inline
  def apply(matrix: MatrixUser, remotes: js.Array[RemoteUser]): AnonMatrix = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatrix]
  }
  @scala.inline
  implicit class AnonMatrixOps[Self <: AnonMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatrix(value: MatrixUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotes(value: js.Array[RemoteUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: RemoteUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(null)
        ret
    }
  }
  
}

