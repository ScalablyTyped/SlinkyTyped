package typingsSlinky.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  var flags: Flags = js.native
  @JSName("parent")
  var parent_RegExpLiteral: Null = js.native
  var pattern: Pattern = js.native
  @JSName("type")
  var type_RegExpLiteral: typingsSlinky.regexpp.regexppStrings.RegExpLiteral = js.native
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typingsSlinky.regexpp.regexppStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
  @scala.inline
  implicit class RegExpLiteralOps[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: Flags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: Pattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.regexpp.regexppStrings.RegExpLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

