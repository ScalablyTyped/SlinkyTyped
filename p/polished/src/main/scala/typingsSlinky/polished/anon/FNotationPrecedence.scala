package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedNumbers.`0`
import typingsSlinky.polished.polishedNumbers.`1`
import typingsSlinky.polished.polishedStrings.func
import typingsSlinky.polished.polishedStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FNotationPrecedence extends js.Object {
  var argCount: `1` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any = js.native
  var notation: func = js.native
  var precedence: `0` = js.native
  var rightToLeft: `0` = js.native
  var symbol: min = js.native
}

object FNotationPrecedence {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any,
    notation: func,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: min
  ): FNotationPrecedence = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[FNotationPrecedence]
  }
  @scala.inline
  implicit class FNotationPrecedenceOps[Self <: FNotationPrecedence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgCount(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotation(value: func): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecedence(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightToLeft(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightToLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: min): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

