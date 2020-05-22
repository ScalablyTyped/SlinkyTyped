package typingsSlinky.reactSelect.groupMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ReactComponentClass[_]
  /** The children to be rendered. */
  var children: TagMod[Any]
  /** Props to pass to Heading. */
  var headingProps: js.Any
  /** Label to be displayed in the heading component. */
  var label: TagMod[Any]
}

object ComponentProps {
  @scala.inline
  def apply(
    Heading: ReactComponentClass[_],
    headingProps: js.Any,
    children: TagMod[Any] = null,
    label: TagMod[Any] = null
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any], headingProps = headingProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

