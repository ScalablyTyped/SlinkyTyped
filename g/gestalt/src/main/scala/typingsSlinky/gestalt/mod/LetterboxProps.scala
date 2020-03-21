package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterboxProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var contentAspectRatio: Double
  var height: Double
  var width: Double
}

object LetterboxProps {
  @scala.inline
  def apply(contentAspectRatio: Double, height: Double, width: Double, children: TagMod[Any] = null): LetterboxProps = {
    val __obj = js.Dynamic.literal(contentAspectRatio = contentAspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterboxProps]
  }
}

