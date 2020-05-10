package typingsSlinky.firebaseFirestore.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentOptions extends js.Object {
  var hasCommittedMutations: js.UndefOr[Boolean] = js.native
  var hasLocalMutations: js.UndefOr[Boolean] = js.native
}

object DocumentOptions {
  @scala.inline
  def apply(): DocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentOptions]
  }
  @scala.inline
  implicit class DocumentOptionsOps[Self <: DocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasCommittedMutations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCommittedMutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCommittedMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCommittedMutations")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLocalMutations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLocalMutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLocalMutations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLocalMutations")(js.undefined)
        ret
    }
  }
  
}

