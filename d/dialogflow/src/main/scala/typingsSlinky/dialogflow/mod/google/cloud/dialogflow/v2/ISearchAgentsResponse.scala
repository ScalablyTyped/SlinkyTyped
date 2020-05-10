package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SearchAgentsResponse. */
@js.native
trait ISearchAgentsResponse extends js.Object {
  /** SearchAgentsResponse agents */
  var agents: js.UndefOr[js.Array[IAgent] | Null] = js.native
  /** SearchAgentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.native
}

object ISearchAgentsResponse {
  @scala.inline
  def apply(): ISearchAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISearchAgentsResponse]
  }
  @scala.inline
  implicit class ISearchAgentsResponseOps[Self <: ISearchAgentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgents(value: js.Array[IAgent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agents")(null)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(null)
        ret
    }
  }
  
}

