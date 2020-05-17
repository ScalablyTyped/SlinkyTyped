package typingsSlinky.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cosign extends js.Object {
  var cosign: Boolean = js.native
  var pyong: Boolean = js.native
  var vote: js.UndefOr[js.Any] = js.native
}

object Cosign {
  @scala.inline
  def apply(cosign: Boolean, pyong: Boolean): Cosign = {
    val __obj = js.Dynamic.literal(cosign = cosign.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cosign]
  }
  @scala.inline
  implicit class CosignOps[Self <: Cosign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCosign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cosign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyong")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVote(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vote")(js.undefined)
        ret
    }
  }
  
}

