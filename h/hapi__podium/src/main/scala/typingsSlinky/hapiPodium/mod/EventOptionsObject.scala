package typingsSlinky.hapiPodium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOptionsObject extends _Events {
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[String | js.Array[String]] = js.native
  /** if true, the data object passed to podium.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is). */
  @JSName("clone")
  var clone_FEventOptionsObject: js.UndefOr[Boolean] = js.native
  /** the event name string (required). */
  var name: String = js.native
  /** if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first configuration is used. Defaults to false (a duplicate registration will throw an error). */
  var shared: js.UndefOr[Boolean] = js.native
  /** if true, the data object passed to podium.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type). */
  var spread: js.UndefOr[Boolean] = js.native
  /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). A configuration override can be set by each listener. Defaults to false. */
  var tags: js.UndefOr[Boolean] = js.native
}

object EventOptionsObject {
  @scala.inline
  def apply(name: String): EventOptionsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptionsObject]
  }
  @scala.inline
  implicit class EventOptionsObjectOps[Self <: EventOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSpread(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Boolean): Self = {
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

