package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Character extends js.Object {
  var character: ReactElement = js.native
}

object Character {
  @scala.inline
  def apply(character: ReactElement): Character = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
    __obj.asInstanceOf[Character]
  }
  @scala.inline
  implicit class CharacterOps[Self <: Character] (val x: Self) extends AnyVal {
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

