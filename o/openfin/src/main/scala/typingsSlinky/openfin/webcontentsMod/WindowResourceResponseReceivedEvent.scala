package typingsSlinky.openfin.webcontentsMod

import typingsSlinky.openfin.eventsBaseMod.WindowEvent
import typingsSlinky.openfin.openfinStrings.`object`
import typingsSlinky.openfin.openfinStrings.image
import typingsSlinky.openfin.openfinStrings.mainFrame
import typingsSlinky.openfin.openfinStrings.other
import typingsSlinky.openfin.openfinStrings.script
import typingsSlinky.openfin.openfinStrings.styleSheet
import typingsSlinky.openfin.openfinStrings.subFrame
import typingsSlinky.openfin.openfinStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowResourceResponseReceivedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var headers: js.Any = js.native
  var httpResponseCode: Double = js.native
  var newUrl: String = js.native
  var originalUrl: String = js.native
  var referrer: String = js.native
  var requestMethod: String = js.native
  var resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other = js.native
  var status: Boolean = js.native
}

object WindowResourceResponseReceivedEvent {
  @scala.inline
  def apply[Topic, Type](
    headers: js.Any,
    httpResponseCode: Double,
    name: String,
    newUrl: String,
    originalUrl: String,
    referrer: String,
    requestMethod: String,
    resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other,
    status: Boolean,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowResourceResponseReceivedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpResponseCode = httpResponseCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceResponseReceivedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowResourceResponseReceivedEventOps[Self[topic, `type`] <: WindowResourceResponseReceivedEvent[topic, `type`], Topic, Type] (val x: Self[Topic, Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Topic, Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Topic, Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Topic, Type]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Topic, Type]) with Other]
    @scala.inline
    def withHeaders(value: js.Any): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpResponseCode(value: Double): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewUrl(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalUrl(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestMethod(value: String): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Boolean): Self[Topic, Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

