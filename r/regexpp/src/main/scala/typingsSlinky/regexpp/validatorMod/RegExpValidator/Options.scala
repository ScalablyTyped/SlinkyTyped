package typingsSlinky.regexpp.validatorMod.RegExpValidator

import typingsSlinky.regexpp.regexppNumbers.`2015`
import typingsSlinky.regexpp.regexppNumbers.`2016`
import typingsSlinky.regexpp.regexppNumbers.`2017`
import typingsSlinky.regexpp.regexppNumbers.`2018`
import typingsSlinky.regexpp.regexppNumbers.`5`
import typingsSlinky.regexpp.regexppStrings.any
import typingsSlinky.regexpp.regexppStrings.digit
import typingsSlinky.regexpp.regexppStrings.end
import typingsSlinky.regexpp.regexppStrings.lookahead
import typingsSlinky.regexpp.regexppStrings.lookbehind
import typingsSlinky.regexpp.regexppStrings.property
import typingsSlinky.regexpp.regexppStrings.space
import typingsSlinky.regexpp.regexppStrings.start
import typingsSlinky.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ecmaVersion: js.UndefOr[`5` | `2015` | `2016` | `2017` | `2018`] = js.native
  var onAlternativeEnter: js.UndefOr[js.Function2[/* start */ Double, /* index */ Double, Unit]] = js.native
  var onAlternativeLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* index */ Double, Unit]] = js.native
  var onAnyCharacterSet: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, any, Unit]] = js.native
  var onBackreference: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* ref */ Double | String, Unit]
  ] = js.native
  var onCapturingGroupEnter: js.UndefOr[js.Function2[/* start */ Double, /* name */ String | Null, Unit]] = js.native
  var onCapturingGroupLeave: js.UndefOr[
    js.Function3[/* start */ Double, /* end */ Double, /* name */ String | Null, Unit]
  ] = js.native
  var onCharacter: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* value */ Double, Unit]] = js.native
  var onCharacterClassEnter: js.UndefOr[js.Function2[/* start */ Double, /* negate */ Boolean, Unit]] = js.native
  var onCharacterClassLeave: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* negate */ Boolean, Unit]] = js.native
  var onCharacterClassRange: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, Unit]
  ] = js.native
  var onDisjunctionEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  var onDisjunctionLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  var onEdgeAssertion: js.UndefOr[js.Function3[/* start */ Double, /* end */ Double, /* kind */ start | end, Unit]] = js.native
  var onEscapeCharacterSet: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ digit | space | word, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.native
  var onFlags: js.UndefOr[
    js.Function8[
      /* start */ Double, 
      /* end */ Double, 
      /* global */ Boolean, 
      /* ignoreCase */ Boolean, 
      /* multiline */ Boolean, 
      /* unicode */ Boolean, 
      /* sticky */ Boolean, 
      /* dotAll */ Boolean, 
      Unit
    ]
  ] = js.native
  var onGroupEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  var onGroupLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  var onLiteralEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  var onLiteralLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  var onLookaroundAssertionEnter: js.UndefOr[
    js.Function3[/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean, Unit]
  ] = js.native
  var onLookaroundAssertionLeave: js.UndefOr[
    js.Function4[
      /* start */ Double, 
      /* end */ Double, 
      /* kind */ lookahead | lookbehind, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.native
  var onPatternEnter: js.UndefOr[js.Function1[/* start */ Double, Unit]] = js.native
  var onPatternLeave: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.native
  var onQuantifier: js.UndefOr[
    js.Function5[
      /* start */ Double, 
      /* end */ Double, 
      /* min */ Double, 
      /* max */ Double, 
      /* greedy */ Boolean, 
      Unit
    ]
  ] = js.native
  var onUnicodePropertyCharacterSet: js.UndefOr[
    js.Function6[
      /* start */ Double, 
      /* end */ Double, 
      property, 
      /* key */ String, 
      /* value */ String | Null, 
      /* negate */ Boolean, 
      Unit
    ]
  ] = js.native
  var onWordBoundaryAssertion: js.UndefOr[
    js.Function4[/* start */ Double, /* end */ Double, word, /* negate */ Boolean, Unit]
  ] = js.native
  var strict: js.UndefOr[Boolean] = js.native
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
    def withEcmaVersion(value: `5` | `2015` | `2016` | `2017` | `2018`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAlternativeEnter(value: (/* start */ Double, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnAlternativeEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAlternativeLeave(value: (/* start */ Double, /* end */ Double, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAlternativeLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAnyCharacterSet(value: (/* start */ Double, /* end */ Double, any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyCharacterSet")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAnyCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAnyCharacterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackreference(value: (/* start */ Double, /* end */ Double, /* ref */ Double | String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreference")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnBackreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreference")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCapturingGroupEnter(value: (/* start */ Double, /* name */ String | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCapturingGroupEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCapturingGroupLeave(value: (/* start */ Double, /* end */ Double, /* name */ String | Null) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCapturingGroupLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacter(value: (/* start */ Double, /* end */ Double, /* value */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassEnter(value: (/* start */ Double, /* negate */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassEnter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassLeave(value: (/* start */ Double, /* end */ Double, /* negate */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassLeave")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassRange(value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisjunctionEnter(value: /* start */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisjunctionEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDisjunctionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisjunctionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDisjunctionLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisjunctionLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDisjunctionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisjunctionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEdgeAssertion(value: (/* start */ Double, /* end */ Double, /* kind */ start | end) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdgeAssertion")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnEdgeAssertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEdgeAssertion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEscapeCharacterSet(
      value: (/* start */ Double, /* end */ Double, /* kind */ digit | space | word, /* negate */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeCharacterSet")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnEscapeCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEscapeCharacterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFlags(
      value: (/* start */ Double, /* end */ Double, /* global */ Boolean, /* ignoreCase */ Boolean, /* multiline */ Boolean, /* unicode */ Boolean, /* sticky */ Boolean, /* dotAll */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlags")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutOnFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGroupEnter(value: /* start */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGroupEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGroupLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnGroupLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLiteralEnter(value: /* start */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLiteralEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLiteralEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLiteralEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLiteralLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLiteralLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLiteralLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLiteralLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLookaroundAssertionEnter(value: (/* start */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLookaroundAssertionEnter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnLookaroundAssertionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLookaroundAssertionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLookaroundAssertionLeave(
      value: (/* start */ Double, /* end */ Double, /* kind */ lookahead | lookbehind, /* negate */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLookaroundAssertionLeave")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnLookaroundAssertionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLookaroundAssertionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPatternEnter(value: /* start */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPatternEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPatternLeave(value: (/* start */ Double, /* end */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternLeave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnPatternLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQuantifier(
      value: (/* start */ Double, /* end */ Double, /* min */ Double, /* max */ Double, /* greedy */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifier")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnQuantifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnicodePropertyCharacterSet(
      value: (/* start */ Double, /* end */ Double, property, /* key */ String, /* value */ String | Null, /* negate */ Boolean) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnicodePropertyCharacterSet")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnUnicodePropertyCharacterSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnicodePropertyCharacterSet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWordBoundaryAssertion(value: (/* start */ Double, /* end */ Double, word, /* negate */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWordBoundaryAssertion")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnWordBoundaryAssertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWordBoundaryAssertion")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

