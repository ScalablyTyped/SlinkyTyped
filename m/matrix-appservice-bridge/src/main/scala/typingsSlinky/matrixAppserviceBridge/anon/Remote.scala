package typingsSlinky.matrixAppserviceBridge.anon

import typingsSlinky.matrixAppserviceBridge.mod.MatrixUser
import typingsSlinky.matrixAppserviceBridge.mod.RemoteUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remote extends js.Object {
  var matrix: Null | MatrixUser = js.native
  var remote: Null | RemoteUser = js.native
  var remotes: js.Array[RemoteUser] = js.native
}

object Remote {
  @scala.inline
  def apply(remotes: js.Array[RemoteUser]): Remote = {
    val __obj = js.Dynamic.literal(remotes = remotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  @scala.inline
  implicit class RemoteOps[Self <: Remote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemotes(value: js.Array[RemoteUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: MatrixUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(null)
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

