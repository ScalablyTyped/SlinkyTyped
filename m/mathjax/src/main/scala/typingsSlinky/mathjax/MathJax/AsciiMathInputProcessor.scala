package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsciiMathInputProcessor extends js.Object {
  /*This is the character to be used for decimal points in numbers. if you change this to ",", then you need to be
    * careful about entering points or intervals. E.g., use (1, 2) rather than (1,2) in that case.
    */
  var decimal: js.UndefOr[String] = js.native
  /*Determines whether operators like summation symbols will have their limits above and below the operators
    * (true) or to their right (false). The former is how they would appear in displayed equations that appear on
    * their own lines, while the latter is better suited to in-line equations so that they don’t interfere with the
    * line spacing so much.
    */
  var displaystyle: js.UndefOr[Boolean] = js.native
}

object AsciiMathInputProcessor {
  @scala.inline
  def apply(): AsciiMathInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsciiMathInputProcessor]
  }
  @scala.inline
  implicit class AsciiMathInputProcessorOps[Self <: AsciiMathInputProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplaystyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaystyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplaystyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displaystyle")(js.undefined)
        ret
    }
  }
  
}

