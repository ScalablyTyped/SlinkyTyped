package typingsSlinky.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollationOptions extends js.Object {
  var alternate: js.UndefOr[String] = js.native
  var backwards: js.UndefOr[Boolean] = js.native
  var caseFirst: js.UndefOr[String] = js.native
  var caseLevel: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxVariable: js.UndefOr[String] = js.native
  var numericOrdering: js.UndefOr[Boolean] = js.native
  var strength: js.UndefOr[Double] = js.native
}

object CollationOptions {
  @scala.inline
  def apply(): CollationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollationOptions]
  }
  @scala.inline
  implicit class CollationOptionsOps[Self <: CollationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(js.undefined)
        ret
    }
    @scala.inline
    def withBackwards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackwards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwards")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericOrdering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericOrdering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericOrdering")(js.undefined)
        ret
    }
    @scala.inline
    def withStrength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strength")(js.undefined)
        ret
    }
  }
  
}

