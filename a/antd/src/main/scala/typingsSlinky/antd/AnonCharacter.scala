package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacter extends js.Object {
  var character: ReactElement
}

object AnonCharacter {
  @scala.inline
  def apply(character: ReactElement): AnonCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharacter]
  }
}

