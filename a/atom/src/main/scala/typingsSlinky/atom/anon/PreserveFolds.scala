package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveFolds extends js.Object {
  var preserveFolds: js.UndefOr[Boolean] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
}

object PreserveFolds {
  @scala.inline
  def apply(): PreserveFolds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFolds]
  }
  @scala.inline
  implicit class PreserveFoldsOps[Self <: PreserveFolds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreserveFolds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFolds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveFolds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveFolds")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
  }
  
}

