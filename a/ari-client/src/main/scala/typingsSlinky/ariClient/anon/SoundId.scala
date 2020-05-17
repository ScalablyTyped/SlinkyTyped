package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoundId extends js.Object {
  var soundId: String = js.native
}

object SoundId {
  @scala.inline
  def apply(soundId: String): SoundId = {
    val __obj = js.Dynamic.literal(soundId = soundId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundId]
  }
  @scala.inline
  implicit class SoundIdOps[Self <: SoundId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSoundId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

