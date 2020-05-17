package typingsSlinky.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.WordOptions> */
@js.native
trait PartialWordOptions extends js.Object {
  var capitalize: js.UndefOr[Boolean] = js.native
  var length: js.UndefOr[Double] = js.native
  var syllables: js.UndefOr[Double] = js.native
}

object PartialWordOptions {
  @scala.inline
  def apply(): PartialWordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWordOptions]
  }
  @scala.inline
  implicit class PartialWordOptionsOps[Self <: PartialWordOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapitalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withSyllables(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syllables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyllables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syllables")(js.undefined)
        ret
    }
  }
  
}

