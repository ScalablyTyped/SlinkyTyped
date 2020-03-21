package typingsSlinky.reactBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactBootstrap.collapseMod.CollapseProps
import typingsSlinky.reactBootstrap.reactBootstrapStrings.height
import typingsSlinky.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrap.mod.Collapse] {
  @JSImport("react-bootstrap", "Collapse")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    dimension: height | width | js.Function0[String] = null,
    getDimensionValue: (/* dimension */ Double, /* element */ ReactElement) => Double = null,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    timeout: Int | Double = null,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Collapse] = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (getDimensionValue != null) __obj.updateDynamic("getDimensionValue")(js.Any.fromFunction2(getDimensionValue))
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Collapse] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBootstrap.mod.Collapse](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = CollapseProps
}

