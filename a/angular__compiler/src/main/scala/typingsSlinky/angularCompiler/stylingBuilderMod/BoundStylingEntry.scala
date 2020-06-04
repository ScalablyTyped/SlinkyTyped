package typingsSlinky.angularCompiler.stylingBuilderMod

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An internal record of the input data for a styling binding
  */
trait BoundStylingEntry extends js.Object {
  var hasOverrideFlag: Boolean
  var name: String | Null
  var sourceSpan: ParseSourceSpan
  var unit: String | Null
  var value: AST
}

object BoundStylingEntry {
  @scala.inline
  def apply(hasOverrideFlag: Boolean, sourceSpan: ParseSourceSpan, value: AST): BoundStylingEntry = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundStylingEntry]
  }
  @scala.inline
  implicit class BoundStylingEntryOps[Self <: BoundStylingEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasOverrideFlag(value: Boolean): Self = this.set("hasOverrideFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: AST): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitNull: Self = this.set("unit", null)
  }
  
}

