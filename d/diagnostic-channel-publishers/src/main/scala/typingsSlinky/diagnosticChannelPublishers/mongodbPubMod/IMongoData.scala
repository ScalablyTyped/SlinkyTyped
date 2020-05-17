package typingsSlinky.diagnosticChannelPublishers.mongodbPubMod

import typingsSlinky.diagnosticChannelPublishers.anon.Command
import typingsSlinky.diagnosticChannelPublishers.anon.CommandName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMongoData extends js.Object {
  var event: CommandName = js.native
  var startedData: Command = js.native
  var succeeded: Boolean = js.native
}

object IMongoData {
  @scala.inline
  def apply(event: CommandName, startedData: Command, succeeded: Boolean): IMongoData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], startedData = startedData.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMongoData]
  }
  @scala.inline
  implicit class IMongoDataOps[Self <: IMongoData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: CommandName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartedData(value: Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

