package typingsSlinky.reactOnsenui.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactOnsenui.HTMLAttributesidclassNameFixedContent
import typingsSlinky.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PullHook
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactOnsenui.mod.PullHook] {
  @JSImport("react-onsenui", "PullHook")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, style */
  def apply(
    fixedContent: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onChange: /* e */ PullHookChangeEvent => Unit = null,
    onLoad: /* done */ js.Function0[Unit] => Unit = null,
    onPull: () => Unit = null,
    thresholdHeight: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.PullHook] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixedContent)) __obj.updateDynamic("fixedContent")(fixedContent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onPull != null) __obj.updateDynamic("onPull")(js.Any.fromFunction0(onPull))
    if (thresholdHeight != null) __obj.updateDynamic("thresholdHeight")(thresholdHeight.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactOnsenui.mod.PullHook] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactOnsenui.mod.PullHook](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = HTMLAttributesidclassNameFixedContent
}

