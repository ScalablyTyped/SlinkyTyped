package typingsSlinky.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWithin extends js.Object {
  var copyWithin: Boolean = js.native
  var entries: Boolean = js.native
  var fill: Boolean = js.native
  var find: Boolean = js.native
  var findIndex: Boolean = js.native
  var keys: Boolean = js.native
  var values: Boolean = js.native
}

object CopyWithin {
  @scala.inline
  def apply(
    copyWithin: Boolean,
    entries: Boolean,
    fill: Boolean,
    find: Boolean,
    findIndex: Boolean,
    keys: Boolean,
    values: Boolean
  ): CopyWithin = {
    val __obj = js.Dynamic.literal(copyWithin = copyWithin.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], findIndex = findIndex.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWithin]
  }
  @scala.inline
  implicit class CopyWithinOps[Self <: CopyWithin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyWithin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyWithin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

