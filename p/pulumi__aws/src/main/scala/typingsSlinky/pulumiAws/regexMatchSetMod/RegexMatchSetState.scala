package typingsSlinky.pulumiAws.regexMatchSetMod

import typingsSlinky.pulumiAws.inputMod.wafregional.RegexMatchSetRegexMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSetState extends js.Object {
  /**
    * The name or description of the Regex Match Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests,
    * the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: js.UndefOr[Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]]] = js.native
}

object RegexMatchSetState {
  @scala.inline
  def apply(): RegexMatchSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexMatchSetState]
  }
  @scala.inline
  implicit class RegexMatchSetStateOps[Self <: RegexMatchSetState] (val x: Self) extends AnyVal {
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
    def withRegexMatchTuples(value: Input[js.Array[Input[RegexMatchSetRegexMatchTuple]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMatchTuples")(js.undefined)
        ret
    }
  }
  
}

