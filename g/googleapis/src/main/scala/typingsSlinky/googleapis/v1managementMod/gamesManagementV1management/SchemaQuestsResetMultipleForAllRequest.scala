package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for multiple quests reset all request.
  */
@js.native
trait SchemaQuestsResetMultipleForAllRequest extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#questsResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The IDs of quests to reset.
    */
  var quest_ids: js.UndefOr[js.Array[String]] = js.native
}

object SchemaQuestsResetMultipleForAllRequest {
  @scala.inline
  def apply(): SchemaQuestsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestsResetMultipleForAllRequest]
  }
  @scala.inline
  implicit class SchemaQuestsResetMultipleForAllRequestOps[Self <: SchemaQuestsResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withQuest_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quest_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuest_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quest_ids")(js.undefined)
        ret
    }
  }
  
}

