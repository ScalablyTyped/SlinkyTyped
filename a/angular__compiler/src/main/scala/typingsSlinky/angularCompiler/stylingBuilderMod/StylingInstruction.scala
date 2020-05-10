package typingsSlinky.angularCompiler.stylingBuilderMod

import typingsSlinky.angularCompiler.outputAstMod.Expression
import typingsSlinky.angularCompiler.outputAstMod.ExternalReference
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylingInstruction extends js.Object {
  var allocateBindingSlots: Double = js.native
  var reference: ExternalReference = js.native
  var sourceSpan: ParseSourceSpan | Null = js.native
  var supportsInterpolation: js.UndefOr[Boolean] = js.native
  def params(convertFn: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]]): js.Array[Expression] = js.native
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
    def withAllocateBindingSlots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateBindingSlots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Function1[/* value */ js.Any, Expression | js.Array[Expression]] => js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReference(value: ExternalReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSpan(value: ParseSourceSpan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSpanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSpan")(null)
        ret
    }
    @scala.inline
    def withSupportsInterpolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsInterpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsInterpolation")(js.undefined)
        ret
    }
  }
  
}

