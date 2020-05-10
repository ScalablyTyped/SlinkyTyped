package typingsSlinky.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexicon extends js.Object {
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.native
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.native
}

object Lexicon {
  @scala.inline
  def apply(): Lexicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lexicon]
  }
  @scala.inline
  implicit class LexiconOps[Self <: Lexicon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: LexiconContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: LexiconName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

