package typingsSlinky.rethinkdb.mod

import typingsSlinky.rethinkdb.rethinkdbStrings.hard
import typingsSlinky.rethinkdb.rethinkdbStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOptions extends js.Object {
  var durability: js.UndefOr[hard | soft] = js.native
  var nonAtomic: js.UndefOr[Boolean] = js.native
  var returnChanges: js.UndefOr[Boolean] = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurability(value: hard | soft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durability")(js.undefined)
        ret
    }
    @scala.inline
    def withNonAtomic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonAtomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonAtomic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonAtomic")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnChanges")(js.undefined)
        ret
    }
  }
  
}

