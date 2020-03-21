package typingsSlinky.reactMove.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactMove.animateMod.IAnimateProps
import typingsSlinky.reactMove.animateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Animate
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-move/Animate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    start: js.Any,
    enter: js.Any = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any] = null,
    leave: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    update: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4(interpolation))
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAnimateProps
}

