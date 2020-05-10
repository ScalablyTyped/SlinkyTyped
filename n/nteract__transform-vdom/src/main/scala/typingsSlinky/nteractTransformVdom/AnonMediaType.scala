package typingsSlinky.nteractTransformVdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMediaType extends js.Object {
  var mediaType: String = js.native
  def onVDOMEvent(): Unit = js.native
}

object AnonMediaType {
  @scala.inline
  def apply(mediaType: String, onVDOMEvent: () => Unit): AnonMediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
    __obj.asInstanceOf[AnonMediaType]
  }
  @scala.inline
  implicit class AnonMediaTypeOps[Self <: AnonMediaType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVDOMEvent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVDOMEvent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

