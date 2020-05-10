package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathMLInputProcessor extends js.Object {
  /*Specifies whether to use TeX spacing or MathML spacing when the HTML-CSS output jax is used.*/
  var useMathMLspacing: js.UndefOr[Boolean] = js.native
}

object MathMLInputProcessor {
  @scala.inline
  def apply(): MathMLInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMLInputProcessor]
  }
  @scala.inline
  implicit class MathMLInputProcessorOps[Self <: MathMLInputProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseMathMLspacing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMathMLspacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMathMLspacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMathMLspacing")(js.undefined)
        ret
    }
  }
  
}

