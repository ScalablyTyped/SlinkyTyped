package typingsSlinky.hapi.mod

import typingsSlinky.hapi.anon.All
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEventCriteria[T] extends js.Object {
  /**
    * a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed
    * channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter.
    */
  var channels: js.UndefOr[String | js.Array[String]] = js.native
  /** if true, the data object passed to server.event.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
  @JSName("clone")
  var clone_FServerEventCriteria: js.UndefOr[Boolean] = js.native
  /**
    * a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling server.events.once().
    * Defaults to no limit.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * filter - the event tags (if present) to subscribe to which can be one of:
    * * a tag string.
    * * an array of tag strings.
    * * an object with the following:
    * * * tags - a tag string or array of tag strings.
    * * * all - if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag).
    */
  var filter: js.UndefOr[String | js.Array[String] | All] = js.native
  /** (required) the event name string. */
  var name: T = js.native
  /**
    * if true, and the data object passed to server.event.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used
    * when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false).
    */
  var spread: js.UndefOr[Boolean] = js.native
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended
    * to the arguments list at the end. Defaults to the event registration option (which defaults to false).
    */
  var tags: js.UndefOr[Boolean] = js.native
}

object ServerEventCriteria {
  @scala.inline
  def apply[T](name: T): ServerEventCriteria[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventCriteria[T]]
  }
  @scala.inline
  implicit class ServerEventCriteriaOps[Self[t] <: ServerEventCriteria[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withName(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannels(value: String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: String | js.Array[String] | All): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withSpread(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpread: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

