package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlayerSessionsOutput extends js.Object {
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A collection of objects containing properties for each player session that matches the request.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}

object DescribePlayerSessionsOutput {
  @scala.inline
  def apply(): DescribePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsOutput]
  }
  @scala.inline
  implicit class DescribePlayerSessionsOutputOps[Self <: DescribePlayerSessionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPlayerSessions(value: PlayerSessionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlayerSessions")(js.undefined)
        ret
    }
  }
  
}

