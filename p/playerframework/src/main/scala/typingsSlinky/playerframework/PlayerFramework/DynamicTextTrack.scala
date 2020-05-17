package typingsSlinky.playerframework.PlayerFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicTextTrack extends js.Object {
  var label: String = js.native
  var language: String = js.native
  var stream: js.Any = js.native
  def augmentPayload(payload: js.Any, startTime: Double, endTime: Double): Unit = js.native
}

object DynamicTextTrack {
  @scala.inline
  def apply(augmentPayload: (js.Any, Double, Double) => Unit, label: String, language: String, stream: js.Any): DynamicTextTrack = {
    val __obj = js.Dynamic.literal(augmentPayload = js.Any.fromFunction3(augmentPayload), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTextTrack]
  }
  @scala.inline
  implicit class DynamicTextTrackOps[Self <: DynamicTextTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAugmentPayload(value: (js.Any, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentPayload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

