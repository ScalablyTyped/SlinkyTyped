package typingsSlinky.polished

import typingsSlinky.polished.polishedNumbers.`0`
import typingsSlinky.polished.polishedNumbers.`2`
import typingsSlinky.polished.polishedNumbers.`4`
import typingsSlinky.polished.polishedStrings.Asterisk
import typingsSlinky.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNotation extends js.Object {
  var argCount: `2` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ js.Any = js.native
  var notation: infix = js.native
  var precedence: `4` = js.native
  var rightToLeft: `0` = js.native
  var symbol: Asterisk = js.native
}

object AnonNotation {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ js.Any,
    notation: infix,
    precedence: `4`,
    rightToLeft: `0`,
    symbol: Asterisk
  ): AnonNotation = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotation]
  }
  @scala.inline
  implicit class AnonNotationOps[Self <: AnonNotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgCount(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify multiplication */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotation(value: infix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecedence(value: `4`): Self = {
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
    def withSymbol(value: Asterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

