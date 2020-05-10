package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UtteranceList extends js.Object {
  /**
    * The version of the bot that processed the list.
    */
  var botVersion: js.UndefOr[Version] = js.native
  /**
    * One or more UtteranceData objects that contain information about the utterances that have been made to a bot. The maximum number of object is 100.
    */
  var utterances: js.UndefOr[ListOfUtterance] = js.native
}

object UtteranceList {
  @scala.inline
  def apply(): UtteranceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtteranceList]
  }
  @scala.inline
  implicit class UtteranceListOps[Self <: UtteranceList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withUtterances(value: ListOfUtterance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utterances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtterances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utterances")(js.undefined)
        ret
    }
  }
  
}

