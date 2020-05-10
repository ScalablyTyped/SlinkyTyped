package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyfill extends js.Object {
  var Blob: PolyfillBlob = js.native
  var Event: PolyfillEvent = js.native
  var Fetch: PolyfillFetch = js.native
  var File: PolyfillFile = js.native
  var FileReader: PolyfillFileReader = js.native
  var ProgressEvent: PolyfillProgressEvent = js.native
  var XMLHttpRequest: PolyfillXMLHttpRequest = js.native
}

object Polyfill {
  @scala.inline
  def apply(
    Blob: PolyfillBlob,
    Event: PolyfillEvent,
    Fetch: PolyfillFetch,
    File: PolyfillFile,
    FileReader: PolyfillFileReader,
    ProgressEvent: PolyfillProgressEvent,
    XMLHttpRequest: PolyfillXMLHttpRequest
  ): Polyfill = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], FileReader = FileReader.asInstanceOf[js.Any], ProgressEvent = ProgressEvent.asInstanceOf[js.Any], XMLHttpRequest = XMLHttpRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polyfill]
  }
  @scala.inline
  implicit class PolyfillOps[Self <: Polyfill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlob(value: PolyfillBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: PolyfillEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetch(value: PolyfillFetch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: PolyfillFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileReader(value: PolyfillFileReader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressEvent(value: PolyfillProgressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMLHttpRequest(value: PolyfillXMLHttpRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XMLHttpRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

