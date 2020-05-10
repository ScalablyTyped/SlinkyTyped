package typingsSlinky.jsWorkerSearch

import typingsSlinky.jsWorkerSearch.mod.INDEX_MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var indexMode: js.UndefOr[INDEX_MODES] = js.native
  var matchAnyToken: js.UndefOr[Boolean] = js.native
  var tokenizePattern: js.UndefOr[js.RegExp] = js.native
}

object AnonCaseSensitive {
  @scala.inline
  def apply(): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCaseSensitive]
  }
  @scala.inline
  implicit class AnonCaseSensitiveOps[Self <: AnonCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexMode(value: INDEX_MODES): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchAnyToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAnyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAnyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAnyToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenizePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenizePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenizePattern")(js.undefined)
        ret
    }
  }
  
}

