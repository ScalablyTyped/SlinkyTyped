package typingsSlinky.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  keepN  :string,   olderThan  :string} */
@js.native
trait SudokeepNstringolderThans extends js.Object {
  var keepN: String = js.native
  var olderThan: String = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object SudokeepNstringolderThans {
  @scala.inline
  def apply(keepN: String, olderThan: String): SudokeepNstringolderThans = {
    val __obj = js.Dynamic.literal(keepN = keepN.asInstanceOf[js.Any], olderThan = olderThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SudokeepNstringolderThans]
  }
  @scala.inline
  implicit class SudokeepNstringolderThansOps[Self <: SudokeepNstringolderThans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOlderThan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("olderThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

