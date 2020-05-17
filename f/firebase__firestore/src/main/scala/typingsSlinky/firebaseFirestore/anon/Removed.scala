package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Removed extends js.Object {
  var added: js.UndefOr[js.Array[Document]] = js.native
  var removed: js.UndefOr[js.Array[Document]] = js.native
}

object Removed {
  @scala.inline
  def apply(): Removed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Removed]
  }
  @scala.inline
  implicit class RemovedOps[Self <: Removed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
        ret
    }
  }
  
}

