package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtteranceData extends js.Object {
  /**
    * The number of times that the utterance was processed.
    */
  var count: js.UndefOr[Count] = js.native
  /**
    * The total number of individuals that used the utterance.
    */
  var distinctUsers: js.UndefOr[Count] = js.native
  /**
    * The date that the utterance was first recorded.
    */
  var firstUtteredDate: js.UndefOr[js.Date] = js.native
  /**
    * The date that the utterance was last recorded.
    */
  var lastUtteredDate: js.UndefOr[js.Date] = js.native
  /**
    * The text that was entered by the user or the text representation of an audio clip.
    */
  var utteranceString: js.UndefOr[UtteranceString] = js.native
}

object UtteranceData {
  @scala.inline
  def apply(): UtteranceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceData]
  }
  @scala.inline
  implicit class UtteranceDataOps[Self <: UtteranceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withDistinctUsers(value: Count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinctUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinctUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstUtteredDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUtteredDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstUtteredDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstUtteredDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUtteredDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUtteredDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUtteredDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUtteredDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUtteranceString(value: UtteranceString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utteranceString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtteranceString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utteranceString")(js.undefined)
        ret
    }
  }
  
}

