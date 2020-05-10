package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindInPageOptions extends js.Object {
  /**
    * Whether the operation is first request or a follow up, defaults to false.
    */
  var findNext: js.UndefOr[Boolean] = js.native
  /**
    * Whether to search forward or backward, defaults to true.
    */
  var forward: js.UndefOr[Boolean] = js.native
  /**
    * Whether search should be case-sensitive, defaults to false.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  /**
    * When combined with wordStart, accepts a match in the middle of a word if the
    * match begins with an uppercase letter followed by a lowercase or non-letter.
    * Accepts several other intra-word matches, defaults to false.
    */
  var medialCapitalAsWordStart: js.UndefOr[Boolean] = js.native
  /**
    * Whether to look only at the start of words. defaults to false.
    */
  var wordStart: js.UndefOr[Boolean] = js.native
}

object FindInPageOptions {
  @scala.inline
  def apply(): FindInPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindInPageOptions]
  }
  @scala.inline
  implicit class FindInPageOptionsOps[Self <: FindInPageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFindNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNext")(js.undefined)
        ret
    }
    @scala.inline
    def withForward(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMedialCapitalAsWordStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialCapitalAsWordStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedialCapitalAsWordStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medialCapitalAsWordStart")(js.undefined)
        ret
    }
    @scala.inline
    def withWordStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordStart")(js.undefined)
        ret
    }
  }
  
}

