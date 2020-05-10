package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsInput extends js.Object {
  /**
    * A unique identifier for a build to return fleets for. Use this parameter to return only fleets using the specified build. Use either the build ID or ARN value.To retrieve all fleets, leave this parameter empty.
    */
  var BuildId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.BuildId] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A unique identifier for a Realtime script to return fleets for. Use this parameter to return only fleets using the specified script. Use either the script ID or ARN value.To retrieve all fleets, leave this parameter empty.
    */
  var ScriptId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptId] = js.native
}

object ListFleetsInput {
  @scala.inline
  def apply(): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsInput]
  }
  @scala.inline
  implicit class ListFleetsInputOps[Self <: ListFleetsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildId(value: BuildId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildId")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonZeroAndMaxString): Self = {
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
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(js.undefined)
        ret
    }
  }
  
}

