package typingsSlinky.mapboxMapboxSdk.mapiRequestMod

import typingsSlinky.mapboxMapboxSdk.mapiErrorMod.MapiError
import typingsSlinky.mapboxMapboxSdk.mapiResponseMod.MapiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageCallbackFunction extends js.Object {
  var error: MapiError = js.native
  var response: MapiResponse = js.native
  def next(): Unit = js.native
}

object PageCallbackFunction {
  @scala.inline
  def apply(error: MapiError, next: () => Unit, response: MapiResponse): PageCallbackFunction = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageCallbackFunction]
  }
  @scala.inline
  implicit class PageCallbackFunctionOps[Self <: PageCallbackFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: MapiError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponse(value: MapiResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

