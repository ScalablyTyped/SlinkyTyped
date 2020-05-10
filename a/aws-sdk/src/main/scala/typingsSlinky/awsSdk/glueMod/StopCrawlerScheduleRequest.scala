package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopCrawlerScheduleRequest extends js.Object {
  /**
    * Name of the crawler whose schedule state to set.
    */
  var CrawlerName: NameString = js.native
}

object StopCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString): StopCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCrawlerScheduleRequest]
  }
  @scala.inline
  implicit class StopCrawlerScheduleRequestOps[Self <: StopCrawlerScheduleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlerName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

