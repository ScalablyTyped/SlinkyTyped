package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionDetailsOutput extends js.Object {
  /**
    * A collection of objects containing game session properties and the protection policy currently in force for each session matching the request.
    */
  var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeGameSessionDetailsOutput {
  @scala.inline
  def apply(): DescribeGameSessionDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
  }
  @scala.inline
  implicit class DescribeGameSessionDetailsOutputOps[Self <: DescribeGameSessionDetailsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGameSessionDetails(value: GameSessionDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameSessionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GameSessionDetails")(js.undefined)
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
  }
  
}

