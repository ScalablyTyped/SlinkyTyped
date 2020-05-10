package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectSyntaxResponse extends js.Object {
  /**
    * A collection of syntax tokens describing the text. For each token, the response provides the text, the token type, where the text begins and ends, and the level of confidence that Amazon Comprehend has that the token is correct. For a list of token types, see how-syntax.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.native
}

object DetectSyntaxResponse {
  @scala.inline
  def apply(): DetectSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectSyntaxResponse]
  }
  @scala.inline
  implicit class DetectSyntaxResponseOps[Self <: DetectSyntaxResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyntaxTokens(value: ListOfSyntaxTokens): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyntaxTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyntaxTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyntaxTokens")(js.undefined)
        ret
    }
  }
  
}

