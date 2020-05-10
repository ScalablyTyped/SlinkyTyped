package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCharacter extends js.Object {
  var character: ReactElement = js.native
}

object AnonCharacter {
  @scala.inline
  def apply(character: ReactElement): AnonCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharacter]
  }
  @scala.inline
  implicit class AnonCharacterOps[Self <: AnonCharacter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacter(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

