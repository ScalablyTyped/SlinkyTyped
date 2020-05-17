package typingsSlinky.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Affects extends js.Object {
  var affects: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]] = js.native
  var removed: js.UndefOr[js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]] = js.native
}

object Affects {
  @scala.inline
  def apply(): Affects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Affects]
  }
  @scala.inline
  implicit class AffectsOps[Self <: Affects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffects(value: js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affects")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[typingsSlinky.firebaseFirestore.queryMod.Query]): Self = {
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

