package typingsSlinky.nodeSsh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Local extends js.Object {
  var local: String = js.native
  var remote: String = js.native
}

object Local {
  @scala.inline
  def apply(local: String, remote: String): Local = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Local]
  }
  @scala.inline
  implicit class LocalOps[Self <: Local] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

