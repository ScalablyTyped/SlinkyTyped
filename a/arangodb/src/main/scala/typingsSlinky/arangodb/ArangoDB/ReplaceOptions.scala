package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceOptions extends InsertOptions {
  var overwrite: js.UndefOr[Boolean] = js.native
  var returnOld: js.UndefOr[Boolean] = js.native
}

object ReplaceOptions {
  @scala.inline
  def apply(): ReplaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOptions]
  }
  @scala.inline
  implicit class ReplaceOptionsOps[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnOld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnOld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnOld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnOld")(js.undefined)
        ret
    }
  }
  
}

