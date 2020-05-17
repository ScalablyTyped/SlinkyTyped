package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharIndex extends js.Object {
  var charIndex: Double = js.native
  var lineIndex: Double = js.native
}

object CharIndex {
  @scala.inline
  def apply(charIndex: Double, lineIndex: Double): CharIndex = {
    val __obj = js.Dynamic.literal(charIndex = charIndex.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharIndex]
  }
  @scala.inline
  implicit class CharIndexOps[Self <: CharIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

