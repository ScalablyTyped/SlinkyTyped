package typingsSlinky.pulumiAws.wafXssMatchSetMod

import typingsSlinky.pulumiAws.inputMod.waf.XssMatchSetXssMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSetArgs extends js.Object {
  /**
    * The name or description of the SizeConstraintSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  val xssMatchTuples: js.UndefOr[Input[js.Array[Input[XssMatchSetXssMatchTuple]]]] = js.native
}

object XssMatchSetArgs {
  @scala.inline
  def apply(): XssMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XssMatchSetArgs]
  }
  @scala.inline
  implicit class XssMatchSetArgsOps[Self <: XssMatchSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withXssMatchTuples(value: Input[js.Array[Input[XssMatchSetXssMatchTuple]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXssMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xssMatchTuples")(js.undefined)
        ret
    }
  }
  
}

