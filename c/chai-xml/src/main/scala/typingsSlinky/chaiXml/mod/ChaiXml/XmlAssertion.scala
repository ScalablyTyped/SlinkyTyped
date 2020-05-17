package typingsSlinky.chaiXml.mod.ChaiXml

import typingsSlinky.chaiXml.mod.global.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAssertion extends Assertion {
  var and: XmlAssertion = js.native
  var at: XmlAssertion = js.native
  var be: XmlAssertion = js.native
  var been: XmlAssertion = js.native
  var has: XmlAssertion = js.native
  var have: XmlAssertion = js.native
  var is: XmlAssertion = js.native
  var not: XmlAssertion = js.native
  var of: XmlAssertion = js.native
  var same: XmlAssertion = js.native
  var that: XmlAssertion = js.native
  var to: XmlAssertion = js.native
  var which: XmlAssertion = js.native
  var `with`: XmlAssertion = js.native
  def valid(): XmlAssertion = js.native
}

object XmlAssertion {
  @scala.inline
  def apply(
    and: XmlAssertion,
    at: XmlAssertion,
    be: XmlAssertion,
    been: XmlAssertion,
    has: XmlAssertion,
    have: XmlAssertion,
    is: XmlAssertion,
    not: XmlAssertion,
    of: XmlAssertion,
    same: XmlAssertion,
    that: XmlAssertion,
    to: XmlAssertion,
    valid: () => XmlAssertion,
    which: XmlAssertion,
    `with`: XmlAssertion,
    xml: XmlAssertion
  ): XmlAssertion = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], valid = js.Any.fromFunction0(valid), which = which.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAssertion]
  }
  @scala.inline
  implicit class XmlAssertionOps[Self <: XmlAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnd(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBe(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("be")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeen(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("been")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHave(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("have")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOf(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSame(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("same")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThat(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("that")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValid(value: () => XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWhich(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWith(value: XmlAssertion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("with")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

