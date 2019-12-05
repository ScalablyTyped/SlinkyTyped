package typingsSlinky.grommet.componentsAccordionPanelMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.UndefOr[TagMod[Any]] = js.undefined
  var label: js.UndefOr[String | TagMod[Any]] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(header: TagMod[Any] = null, label: String | TagMod[Any] = null): AccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

