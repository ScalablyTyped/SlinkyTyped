package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffNavigatorOptions extends js.Object {
  val alwaysRevealFirst: js.UndefOr[Boolean] = js.native
  val followsCaret: js.UndefOr[Boolean] = js.native
  val ignoreCharChanges: js.UndefOr[Boolean] = js.native
}

object IDiffNavigatorOptions {
  @scala.inline
  def apply(): IDiffNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffNavigatorOptions]
  }
  @scala.inline
  implicit class IDiffNavigatorOptionsOps[Self <: IDiffNavigatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysRevealFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRevealFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysRevealFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRevealFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowsCaret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followsCaret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowsCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followsCaret")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreCharChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCharChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCharChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCharChanges")(js.undefined)
        ret
    }
  }
  
}

