package typingsSlinky.pulumiAws.inputMod.wafregional

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSetByteMatchTuple extends js.Object {
  /**
    * Settings for the ByteMatchTuple. FieldToMatch documented below.
    */
  var fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch] = js.native
  /**
    * Within the portion of a web request that you want to search.
    */
  var positionalConstraint: Input[String] = js.native
  /**
    * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
    */
  var targetString: js.UndefOr[Input[String]] = js.native
  /**
    * The formatting way for web request.
    */
  var textTransformation: Input[String] = js.native
}

object ByteMatchSetByteMatchTuple {
  @scala.inline
  def apply(
    fieldToMatch: Input[ByteMatchSetByteMatchTupleFieldToMatch],
    positionalConstraint: Input[String],
    textTransformation: Input[String]
  ): ByteMatchSetByteMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], positionalConstraint = positionalConstraint.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSetByteMatchTuple]
  }
  @scala.inline
  implicit class ByteMatchSetByteMatchTupleOps[Self <: ByteMatchSetByteMatchTuple] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldToMatch(value: Input[ByteMatchSetByteMatchTupleFieldToMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldToMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionalConstraint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionalConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTransformation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetString(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetString")(js.undefined)
        ret
    }
  }
  
}

