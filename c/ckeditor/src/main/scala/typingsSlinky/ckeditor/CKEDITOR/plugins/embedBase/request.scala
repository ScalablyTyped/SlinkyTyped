package typingsSlinky.ckeditor.CKEDITOR.plugins.embedBase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait request extends js.Object {
  var response: StringDictionary[String] = js.native
  var task: typingsSlinky.ckeditor.CKEDITOR.plugins.notificationAggregator.task = js.native
  var url: String = js.native
  def callback(): Unit = js.native
  def cancel(): Unit = js.native
  def errorCallback(error: String): Unit = js.native
}

object request {
  @scala.inline
  def apply(
    callback: () => Unit,
    cancel: () => Unit,
    errorCallback: String => Unit,
    response: StringDictionary[String],
    task: task,
    url: String
  ): request = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), cancel = js.Any.fromFunction0(cancel), errorCallback = js.Any.fromFunction1(errorCallback), response = response.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[request]
  }
  @scala.inline
  implicit class requestOps[Self <: request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withErrorCallback(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResponse(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

