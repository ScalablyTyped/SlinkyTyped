package typingsSlinky.atMaterialDashUiCore.cssBaselineCssBaselineMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssBaselineProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
}

object CssBaselineProps {
  @scala.inline
  def apply(children: ReactElement = null): CssBaselineProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssBaselineProps]
  }
}

