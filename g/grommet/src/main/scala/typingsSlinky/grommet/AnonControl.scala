package typingsSlinky.grommet

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonControl extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var container: js.UndefOr[AnonExtend] = js.undefined
  var control: js.UndefOr[AnonOpen] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var icons: js.UndefOr[AnonDownMargin] = js.undefined
  var options: js.UndefOr[AnonContainerText] = js.undefined
  // https://github.com/DefinitelyTyped/DefinitelyTyped/issues/37506
  var searchInput: js.UndefOr[ReactElement] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object AnonControl {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    container: AnonExtend = null,
    control: AnonOpen = null,
    extend: ExtendType = null,
    icons: AnonDownMargin = null,
    options: AnonContainerText = null,
    searchInput: ReactElement = null,
    step: Int | Double = null
  ): AnonControl = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchInput != null) __obj.updateDynamic("searchInput")(searchInput.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonControl]
  }
}

