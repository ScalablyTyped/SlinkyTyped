package typingsSlinky.mainBowerFiles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaths extends js.Object {
  var bowerDirectory: js.UndefOr[String] = js.native
  var bowerJson: js.UndefOr[String] = js.native
  var bowerrc: js.UndefOr[String] = js.native
}

object IPaths {
  @scala.inline
  def apply(): IPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaths]
  }
  @scala.inline
  implicit class IPathsOps[Self <: IPaths] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBowerDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBowerDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withBowerJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBowerJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerJson")(js.undefined)
        ret
    }
    @scala.inline
    def withBowerrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBowerrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bowerrc")(js.undefined)
        ret
    }
  }
  
}

