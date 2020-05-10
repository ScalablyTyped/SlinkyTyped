package typingsSlinky.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var fuzzyEmail: js.UndefOr[Boolean] = js.native
  var fuzzyIP: js.UndefOr[Boolean] = js.native
  var fuzzyLink: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFuzzyEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuzzyEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withFuzzyIP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuzzyIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyIP")(js.undefined)
        ret
    }
    @scala.inline
    def withFuzzyLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuzzyLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuzzyLink")(js.undefined)
        ret
    }
  }
  
}

