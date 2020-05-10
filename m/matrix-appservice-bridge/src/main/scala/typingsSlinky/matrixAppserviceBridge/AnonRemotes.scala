package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppserviceBridge.mod.MatrixRoom
import typingsSlinky.matrixAppserviceBridge.mod.RemoteRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRemotes extends js.Object {
  var matrix: MatrixRoom = js.native
  var remote: Null | RemoteRoom = js.native
  var remotes: js.Array[RemoteRoom] = js.native
}

object AnonRemotes {
  @scala.inline
  def apply(matrix: MatrixRoom, remotes: js.Array[RemoteRoom]): AnonRemotes = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemotes]
  }
  @scala.inline
  implicit class AnonRemotesOps[Self <: AnonRemotes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatrix(value: MatrixRoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotes(value: js.Array[RemoteRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: RemoteRoom): Self = {
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

