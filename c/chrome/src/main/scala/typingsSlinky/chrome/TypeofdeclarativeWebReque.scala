package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.declarativeWebRequest.RequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdeclarativeWebReque extends js.Object {
  var onRequest: RequestedEvent = js.native
}

object TypeofdeclarativeWebReque {
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebReque = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeWebReque]
  }
  @scala.inline
  implicit class TypeofdeclarativeWebRequeOps[Self <: TypeofdeclarativeWebReque] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRequest(value: RequestedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

