package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLexiconsInput extends js.Object {
  /**
    * An opaque pagination token returned from previous ListLexicons operation. If present, indicates where to continue the list of lexicons.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pollyMod.NextToken] = js.native
}

object ListLexiconsInput {
  @scala.inline
  def apply(): ListLexiconsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsInput]
  }
  @scala.inline
  implicit class ListLexiconsInputOps[Self <: ListLexiconsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

