package typingsSlinky.firebaseMessaging

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushMessageData extends js.Object {
  def arrayBuffer(): js.typedarray.ArrayBuffer = js.native
  def blob(): Blob = js.native
  def json(): js.Any = js.native
  def text(): String = js.native
}

object PushMessageData {
  @scala.inline
  def apply(
    arrayBuffer: () => js.typedarray.ArrayBuffer,
    blob: () => Blob,
    json: () => js.Any,
    text: () => String
  ): PushMessageData = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[PushMessageData]
  }
  @scala.inline
  implicit class PushMessageDataOps[Self <: PushMessageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: () => js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBlob(value: () => Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withJson(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

