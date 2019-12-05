package typingsSlinky.reactDashCoinhive.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCoinhive.reactDashCoinhiveMod.CoinHiveProps
import typingsSlinky.reactDashCoinhive.reactDashCoinhiveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCoinhive
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: src */
  def apply(
    siteKey: String,
    autoThreads: js.UndefOr[Boolean] = js.undefined,
    onInit: /* callback */ js.Any => Unit = null,
    onStart: /* callback */ js.Any => Unit = null,
    onStop: /* callback */ js.Any => Unit = null,
    run: js.UndefOr[Boolean] = js.undefined,
    threads: Int | Double = null,
    throttle: Int | Double = null,
    userName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
    if (!js.isUndefined(autoThreads)) __obj.updateDynamic("autoThreads")(autoThreads.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CoinHiveProps
}

