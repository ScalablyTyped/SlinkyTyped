package typingsSlinky.reactDashHighlightDotJs.reactDashHighlightDotJsMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  /**
    * Content that will be highlighted
    */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /**
    * Language name to use as a class to signal type to highlight.js.
    */
  var language: String
}

object HighlightProps {
  @scala.inline
  def apply(language: String, children: TagMod[Any] = null): HighlightProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

