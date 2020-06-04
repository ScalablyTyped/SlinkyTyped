package typingsSlinky.angularCompiler.stylingBuilderMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylingInstruction extends js.Object {
  var allocateBindingSlots: Double
  var reference: ExternalReference
  var sourceSpan: ParseSourceSpan | Null
  var supportsInterpolation: js.UndefOr[Boolean] = js.undefined
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression]
}

object StylingInstruction {
  @scala.inline
  def apply(
    allocateBindingSlots: Double,
    params: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression],
    reference: ExternalReference
  ): StylingInstruction = {
    val __obj = js.Dynamic.literal(allocateBindingSlots = allocateBindingSlots.asInstanceOf[js.Any], params = js.Any.fromFunction1(params), reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylingInstruction]
  }
  @scala.inline
  implicit class StylingInstructionOps[Self <: StylingInstruction] (val x: Self) extends AnyVal {
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
    def setAllocateBindingSlots(value: Double): Self = this.set("allocateBindingSlots", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression]): Self = this.set("params", js.Any.fromFunction1(value))
    @scala.inline
    def setReference(value: ExternalReference): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSpan(value: ParseSourceSpan): Self = this.set("sourceSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSpanNull: Self = this.set("sourceSpan", null)
    @scala.inline
    def setSupportsInterpolation(value: Boolean): Self = this.set("supportsInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsInterpolation: Self = this.set("supportsInterpolation", js.undefined)
  }
  
}

