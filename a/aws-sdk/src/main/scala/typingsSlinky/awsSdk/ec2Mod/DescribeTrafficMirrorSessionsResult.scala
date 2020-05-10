package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorSessionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet] = js.native
}

object DescribeTrafficMirrorSessionsResult {
  @scala.inline
  def apply(): DescribeTrafficMirrorSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsResult]
  }
  @scala.inline
  implicit class DescribeTrafficMirrorSessionsResultOps[Self <: DescribeTrafficMirrorSessionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withTrafficMirrorSessions(value: TrafficMirrorSessionSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorSessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorSessions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorSessions")(js.undefined)
        ret
    }
  }
  
}

