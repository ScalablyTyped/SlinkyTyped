package typingsSlinky.reactDashBootstrap.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrap.libTabMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashBootstrap.libMod.Tab] {
  @JSImport("react-bootstrap/lib", "Tab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    `aria-labelledby`: String = null,
    bsClass: String = null,
    eventKey: js.Any = null,
    onEnter: /* node */ HTMLElement => _ = null,
    onEntered: /* node */ HTMLElement => _ = null,
    onEntering: /* node */ HTMLElement => _ = null,
    onExit: /* node */ HTMLElement => _ = null,
    onExited: /* node */ HTMLElement => _ = null,
    onExiting: /* node */ HTMLElement => _ = null,
    tabClassName: String = null,
    title: TagMod[Any] = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashBootstrap.libMod.Tab] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (tabClassName != null) __obj.updateDynamic("tabClassName")(tabClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashBootstrap.libMod.Tab] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashBootstrap.libMod.Tab](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabProps
}

