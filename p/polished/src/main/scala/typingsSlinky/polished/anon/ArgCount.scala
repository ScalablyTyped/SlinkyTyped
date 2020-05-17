package typingsSlinky.polished.anon

import typingsSlinky.polished.polishedNumbers.`0`
import typingsSlinky.polished.polishedNumbers.`1`
import typingsSlinky.polished.polishedNumbers.`6`
import typingsSlinky.polished.polishedStrings.Exclamationmark
import typingsSlinky.polished.polishedStrings.postfix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCount extends js.Object {
  var argCount: `1` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any = js.native
  var notation: postfix = js.native
  var precedence: `6` = js.native
  var rightToLeft: `0` = js.native
  var symbol: Exclamationmark = js.native
}

object ArgCount {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any,
    notation: postfix,
    precedence: `6`,
    rightToLeft: `0`,
    symbol: Exclamationmark
  ): ArgCount = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgCount]
  }
  @scala.inline
  implicit class ArgCountOps[Self <: ArgCount] (val x: Self) extends AnyVal {
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
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotation(value: postfix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecedence(value: `6`): Self = {
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
    def withSymbol(value: Exclamationmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

