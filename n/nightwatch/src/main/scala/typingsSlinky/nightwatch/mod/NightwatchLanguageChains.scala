package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchLanguageChains extends js.Object {
  var and: Expect = js.native
  var at: Expect = js.native
  var be: Expect = js.native
  var been: Expect = js.native
  var has: Expect = js.native
  var have: Expect = js.native
  var is: Expect = js.native
  var of: Expect = js.native
  var that: Expect = js.native
  var to: Expect = js.native
  var which: Expect = js.native
  var `with`: Expect = js.native
}

object NightwatchLanguageChains {
  @scala.inline
  def apply(
    and: Expect,
    at: Expect,
    be: Expect,
    been: Expect,
    has: Expect,
    have: Expect,
    is: Expect,
    of: Expect,
    that: Expect,
    to: Expect,
    which: Expect,
    `with`: Expect
  ): NightwatchLanguageChains = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
  @scala.inline
  implicit class NightwatchLanguageChainsOps[Self <: NightwatchLanguageChains] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBe(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("be")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeen(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("been")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHave(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("have")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOf(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThat(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("that")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhich(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith(value: Expect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

