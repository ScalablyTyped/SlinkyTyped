package typingsSlinky.empower.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var destructive: js.UndefOr[Boolean] = js.native
  var modifyMessageOnRethrow: js.UndefOr[Boolean] = js.native
  var patterns: js.UndefOr[js.Array[String]] = js.native
  var saveContextOnRethrow: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestructive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestructive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destructive")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyMessageOnRethrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyMessageOnRethrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyMessageOnRethrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyMessageOnRethrow")(js.undefined)
        ret
    }
    @scala.inline
    def withPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveContextOnRethrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveContextOnRethrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveContextOnRethrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveContextOnRethrow")(js.undefined)
        ret
    }
  }
  
}

