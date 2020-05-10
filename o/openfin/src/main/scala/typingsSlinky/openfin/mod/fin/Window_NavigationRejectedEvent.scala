package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.openfinStrings.`navigation-rejected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window_NavigationRejectedEvent extends js.Object {
  var name: String = js.native
  /**
    * source of navigation window name
    */
  var sourceName: String = js.native
  var topic: `navigation-rejected` = js.native
  /**
    * Url that was not reached "http://blocked-content.url"
    */
  var url: String = js.native
  /**
    * the UUID of the application the window belongs to.
    */
  var uuid: String = js.native
}

object Window_NavigationRejectedEvent {
  @scala.inline
  def apply(name: String, sourceName: String, topic: `navigation-rejected`, url: String, uuid: String): Window_NavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window_NavigationRejectedEvent]
  }
  @scala.inline
  implicit class Window_NavigationRejectedEventOps[Self <: Window_NavigationRejectedEvent] (val x: Self) extends AnyVal {
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
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: `navigation-rejected`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

