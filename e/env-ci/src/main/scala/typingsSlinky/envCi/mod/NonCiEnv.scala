package typingsSlinky.envCi.mod

import typingsSlinky.envCi.envCiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonCiEnv extends CiEnv {
  var branch: js.UndefOr[String] = js.native
  var commit: js.UndefOr[String] = js.native
  var isCi: `false` = js.native
}

object NonCiEnv {
  @scala.inline
  def apply(isCi: `false`): NonCiEnv = {
    val __obj = js.Dynamic.literal(isCi = isCi.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonCiEnv]
  }
  @scala.inline
  implicit class NonCiEnvOps[Self <: NonCiEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCi(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(js.undefined)
        ret
    }
    @scala.inline
    def withCommit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.undefined)
        ret
    }
  }
  
}

