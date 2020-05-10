package typingsSlinky.pulumiAws.byteMatchSetMod

import typingsSlinky.pulumiAws.inputMod.wafregional.ByteMatchSetByteMatchTuple
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetArgs extends js.Object {
  /**
    * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
    */
  val byteMatchTuples: js.UndefOr[Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]] = js.native
  /**
    * The name or description of the ByteMatchSet.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object ByteMatchSetArgs {
  @scala.inline
  def apply(): ByteMatchSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteMatchSetArgs]
  }
  @scala.inline
  implicit class ByteMatchSetArgsOps[Self <: ByteMatchSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByteMatchTuples(value: Input[js.Array[Input[ByteMatchSetByteMatchTuple]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteMatchTuples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteMatchTuples")(js.undefined)
        ret
    }
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
  }
  
}

