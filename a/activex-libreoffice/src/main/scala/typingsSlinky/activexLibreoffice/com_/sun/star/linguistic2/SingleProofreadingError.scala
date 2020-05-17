package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds a single error found by the proofreader.
  * @since OOo 3.0.1
  */
@js.native
trait SingleProofreadingError extends js.Object {
  var aFullComment: String = js.native
  var aProperties: SafeArray[PropertyValue] = js.native
  var aRuleIdentifier: String = js.native
  var aShortComment: String = js.native
  var aSuggestions: SafeArray[String] = js.native
  var nErrorLength: Double = js.native
  var nErrorStart: Double = js.native
  var nErrorType: Double = js.native
}

object SingleProofreadingError {
  @scala.inline
  def apply(
    aFullComment: String,
    aProperties: SafeArray[PropertyValue],
    aRuleIdentifier: String,
    aShortComment: String,
    aSuggestions: SafeArray[String],
    nErrorLength: Double,
    nErrorStart: Double,
    nErrorType: Double
  ): SingleProofreadingError = {
    val __obj = js.Dynamic.literal(aFullComment = aFullComment.asInstanceOf[js.Any], aProperties = aProperties.asInstanceOf[js.Any], aRuleIdentifier = aRuleIdentifier.asInstanceOf[js.Any], aShortComment = aShortComment.asInstanceOf[js.Any], aSuggestions = aSuggestions.asInstanceOf[js.Any], nErrorLength = nErrorLength.asInstanceOf[js.Any], nErrorStart = nErrorStart.asInstanceOf[js.Any], nErrorType = nErrorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleProofreadingError]
  }
  @scala.inline
  implicit class SingleProofreadingErrorOps[Self <: SingleProofreadingError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAFullComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aFullComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAProperties(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARuleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aRuleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAShortComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aShortComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withASuggestions(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNErrorLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nErrorLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNErrorStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nErrorStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNErrorType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nErrorType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

