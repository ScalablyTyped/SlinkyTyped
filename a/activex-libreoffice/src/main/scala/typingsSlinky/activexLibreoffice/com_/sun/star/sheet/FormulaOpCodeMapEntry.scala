package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a mapping from a formula name (function name, operator, ...) to the OpCode used by the formula compiler. */
@js.native
trait FormulaOpCodeMapEntry extends js.Object {
  /** The function name, or operator. */
  var Name: String = js.native
  /** The corresponding mapping. */
  var Token: FormulaToken = js.native
}

object FormulaOpCodeMapEntry {
  @scala.inline
  def apply(Name: String, Token: FormulaToken): FormulaOpCodeMapEntry = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormulaOpCodeMapEntry]
  }
  @scala.inline
  implicit class FormulaOpCodeMapEntryOps[Self <: FormulaOpCodeMapEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: FormulaToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

