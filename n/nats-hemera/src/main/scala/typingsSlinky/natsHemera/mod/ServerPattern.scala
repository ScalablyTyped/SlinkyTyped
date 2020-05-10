package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerPattern
  extends /* key */ StringDictionary[js.Any] {
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.native
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.native
  var topic: String = js.native
}

object ServerPattern {
  @scala.inline
  def apply(topic: String): ServerPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerPattern]
  }
  @scala.inline
  implicit class ServerPatternOps[Self <: ServerPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxMessages$(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessages$: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessages$")(js.undefined)
        ret
    }
    @scala.inline
    def withPubsub$(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsub$: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub$")(js.undefined)
        ret
    }
  }
  
}

