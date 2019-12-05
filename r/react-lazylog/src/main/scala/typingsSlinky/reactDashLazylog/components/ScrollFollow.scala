package typingsSlinky.reactDashLazylog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLazylog.buildScrollFollowMod.ScrollFollowProps
import typingsSlinky.reactDashLazylog.buildScrollFollowMod.ScrollFollowRenderProps
import typingsSlinky.reactDashLazylog.buildScrollFollowMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollFollow
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/ScrollFollow", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    render: ScrollFollowRenderProps => TagMod[Any],
    startFollowing: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollFollowProps
}

