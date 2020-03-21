package typingsSlinky.reactNativeFlipCard.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackProps extends js.Object {
  var chilren: js.Array[ReactElement]
  var flipHorizontal: Boolean
  var flipVertical: Boolean
  var perspective: Double
}

object BackProps {
  @scala.inline
  def apply(
    chilren: js.Array[ReactElement],
    flipHorizontal: Boolean,
    flipVertical: Boolean,
    perspective: Double
  ): BackProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackProps]
  }
}

