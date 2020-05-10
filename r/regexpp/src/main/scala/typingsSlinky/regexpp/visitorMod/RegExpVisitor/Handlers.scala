package typingsSlinky.regexpp.visitorMod.RegExpVisitor

import typingsSlinky.regexpp.astMod.Alternative
import typingsSlinky.regexpp.astMod.Assertion
import typingsSlinky.regexpp.astMod.Backreference
import typingsSlinky.regexpp.astMod.CapturingGroup
import typingsSlinky.regexpp.astMod.Character
import typingsSlinky.regexpp.astMod.CharacterClass
import typingsSlinky.regexpp.astMod.CharacterClassRange
import typingsSlinky.regexpp.astMod.CharacterSet
import typingsSlinky.regexpp.astMod.Flags
import typingsSlinky.regexpp.astMod.Group
import typingsSlinky.regexpp.astMod.Pattern
import typingsSlinky.regexpp.astMod.Quantifier
import typingsSlinky.regexpp.astMod.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handlers extends js.Object {
  var onAlternativeEnter: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.native
  var onAlternativeLeave: js.UndefOr[js.Function1[/* node */ Alternative, Unit]] = js.native
  var onAssertionEnter: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.native
  var onAssertionLeave: js.UndefOr[js.Function1[/* node */ Assertion, Unit]] = js.native
  var onBackreferenceEnter: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.native
  var onBackreferenceLeave: js.UndefOr[js.Function1[/* node */ Backreference, Unit]] = js.native
  var onCapturingGroupEnter: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.native
  var onCapturingGroupLeave: js.UndefOr[js.Function1[/* node */ CapturingGroup, Unit]] = js.native
  var onCharacterClassEnter: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.native
  var onCharacterClassLeave: js.UndefOr[js.Function1[/* node */ CharacterClass, Unit]] = js.native
  var onCharacterClassRangeEnter: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.native
  var onCharacterClassRangeLeave: js.UndefOr[js.Function1[/* node */ CharacterClassRange, Unit]] = js.native
  var onCharacterEnter: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.native
  var onCharacterLeave: js.UndefOr[js.Function1[/* node */ Character, Unit]] = js.native
  var onCharacterSetEnter: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.native
  var onCharacterSetLeave: js.UndefOr[js.Function1[/* node */ CharacterSet, Unit]] = js.native
  var onFlagsEnter: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.native
  var onFlagsLeave: js.UndefOr[js.Function1[/* node */ Flags, Unit]] = js.native
  var onGroupEnter: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.native
  var onGroupLeave: js.UndefOr[js.Function1[/* node */ Group, Unit]] = js.native
  var onPatternEnter: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.native
  var onPatternLeave: js.UndefOr[js.Function1[/* node */ Pattern, Unit]] = js.native
  var onQuantifierEnter: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.native
  var onQuantifierLeave: js.UndefOr[js.Function1[/* node */ Quantifier, Unit]] = js.native
  var onRegExpLiteralEnter: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.native
  var onRegExpLiteralLeave: js.UndefOr[js.Function1[/* node */ RegExpLiteral, Unit]] = js.native
}

object Handlers {
  @scala.inline
  def apply(): Handlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handlers]
  }
  @scala.inline
  implicit class HandlersOps[Self <: Handlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAlternativeEnter(value: /* node */ Alternative => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAlternativeEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAlternativeLeave(value: /* node */ Alternative => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAlternativeLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAlternativeLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAssertionEnter(value: /* node */ Assertion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssertionEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAssertionEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssertionEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAssertionLeave(value: /* node */ Assertion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssertionLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAssertionLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAssertionLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackreferenceEnter(value: /* node */ Backreference => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreferenceEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBackreferenceEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreferenceEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBackreferenceLeave(value: /* node */ Backreference => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreferenceLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBackreferenceLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackreferenceLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCapturingGroupEnter(value: /* node */ CapturingGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCapturingGroupEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCapturingGroupLeave(value: /* node */ CapturingGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCapturingGroupLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCapturingGroupLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassEnter(value: /* node */ CharacterClass => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassLeave(value: /* node */ CharacterClass => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassRangeEnter(value: /* node */ CharacterClassRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRangeEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassRangeEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRangeEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterClassRangeLeave(value: /* node */ CharacterClassRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRangeLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterClassRangeLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterClassRangeLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterEnter(value: /* node */ Character => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterLeave(value: /* node */ Character => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterSetEnter(value: /* node */ CharacterSet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterSetEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterSetEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterSetEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCharacterSetLeave(value: /* node */ CharacterSet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterSetLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCharacterSetLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCharacterSetLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFlagsEnter(value: /* node */ Flags => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlagsEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFlagsEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlagsEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFlagsLeave(value: /* node */ Flags => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlagsLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFlagsLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFlagsLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnGroupEnter(value: /* node */ Group => Unit): Self = {
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
    def withOnGroupLeave(value: /* node */ Group => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnGroupLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGroupLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPatternEnter(value: /* node */ Pattern => Unit): Self = {
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
    def withOnPatternLeave(value: /* node */ Pattern => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPatternLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPatternLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQuantifierEnter(value: /* node */ Quantifier => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifierEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnQuantifierEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifierEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnQuantifierLeave(value: /* node */ Quantifier => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifierLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnQuantifierLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQuantifierLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegExpLiteralEnter(value: /* node */ RegExpLiteral => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegExpLiteralEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegExpLiteralEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegExpLiteralEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRegExpLiteralLeave(value: /* node */ RegExpLiteral => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegExpLiteralLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRegExpLiteralLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRegExpLiteralLeave")(js.undefined)
        ret
    }
  }
  
}

