package typingsSlinky.pulumiAws.getBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.mq.GetBrokerLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerArgs extends js.Object {
  /**
    * The unique id of the mq broker.
    */
  val brokerId: js.UndefOr[String] = js.native
  /**
    * The unique name of the mq broker.
    */
  val brokerName: js.UndefOr[String] = js.native
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetBrokerArgs {
  @scala.inline
  def apply(): GetBrokerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBrokerArgs]
  }
  @scala.inline
  implicit class GetBrokerArgsOps[Self <: GetBrokerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrokerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerId")(js.undefined)
        ret
    }
    @scala.inline
    def withBrokerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokerName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: GetBrokerLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

