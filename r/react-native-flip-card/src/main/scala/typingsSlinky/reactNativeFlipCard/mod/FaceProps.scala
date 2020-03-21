package typingsSlinky.reactNativeFlipCard.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceProps extends js.Object {
  var chilren: js.Array[ReactElement]
}

object FaceProps {
  @scala.inline
  def apply(chilren: js.Array[ReactElement]): FaceProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FaceProps]
  }
}

