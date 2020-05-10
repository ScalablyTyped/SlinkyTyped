package typingsSlinky.chance

import typingsSlinky.chance.chanceStrings.lower
import typingsSlinky.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.CharacterOptions> */
@js.native
trait PartialCharacterOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var casing: js.UndefOr[upper | lower] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var pool: js.UndefOr[String] = js.native
  var symbols: js.UndefOr[Boolean] = js.native
}

object PartialCharacterOptions {
  @scala.inline
  def apply(): PartialCharacterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCharacterOptions]
  }
  @scala.inline
  implicit class PartialCharacterOptionsOps[Self <: PartialCharacterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withCasing(value: upper | lower): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withPool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pool")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

