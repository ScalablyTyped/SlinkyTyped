package typingsSlinky.officeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIgnorePunct extends js.Object {
  var ignorePunct: js.UndefOr[Boolean] = js.native
  var ignoreSpace: js.UndefOr[Boolean] = js.native
  var matchCase: js.UndefOr[Boolean] = js.native
  var matchPrefix: js.UndefOr[Boolean] = js.native
  var matchSuffix: js.UndefOr[Boolean] = js.native
  var matchWholeWord: js.UndefOr[Boolean] = js.native
  var matchWildcards: js.UndefOr[Boolean] = js.native
}

object AnonIgnorePunct {
  @scala.inline
  def apply(): AnonIgnorePunct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIgnorePunct]
  }
  @scala.inline
  implicit class AnonIgnorePunctOps[Self <: AnonIgnorePunct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnorePunct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePunct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePunct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePunct")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWholeWord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWholeWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWholeWord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWholeWord")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchWildcards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchWildcards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchWildcards")(js.undefined)
        ret
    }
  }
  
}

