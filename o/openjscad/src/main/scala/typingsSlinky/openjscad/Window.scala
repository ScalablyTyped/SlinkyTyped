package typingsSlinky.openjscad

import org.scalajs.dom.experimental.URL
import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Worker: org.scalajs.dom.raw.Worker = js.native
  var requestFileSystem: js.Any = js.native
  var webkitRequestFileSystem: js.Any = js.native
  //    URL: URL;
  var webkitURL: URL = js.native
}

object Window {
  @scala.inline
  def apply(Worker: Worker, requestFileSystem: js.Any, webkitRequestFileSystem: js.Any, webkitURL: URL): Window = {
    val __obj = js.Dynamic.literal(Worker = Worker.asInstanceOf[js.Any], requestFileSystem = requestFileSystem.asInstanceOf[js.Any], webkitRequestFileSystem = webkitRequestFileSystem.asInstanceOf[js.Any], webkitURL = webkitURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorker(value: Worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestFileSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitRequestFileSystem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitRequestFileSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkitURL(value: URL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkitURL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

