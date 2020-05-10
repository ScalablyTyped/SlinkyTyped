package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRules extends js.Object {
  /**
    * Region markers used by the language.
    */
  var markers: js.UndefOr[FoldingMarkers] = js.native
  /**
    * Used by the indentation based strategy to decide whether empty lines belong to the previous or the next block.
    * A language adheres to the off-side rule if blocks in that language are expressed by their indentation.
    * See [wikipedia](https://en.wikipedia.org/wiki/Off-side_rule) for more information.
    * If not set, `false` is used and empty lines belong to the previous block.
    */
  var offSide: js.UndefOr[Boolean] = js.native
}

object FoldingRules {
  @scala.inline
  def apply(): FoldingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRules]
  }
  @scala.inline
  implicit class FoldingRulesOps[Self <: FoldingRules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkers(value: FoldingMarkers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withOffSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offSide")(js.undefined)
        ret
    }
  }
  
}

