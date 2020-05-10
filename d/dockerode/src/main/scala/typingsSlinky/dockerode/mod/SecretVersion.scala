package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecretVersion extends js.Object {
  var Index: Double = js.native
}

object SecretVersion {
  @scala.inline
  def apply(Index: Double): SecretVersion = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretVersion]
  }
  @scala.inline
  implicit class SecretVersionOps[Self <: SecretVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

