package typingsSlinky.graphqlSubscriptions.pubsubMod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PubSubOptions extends js.Object {
  var eventEmitter: js.UndefOr[EventEmitter] = js.native
}

object PubSubOptions {
  @scala.inline
  def apply(): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubOptions]
  }
  @scala.inline
  implicit class PubSubOptionsOps[Self <: PubSubOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventEmitter(value: EventEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEmitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventEmitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEmitter")(js.undefined)
        ret
    }
  }
  
}

