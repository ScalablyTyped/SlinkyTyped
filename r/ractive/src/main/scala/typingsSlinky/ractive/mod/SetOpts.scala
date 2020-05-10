package typingsSlinky.ractive.mod

import typingsSlinky.ractive.ractiveNumbers.`-1`
import typingsSlinky.ractive.ractiveNumbers.`0`
import typingsSlinky.ractive.ractiveNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOpts extends js.Object {
  /** Whether or not to merge the given value into the existing data or replace the existing data. Defaults to replacing the existing data (false). */
  var deep: js.UndefOr[Boolean] = js.native
  /** Whether or not to keep the template sturctures removed by this set around for future reinstatement. This can be used to avoid throwing away and recreating components when hiding them. Defaults to false. */
  var keep: js.UndefOr[Boolean] = js.native
  /** When applied to an array keypath, whether or not to move the existing elements and their associated template around or simply replace them. Defaults to replacement (false). */
  var shuffle: js.UndefOr[Shuffler] = js.native
}

object SetOpts {
  @scala.inline
  def apply(): SetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOpts]
  }
  @scala.inline
  implicit class SetOptsOps[Self <: SetOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffleFunction2(value: (/* left */ js.Any, /* right */ js.Any) => `1` | `0` | `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShuffle(value: Shuffler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.undefined)
        ret
    }
  }
  
}

