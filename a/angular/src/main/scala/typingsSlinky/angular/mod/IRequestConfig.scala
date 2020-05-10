package typingsSlinky.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
@js.native
trait IRequestConfig extends IRequestShortcutConfig {
  /**
    * Event listeners to be bound to the XMLHttpRequest object.
    * To bind events to the XMLHttpRequest upload object, use uploadEventHandlers. The handler will be called in the context of a $apply block.
    */
  var eventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.native
  /**
    * HTTP method (e.g. 'GET', 'POST', etc)
    */
  var method: String = js.native
  /**
    * Event listeners to be bound to the XMLHttpRequest upload object.
    * To bind events to the XMLHttpRequest object, use eventHandlers. The handler will be called in the context of a $apply block.
    */
  var uploadEventHandlers: js.UndefOr[StringDictionary[EventListenerOrEventListenerObject]] = js.native
  /**
    * Absolute or relative URL of the resource that is being requested.
    */
  var url: String = js.native
}

object IRequestConfig {
  @scala.inline
  def apply(method: String, url: String): IRequestConfig = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestConfig]
  }
  @scala.inline
  implicit class IRequestConfigOps[Self <: IRequestConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventHandlers(value: StringDictionary[EventListenerOrEventListenerObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadEventHandlers(value: StringDictionary[EventListenerOrEventListenerObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadEventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadEventHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadEventHandlers")(js.undefined)
        ret
    }
  }
  
}

