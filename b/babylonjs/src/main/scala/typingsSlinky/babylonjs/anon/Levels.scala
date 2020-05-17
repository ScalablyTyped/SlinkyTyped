package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Levels extends js.Object {
  var levels: js.Array[TranscodedPixels] = js.native
}

object Levels {
  @scala.inline
  def apply(levels: js.Array[TranscodedPixels]): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
  @scala.inline
  implicit class LevelsOps[Self <: Levels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevels(value: js.Array[TranscodedPixels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

